/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jframe;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;

/**
 *
 * @author ASUS
 */
public class Rectangle extends Shape{
    
    private int width, height;
    private Point p1, p2;
    public Rectangle(Point p1, Point p2)
    {
        this.p1 = new Point(p1);
        this.p2 = new Point(p2);
    }
    public  Rectangle(int x1, int y1, int x2, int y2)
    {
        this.p1 = new Point(x1, y1);
        this.p2 = new Point(x2, y2);
    }
    public Rectangle()
    {
        p1 = new Point();
        p2 = new Point();
    }
    public int getHeight()
    {
        return (p2.getY() - p1.getY());
    }
    
    public int getWidth()
    {
        return (p2.getX() - p1.getX());
    }
    public  BufferedImage draw(BufferedImage bf, Color color)
    {  
        System.out.println("ve");
        BufferedImage bftemp = new BufferedImage(bf.getWidth(), bf.getHeight(), BufferedImage.TYPE_INT_RGB);
        Graphics2D g = (Graphics2D) bftemp.getGraphics();
        g.drawImage(bf, null, 0, 0);
        g.setColor(color);
        g.drawRect(p1.getX(), p1.getY(), this.getWidth(), this.getHeight());
        System.out.println(p2.getX() +" " + p2.getY());
        g.dispose();
        return bftemp;
    }
    public void setPoint1(int x, int y)
    {
        p1.setX(x);
        p1.setY(y);
    } 
    public void setPoint2(int x, int y)
    {
        p2.setX(x);
        p2.setY(y);
    }
    
    public static BufferedImage copyImage(BufferedImage source){
    BufferedImage b = new BufferedImage(source.getWidth(), source.getHeight(), source.getType());
    Graphics g = b.getGraphics();
    g.drawImage(source, 0, 0, null);
    g.dispose();
    return b;
}
    
}
