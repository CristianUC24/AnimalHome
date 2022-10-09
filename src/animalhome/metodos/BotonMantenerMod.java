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
import java.awt.RenderingHints;
import java.awt.Shape;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.geom.Area;
import java.awt.geom.Rectangle2D;
import java.awt.geom.RoundRectangle2D;
import java.awt.image.BufferedImage;
import javax.swing.Icon;
import javax.swing.JToggleButton;
import javax.swing.Timer;
import javax.swing.border.EmptyBorder;

public class BotonMantenerMod extends JToggleButton {

    public float getSizeSpeed() {
        return sizeSpeed;
    }

    public void setSizeSpeed(float sizeSpeed) {
        this.sizeSpeed = sizeSpeed;
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

    public Color getHover() {
        return hover;
    }

    public void setHover(Color hover) {
        this.hover = hover;
    }

    public Icon getImagenInicio() {
        return imagenInicio;
    }

    public void setImagenInicio(Icon imagenInicio) {
        this.imagenInicio = imagenInicio;
    }

    public Icon getImagenClick() {
        return imagenClick;
    }

    public void setImagenClick(Icon imagenClick) {
        this.imagenClick = imagenClick;
    }

    public Color getColorfont() {
        return Colorfont;
    }

    public void setColorfont(Color Colorfont) {
        this.Colorfont = Colorfont;
    }

    public Color getFondo() {
        return fondo;
    }

    public void setFondo(Color fondo) {
        this.fondo = fondo;
    }

    public Color getLetra() {
        return letra;
    }

    public void setLetra(Color letra) {
        this.letra = letra;
    }
    
    
    
    
    private Color fondo = new Color(255,255,255);
    private Color letra = new Color(0,0,0);
    private Color hover = new Color(0, 0, 0);
    private Color Colorfont = new Color(255,255,255);
    private Icon imagenInicio;
    private Icon imagenClick;
    private Timer timer = null;
    private Timer timerPressed = null;
    private float alpha = 0.3f;
    private boolean mouseOver;
    private boolean pressed;
    private float pressedSize;
    private float sizeSpeed = 10f;
    private float alphaPressed = 0.5f;
    private int redonarribaizquierda = 20;
    private int redonarribaderrecha = 20;
    private int redonabajoizquierda = 20;
    private int redonabajoderrecha = 20;

    public BotonMantenerMod() {
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
            public void mousePressed(MouseEvent me) {
                pressedSize = 0;
                alphaPressed = 0.5f;
                pressed = true;
                timerPressed.setDelay(0);
                timerPressed.start();
            }
        });
        timer = new Timer(40, (var ae) -> {
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
        });
        timerPressed = new Timer(0, (ActionEvent ae) -> {
            pressedSize += getSizeSpeed();
            if (alphaPressed <= 0) {
                pressed = false;
                timerPressed.stop();
            } else {
                repaint();
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
        
        if (isSelected()) {
            g2.setPaint(hover);
            setForeground(Colorfont);
            setIcon(imagenClick);
        } else {
            setIcon(imagenInicio);
            g2.setPaint(fondo);
            setForeground(letra);
        }
        //  Create Gradients Color
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

        if (isSelected()) {
            g2.setColor(fondo);
            
        }
        {
            g2.setColor(fondo);
        }
        g2.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_ATOP, alphaPressed));
        float x = (getWidth() / 2) - (pressedSize / 2);
        float y = (getHeight() / 2) - (pressedSize / 2);
        g2.fillRect((int) 0, (int) y, (int) pressedSize, (int) pressedSize);
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
