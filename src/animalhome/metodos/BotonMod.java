/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package animalhome.metodos;

import java.awt.AlphaComposite;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.RenderingHints;
import java.awt.Shape;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.geom.Area;
import java.awt.geom.Path2D;
import java.awt.geom.Rectangle2D;
import java.awt.geom.RoundRectangle2D;
import java.awt.image.BufferedImage;
import javax.swing.JButton;
import javax.swing.Timer;
import javax.swing.border.EmptyBorder;

public class BotonMod extends JButton {

    public float getSizeSpeed() {
        return sizeSpeed;
    }

    public void setSizeSpeed(float sizeSpeed) {
        this.sizeSpeed = sizeSpeed;
    }

    public Color getColor1() {
        return color1;
    }

    public void setColor1(Color color1) {
        this.color1 = color1;
    }

    public Color getColor2() {
        return color2;
    }

    public void setColor2(Color color2) {
        this.color2 = color2;
        this.cache = color2;
    }

    public int getRedonarribaizquierda() {
        return redonarribaizquierda;
    }

    public void setRedonarribaizquierda(int redonarribaizquierda) {
        this.redonarribaizquierda = redonarribaizquierda;
    }

    public int getRedonarribaderrecha() {
        return redonarribaderrecha;
    }

    public void setRedonarribaderrecha(int redonarribaderrecha) {
        this.redonarribaderrecha = redonarribaderrecha;
    }

    public int getRedonabajoderrecha() {
        return redonabajoderrecha;
    }

    public void setRedonabajoderrecha(int redonabajoderrecha) {
        this.redonabajoderrecha = redonabajoderrecha;
    }

    public int getRedonabajoizquierda() {
        return redonabajoizquierda;
    }

    public void setRedonabajoizquierda(int redonabajoizquierda) {
        this.redonabajoizquierda = redonabajoizquierda;
    }

    public boolean isClick() {
        return click;
    }

    public void setClick(boolean click) {
        this.click = click;
    }

    public Color getColor3() {
        return color3;
    }

    public void setColor3(Color color3) {
        this.color3 = color3;
    }

    public int getDegrade() {
        return degrade;
    }

    public void setDegrade(int degrade) {
        this.degrade = degrade;
    }
    
    
    
    private boolean click = false;
    private Color color1 = Color.decode("#0099F7");
    private Color color2 = Color.decode("#F11712");
    private Color color3 = new Color(0, 0, 0);
    private Color cache = color2;
    private final Timer timer;
    private final Timer timerPressed;
    private float alpha = 0.3f;
    private boolean mouseOver;
    private boolean pressed;
    private Point pressedLocation;
    private float pressedSize;
    private float sizeSpeed = 1f;
    private float alphaPressed = 0.5f;
    private int redonarribaizquierda = 20;
    private int redonarribaderrecha = 20;
    private int redonabajoizquierda = 20;
    private int redonabajoderrecha = 20;
    private int degrade = getWidth();
    
    public void evnclick() {
        if (click == false) {
            
            color2 = color3;
            click = true;
        } else {
            color2 = cache;
            click = false;
        }
        repaint();
    }

    public BotonMod() {
        setContentAreaFilled(false);
        setForeground(Color.WHITE);
        setCursor(new Cursor(Cursor.HAND_CURSOR));
        setBorder(new EmptyBorder(10, 20, 10, 20));
        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent me) {
                mouseOver = true;
                timer.start();
            }

            @Override
            public void mouseExited(MouseEvent me) {
                mouseOver = false;
                timer.start();
            }

            @Override
            public void mouseClicked(MouseEvent me) {
                evnclick();
            }

            @Override
            public void mousePressed(MouseEvent me) {
                pressedSize = 0;
                alphaPressed = 0.5f;
                pressed = true;
                pressedLocation = me.getPoint();
                timerPressed.setDelay(0);
                timerPressed.start();
            }
        });
        timer = new Timer(40, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                if (mouseOver) {
                    if (alpha < 0.6f) {
                        alpha += 0.05f;
                        repaint();
                    } else {
                        alpha = 0.6f;
                        timer.stop();
                        repaint();
                    }
                } else {
                    if (alpha > 0.3f) {
                        alpha -= 0.05f;
                        repaint();
                    } else {
                        alpha = 0.3f;
                        timer.stop();
                        repaint();
                    }
                }
            }
        });
        timerPressed = new Timer(0, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                pressedSize += getSizeSpeed();
                if (alphaPressed <= 0) {
                    pressed = false;
                    timerPressed.stop();
                } else {
                    repaint();
                }
            }
        });
    }

    @Override
    protected void paintComponent(Graphics grphcs) {
        int width = getWidth();
        int height = getHeight();
        BufferedImage img = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);
        Graphics2D g2 = img.createGraphics();
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        //  Create Gradients Color
        GradientPaint gra = new GradientPaint(0, 0, color1, degrade, 0, color2);
        g2.setPaint(gra);
        Area area = new Area(createRoundTopLeft());
        if (redonarribaderrecha > 0) {
            area.intersect(new Area(createRoundTopRight()));
        }
        if (redonabajoizquierda > 0) {
            area.intersect(new Area(createRoundBottomLeft()));
        }
        if (redonabajoderrecha > 0) {
            area.intersect(new Area(createRoundBottomRight()));
        }
        g2.fill(area);
        //  Add Style

        if (pressed) {
            paintPressed(g2);
        }
        g2.dispose();
        grphcs.drawImage(img, 0, 0, null);
        super.paintComponent(grphcs);
    }



    private void paintPressed(Graphics2D g2) {
        if ((getWidth() / 2) - (pressedSize / 2) < 0 && (getWidth() / 2) + (pressedSize / 2) > getWidth()) {
            timerPressed.setDelay(20);
            alphaPressed -= 0.05f;
            if (alphaPressed < 0) {
                alphaPressed = 0;
            }
        }
        g2.setColor(Color.WHITE);
        g2.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_ATOP, alphaPressed));
        float x = (getWidth() / 2) - (pressedSize / 2);
        float y = (getHeight() / 2) - (pressedSize / 2);
        g2.fillOval((int) x, (int) y, (int) pressedSize, (int) pressedSize);
    }

    private Shape createRoundTopLeft() {
        int width = getWidth();
        int height = getHeight();
        int roundX = Math.min(width, redonarribaizquierda);
        int roundY = Math.min(height, redonarribaizquierda);
        Area area = new Area(new RoundRectangle2D.Double(0, 0, width, height, roundX, roundY));
        area.add(new Area(new Rectangle2D.Double(roundX / 2, 0, width - roundX / 2, height)));
        area.add(new Area(new Rectangle2D.Double(0, roundY / 2, width, height - roundY / 2)));
        return area;
    }

    private Shape createRoundTopRight() {
        int width = getWidth();
        int height = getHeight();
        int roundX = Math.min(width, redonarribaderrecha);
        int roundY = Math.min(height, redonarribaderrecha);
        Area area = new Area(new RoundRectangle2D.Double(0, 0, width, height, roundX, roundY));
        area.add(new Area(new Rectangle2D.Double(0, 0, width - roundX / 2, height)));
        area.add(new Area(new Rectangle2D.Double(0, roundY / 2, width, height - roundY / 2)));
        return area;
    }

    private Shape createRoundBottomLeft() {
        int width = getWidth();
        int height = getHeight();
        int roundX = Math.min(width, redonabajoizquierda);
        int roundY = Math.min(height, redonabajoizquierda);
        Area area = new Area(new RoundRectangle2D.Double(0, 0, width, height, roundX, roundY));
        area.add(new Area(new Rectangle2D.Double(roundX / 2, 0, width - roundX / 2, height)));
        area.add(new Area(new Rectangle2D.Double(0, 0, width, height - roundY / 2)));
        return area;
    }

    private Shape createRoundBottomRight() {
        int width = getWidth();
        int height = getHeight();
        int roundX = Math.min(width, redonabajoderrecha);
        int roundY = Math.min(height, redonabajoderrecha);
        Area area = new Area(new RoundRectangle2D.Double(0, 0, width, height, roundX, roundY));
        area.add(new Area(new Rectangle2D.Double(0, 0, width - roundX / 2, height)));
        area.add(new Area(new Rectangle2D.Double(0, 0, width, height - roundY / 2)));
        return area;
    }
}
