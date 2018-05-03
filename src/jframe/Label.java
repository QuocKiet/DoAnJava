/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jframe;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 *
 * @author ASUS
 */
public class Label extends Jframe {
    
    public Label()
    {
        this.setSize(400, 200);
        setResizable(false);
        setLocation(500,300);
        JLabel label = new JLabel("Hello");
        add(label);
        int w = label.getSize().width;
        int h = label.getSize().height;
        label.setSize(350, 200);
        try {
            BufferedImage image = ImageIO.read( new File("image.jpg"));
            int ix = image.getWidth();
            int iy = image.getHeight();
            
            int dx = 0;
            int dy = 0;
            
            ImageIcon icon = new ImageIcon(image.getScaledInstance(250, 150, image.SCALE_SMOOTH));
            label.setIcon(icon);
        } catch (IOException ex) {
            Logger.getLogger(Label.class.getName()).log(Level.SEVERE, null, ex);
        }
   
        setDefaultCloseOperation(Jframe.EXIT_ON_CLOSE);
    }
    
    public static void main(String[] args)
    {
        Label l = new Label();
        l.setVisible(true);
        
    }
    
}
