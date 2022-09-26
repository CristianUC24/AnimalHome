package animalhome.metodos;

/**
 *
 * @author Cristian Franco
 */

import java.awt.image.Raster;
import java.io.IOException;
import java.net.URL;
import javax.imageio.ImageIO;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GraphicsConfiguration;
import java.awt.GraphicsEnvironment;
import java.awt.RenderingHints;
import java.awt.Transparency;
import java.awt.image.BufferedImage;
import java.awt.image.ColorModel;
import java.awt.image.WritableRaster;
import javax.swing.JPanel;

public class Sombra extends JPanel {

    public ShadowType getShadowType() {
        return shadowType;
    }

    public void setShadowType(ShadowType shadowType) {
        this.shadowType = shadowType;
    }

    public int getShadowSize() {
        return shadowSize;
    }

    public void setShadowSize(int shadowSize) {
        this.shadowSize = shadowSize;
    }

    public float getShadowOpacity() {
        return shadowOpacity;
    }

    public void setShadowOpacity(float shadowOpacity) {
        this.shadowOpacity = shadowOpacity;
    }

    public Color getShadowColor() {
        return shadowColor;
    }

    public void setShadowColor(Color shadowColor) {
        this.shadowColor = shadowColor;
    }

    public int getBorde() {
        return borde;
    }

    public void setBorde(int borde) {
        this.borde = borde;
    }
    
    

    private ShadowType shadowType = ShadowType.CENTER;
    private int shadowSize = 6;
    private float shadowOpacity = 0.5f;
    private Color shadowColor = Color.BLACK;
    private int borde= 20;

    public Sombra() {
        setOpaque(false);
    }

    @Override
    protected void paintComponent(Graphics grphcs) {
        createShadow(grphcs);
        super.paintComponent(grphcs);
    }

    private void createShadow(Graphics grphcs) {
        Graphics2D g2 = (Graphics2D) grphcs;
        int size = shadowSize * 2;
        int x = 0;
        int y = 0;
        int width = getWidth() - size;
        int height = getHeight() - size;
        if (null == shadowType) {
            
            x = shadowSize;
            y = shadowSize;
        } else switch (shadowType) {
            case TOP -> {
                x = shadowSize;
                y = size;
            }
            case BOT -> {
                x = shadowSize;
                y = 0;
            }
            case TOP_LEFT -> {
                x = size;
                y = size;
            }
            case TOP_RIGHT -> {
                x = 0;
                y = size;
            }
            case BOT_LEFT -> {
                x = size;
                y = 0;
            }
            case BOT_RIGHT -> {
                x = 0;
                y = 0;
            }
            default -> {
                x = shadowSize;
                y = shadowSize;
            }
        }
        BufferedImage img = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);
        Graphics2D g = img.createGraphics();
        g.setColor(getBackground());
        g.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g.fillRoundRect(0, 0, width, height, borde, borde);
        
        ShadowRenderer render = new ShadowRenderer(shadowSize, shadowOpacity, shadowColor);
        g2.drawImage(render.createShadow(img), 0, 0, null);
        g2.drawImage(img, x, y, null);
    }

    public class ShadowRenderer {


        private int size = 5;


        private float opacity = 0.5f;


        private Color color = Color.BLACK;

        public ShadowRenderer() {
            this(5, 0.5f, Color.BLACK);
        }

        public ShadowRenderer(final int size, final float opacity, final Color color) {
            this.size = size;
            this.opacity = opacity;
            this.color = color;
        }

        public Color getColor() {
            return color;
        }

        public float getOpacity() {
            return opacity;
        }

        public int getSize() {
            return size;
        }

        public BufferedImage createShadow(final BufferedImage image) {

            int shadowSize = size * 2;

            int srcWidth = image.getWidth();
            int srcHeight = image.getHeight();

            int dstWidth = srcWidth + shadowSize;
            int dstHeight = srcHeight + shadowSize;

            int left = size;
            int right = shadowSize - left;

            int yStop = dstHeight - right;

            int shadowRgb = color.getRGB() & 0x00FFFFFF;
            int[] aHistory = new int[shadowSize];
            int historyIdx;

            int aSum;

            BufferedImage dst = new BufferedImage(dstWidth, dstHeight,
                    BufferedImage.TYPE_INT_ARGB);

            int[] dstBuffer = new int[dstWidth * dstHeight];
            int[] srcBuffer = new int[srcWidth * srcHeight];

            GraphicsUtilities.getPixels(image, 0, 0, srcWidth, srcHeight, srcBuffer);

            int lastPixelOffset = right * dstWidth;
            float hSumDivider = 1.0f / shadowSize;
            float vSumDivider = opacity / shadowSize;

            int[] hSumLookup = new int[256 * shadowSize];
            for (int i = 0; i < hSumLookup.length; i++) {
                hSumLookup[i] = (int) (i * hSumDivider);
            }

            int[] vSumLookup = new int[256 * shadowSize];
            for (int i = 0; i < vSumLookup.length; i++) {
                vSumLookup[i] = (int) (i * vSumDivider);
            }

            int srcOffset;


            for (int srcY = 0, dstOffset = left * dstWidth; srcY < srcHeight; srcY++) {


                for (historyIdx = 0; historyIdx < shadowSize;) {
                    aHistory[historyIdx++] = 0;
                }

                aSum = 0;
                historyIdx = 0;
                srcOffset = srcY * srcWidth;

                for (int srcX = 0; srcX < srcWidth; srcX++) {

                    int a = hSumLookup[aSum];
                    dstBuffer[dstOffset++] = a << 24; 

                    aSum -= aHistory[historyIdx]; 

                    a = srcBuffer[srcOffset + srcX] >>> 24;
                    aHistory[historyIdx] = a;   
                    aSum += a;              

                    if (++historyIdx >= shadowSize) {
                        historyIdx -= shadowSize;
                    }
                }

                for (int i = 0; i < shadowSize; i++) {

                    int a = hSumLookup[aSum];
                    dstBuffer[dstOffset++] = a << 24;

                    aSum -= aHistory[historyIdx];

                    if (++historyIdx >= shadowSize) {
                        historyIdx -= shadowSize;
                    }
                }
            }


            for (int x = 0, bufferOffset = 0; x < dstWidth; x++, bufferOffset = x) {

                aSum = 0;


                for (historyIdx = 0; historyIdx < left;) {
                    aHistory[historyIdx++] = 0;
                }

                
                for (int y = 0; y < right; y++, bufferOffset += dstWidth) {
                    int a = dstBuffer[bufferOffset] >>> 24;         
                    aHistory[historyIdx++] = a;                     
                    aSum += a;                                      
                }

                bufferOffset = x;
                historyIdx = 0;

            
                for (int y = 0; y < yStop; y++, bufferOffset += dstWidth) {

                    int a = vSumLookup[aSum];
                    dstBuffer[bufferOffset] = a << 24 | shadowRgb;  

                    aSum -= aHistory[historyIdx];   

                    a = dstBuffer[bufferOffset + lastPixelOffset] >>> 24;  
                    aHistory[historyIdx] = a;                              
                    aSum += a;                                             

                    if (++historyIdx >= shadowSize) {
                        historyIdx -= shadowSize;
                    }
                }

                
                for (int y = yStop; y < dstHeight; y++, bufferOffset += dstWidth) {

                    int a = vSumLookup[aSum];
                    dstBuffer[bufferOffset] = a << 24 | shadowRgb;

                    aSum -= aHistory[historyIdx];   

                    if (++historyIdx >= shadowSize) {
                        historyIdx -= shadowSize;
                    }
                }
            }

            GraphicsUtilities.setPixels(dst, 0, 0, dstWidth, dstHeight, dstBuffer);
            return dst;
        }
    }

    public class GraphicsUtilities {

        public GraphicsUtilities() {
        }

        
        public static GraphicsConfiguration getGraphicsConfiguration() {
            return GraphicsEnvironment.getLocalGraphicsEnvironment().
                    getDefaultScreenDevice().getDefaultConfiguration();
        }

       
        public static BufferedImage createColorModelCompatibleImage(BufferedImage image) {
            ColorModel cm = image.getColorModel();
            return new BufferedImage(cm,
                    cm.createCompatibleWritableRaster(image.getWidth(),
                            image.getHeight()),
                    cm.isAlphaPremultiplied(), null);
        }

       
        public static BufferedImage createCompatibleImage(BufferedImage image) {
            return createCompatibleImage(image, image.getWidth(), image.getHeight());
        }

    
        public static BufferedImage createCompatibleImage(BufferedImage image,
                int width, int height) {
            return getGraphicsConfiguration().createCompatibleImage(width, height,
                    image.getTransparency());
        }

        public static BufferedImage createCompatibleImage(int width, int height) {
            return getGraphicsConfiguration().createCompatibleImage(width, height);
        }

        public static BufferedImage createCompatibleTranslucentImage(int width,
                int height) {
            return getGraphicsConfiguration().createCompatibleImage(width, height,
                    Transparency.TRANSLUCENT);
        }

        public static BufferedImage loadCompatibleImage(URL resource)
                throws IOException {
            BufferedImage image = ImageIO.read(resource);
            return toCompatibleImage(image);
        }

      
        public static BufferedImage toCompatibleImage(BufferedImage image) {
            if (image.getColorModel().equals(
                    getGraphicsConfiguration().getColorModel())) {
                return image;
            }

            BufferedImage compatibleImage
                    = getGraphicsConfiguration().createCompatibleImage(
                            image.getWidth(), image.getHeight(),
                            image.getTransparency());
            Graphics g = compatibleImage.getGraphics();
            g.drawImage(image, 0, 0, null);
            g.dispose();

            return compatibleImage;
        }

   
        public static BufferedImage createThumbnailFast(BufferedImage image,
                int newSize) {
            float ratio;
            int width = image.getWidth();
            int height = image.getHeight();

            if (width > height) {
                if (newSize >= width) {
                    throw new IllegalArgumentException("newSize must be lower than"
                            + " the image width");
                } else if (newSize <= 0) {
                    throw new IllegalArgumentException("newSize must"
                            + " be greater than 0");
                }

                ratio = (float) width / (float) height;
                width = newSize;
                height = (int) (newSize / ratio);
            } else {
                if (newSize >= height) {
                    throw new IllegalArgumentException("newSize must be lower than"
                            + " the image height");
                } else if (newSize <= 0) {
                    throw new IllegalArgumentException("newSize must"
                            + " be greater than 0");
                }

                ratio = (float) height / (float) width;
                height = newSize;
                width = (int) (newSize / ratio);
            }

            BufferedImage temp = createCompatibleImage(image, width, height);
            Graphics2D g2 = temp.createGraphics();
            g2.setRenderingHint(RenderingHints.KEY_INTERPOLATION,
                    RenderingHints.VALUE_INTERPOLATION_BILINEAR);
            g2.drawImage(image, 0, 0, temp.getWidth(), temp.getHeight(), null);
            g2.dispose();

            return temp;
        }

     
        public static BufferedImage createThumbnailFast(BufferedImage image,
                int newWidth, int newHeight) {
            if (newWidth >= image.getWidth()
                    || newHeight >= image.getHeight()) {
                throw new IllegalArgumentException("newWidth and newHeight cannot"
                        + " be greater than the image"
                        + " dimensions");
            } else if (newWidth <= 0 || newHeight <= 0) {
                throw new IllegalArgumentException("newWidth and newHeight must"
                        + " be greater than 0");
            }

            BufferedImage temp = createCompatibleImage(image, newWidth, newHeight);
            Graphics2D g2 = temp.createGraphics();
            g2.setRenderingHint(RenderingHints.KEY_INTERPOLATION,
                    RenderingHints.VALUE_INTERPOLATION_BILINEAR);
            g2.drawImage(image, 0, 0, temp.getWidth(), temp.getHeight(), null);
            g2.dispose();

            return temp;
        }

       
        public static BufferedImage createThumbnail(BufferedImage image,
                int newSize) {
            int width = image.getWidth();
            int height = image.getHeight();

            boolean isWidthGreater = width > height;

            if (isWidthGreater) {
                if (newSize >= width) {
                    throw new IllegalArgumentException("newSize must be lower than"
                            + " the image width");
                }
            } else if (newSize >= height) {
                throw new IllegalArgumentException("newSize must be lower than"
                        + " the image height");
            }

            if (newSize <= 0) {
                throw new IllegalArgumentException("newSize must"
                        + " be greater than 0");
            }

            float ratioWH = (float) width / (float) height;
            float ratioHW = (float) height / (float) width;

            BufferedImage thumb = image;

            do {
                if (isWidthGreater) {
                    width /= 2;
                    if (width < newSize) {
                        width = newSize;
                    }
                    height = (int) (width / ratioWH);
                } else {
                    height /= 2;
                    if (height < newSize) {
                        height = newSize;
                    }
                    width = (int) (height / ratioHW);
                }

                BufferedImage temp = createCompatibleImage(image, width, height);
                Graphics2D g2 = temp.createGraphics();
                g2.setRenderingHint(RenderingHints.KEY_INTERPOLATION,
                        RenderingHints.VALUE_INTERPOLATION_BILINEAR);
                g2.drawImage(thumb, 0, 0, temp.getWidth(), temp.getHeight(), null);
                g2.dispose();

                thumb = temp;
            } while (newSize != (isWidthGreater ? width : height));

            return thumb;
        }

        public static BufferedImage createThumbnail(BufferedImage image,
                int newWidth, int newHeight) {
            int width = image.getWidth();
            int height = image.getHeight();

            if (newWidth >= width || newHeight >= height) {
                throw new IllegalArgumentException("newWidth and newHeight cannot"
                        + " be greater than the image"
                        + " dimensions");
            } else if (newWidth <= 0 || newHeight <= 0) {
                throw new IllegalArgumentException("newWidth and newHeight must"
                        + " be greater than 0");
            }

            BufferedImage thumb = image;

            do {
                if (width > newWidth) {
                    width /= 2;
                    if (width < newWidth) {
                        width = newWidth;
                    }
                }

                if (height > newHeight) {
                    height /= 2;
                    if (height < newHeight) {
                        height = newHeight;
                    }
                }

                BufferedImage temp = createCompatibleImage(image, width, height);
                Graphics2D g2 = temp.createGraphics();
                g2.setRenderingHint(RenderingHints.KEY_INTERPOLATION,
                        RenderingHints.VALUE_INTERPOLATION_BILINEAR);
                g2.drawImage(thumb, 0, 0, temp.getWidth(), temp.getHeight(), null);
                g2.dispose();

                thumb = temp;
            } while (width != newWidth || height != newHeight);

            return thumb;
        }

      
        public static int[] getPixels(BufferedImage img,
                int x, int y, int w, int h, int[] pixels) {
            if (w == 0 || h == 0) {
                return new int[0];
            }

            if (pixels == null) {
                pixels = new int[w * h];
            } else if (pixels.length < w * h) {
                throw new IllegalArgumentException("pixels array must have a length"
                        + " >= w*h");
            }

            int imageType = img.getType();
            if (imageType == BufferedImage.TYPE_INT_ARGB
                    || imageType == BufferedImage.TYPE_INT_RGB) {
                Raster raster = img.getRaster();
                return (int[]) raster.getDataElements(x, y, w, h, pixels);
            }

            // Unmanages the image
            return img.getRGB(x, y, w, h, pixels, 0, w);
        }

      
        public static void setPixels(BufferedImage img,
                int x, int y, int w, int h, int[] pixels) {
            if (pixels == null || w == 0 || h == 0) {
                return;
            } else if (pixels.length < w * h) {
                throw new IllegalArgumentException("pixels array must have a length"
                        + " >= w*h");
            }

            int imageType = img.getType();
            if (imageType == BufferedImage.TYPE_INT_ARGB
                    || imageType == BufferedImage.TYPE_INT_RGB) {
                WritableRaster raster = img.getRaster();
                raster.setDataElements(x, y, w, h, pixels);
            } else {
     
                img.setRGB(x, y, w, h, pixels, 0, w);
            }
        }
    }

    public enum ShadowType {
        CENTER, TOP_RIGHT, TOP_LEFT, BOT_RIGHT, BOT_LEFT, BOT, TOP
    }
}
