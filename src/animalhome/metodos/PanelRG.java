/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package animalhome.metodos;

import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.Shape;
import java.awt.geom.Area;
import java.awt.geom.Rectangle2D;
import java.awt.geom.RoundRectangle2D;
import javax.swing.JPanel;

public class PanelRG extends JPanel {

    public int getRedonarribaizquierda() {
        return redonarribaizquierda;
    }

    public void setRedonarribaizquierda(int redonarribaizquierda) {
        this.redonarribaizquierda = redonarribaizquierda;
        repaint();
    }

    public int getRedonarribaderrecha() {
        return redonarribaderrecha;
    }

    public void setRedonarribaderrecha(int redonarribaderrecha) {
        this.redonarribaderrecha = redonarribaderrecha;
        repaint();
    }

    public int getRedonabajoizquierda() {
        return redonabajoizquierda;
    }

    public void setRedonabajoizquierda(int redonabajoizquierda) {
        this.redonabajoizquierda = redonabajoizquierda;
        repaint();
    }

    public int getRedonabajoderrecha() {
        return redonabajoderrecha;
    }

    public void setRedonabajoderrecha(int redonabajoderrecha) {
        this.redonabajoderrecha = redonabajoderrecha;
        repaint();
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
    }

    public int getInclinacion() {
        return inclinacion;
    }

    public void setInclinacion(int inclinacion) {
        this.inclinacion = inclinacion;
    }

    public int getDegrade() {
        return degrade;
    }

    public void setDegrade(int degrade) {
        this.degrade = degrade;
    }
    
    
    

    private int redonarribaizquierda = 20;
    private int redonarribaderrecha = 20;
    private int redonabajoizquierda = 20;
    private int redonabajoderrecha = 20;
    private Color color1 = Color.decode("#0099F7");
    private Color color2 = Color.decode("#F11712");
    private int inclinacion = 0;
    private int degrade = 0;
    
    public PanelRG() {
        setOpaque(false);
    }

    @Override
    protected void paintComponent(Graphics grphcs) {
        Graphics2D g2 = (Graphics2D) grphcs.create();
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        GradientPaint gra = new GradientPaint(0, 0+inclinacion, color1, getWidth()-degrade, getHeight()-inclinacion, color2);
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
        g2.dispose();
        super.paintComponent(grphcs);
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
