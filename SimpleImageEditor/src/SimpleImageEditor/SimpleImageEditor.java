package SimpleImageEditor;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Point;
import java.awt.image.BufferedImage;
import java.awt.image.BufferedImageOp;
import java.awt.image.ConvolveOp;
import java.awt.image.Kernel;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.*;

public class SimpleImageEditor extends javax.swing.JFrame {

    JFileChooser choose = new JFileChooser();
    BufferedImageOp convol;
    int filterchoose;
    float[] kernel;
    int paintchoose = 0;
    Graphics2D g;
    Color c = Color.BLACK;
    BasicStroke s = new BasicStroke(5);
    Point old = null;
    Point current = null;
    JTextArea text;
    ArrayList<BufferedImage> listG = new ArrayList<BufferedImage>();
    int currentG = 0;
    public SimpleImageEditor() {
        initComponents();
        ImageIcon icon = new ImageIcon("src\\default_image\\white.png");
        Image out = icon.getImage().getScaledInstance(jLabel2.getWidth(), jLabel2.getHeight(), Image.SCALE_SMOOTH);
        icon = new ImageIcon(out);
        jLabel2.setIcon(icon);
        text = new JTextArea("");
        BufferedImage mshi = new BufferedImage(jLabel2.getWidth(), jLabel2.getHeight(), BufferedImage.TYPE_INT_RGB);
        g = mshi.createGraphics();
        jLabel2.getIcon().paintIcon(null, g, 0, 0);
        listG.add(mshi);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        processButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        loadimageButton = new javax.swing.JButton();
        gaussianButton = new javax.swing.JRadioButton();
        edgesButton = new javax.swing.JRadioButton();
        sharpenButton = new javax.swing.JRadioButton();
        embossButton = new javax.swing.JRadioButton();
        paintButton = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jTextField9 = new javax.swing.JTextField();
        customButton = new javax.swing.JRadioButton();
        rectangleButton = new javax.swing.JButton();
        ovalButton = new javax.swing.JButton();
        colorButton = new javax.swing.JButton();
        sizeButton = new javax.swing.JSlider(JSlider.VERTICAL, 1, 100, 50);
        textButton = new javax.swing.JButton();
        cropButton = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Simple Image Editor");
        setResizable(false);

        processButton.setText("Process");
        processButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                processButtonActionPerformed(evt);
            }
        });

        jLabel2.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jLabel2MouseDragged(evt);
            }
        });
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel2MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jLabel2MouseReleased(evt);
            }
        });

        loadimageButton.setText("Load Image");
        loadimageButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loadimageButtonActionPerformed(evt);
            }
        });

        buttonGroup1.add(gaussianButton);
        gaussianButton.setText("Gaussian");
        gaussianButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gaussianButtonActionPerformed(evt);
            }
        });

        buttonGroup1.add(edgesButton);
        edgesButton.setText("Edges");
        edgesButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edgesButtonActionPerformed(evt);
            }
        });

        buttonGroup1.add(sharpenButton);
        sharpenButton.setText("Sharpen");
        sharpenButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sharpenButtonActionPerformed(evt);
            }
        });

        buttonGroup1.add(embossButton);
        embossButton.setText("Emboss");
        embossButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                embossButtonActionPerformed(evt);
            }
        });

        paintButton.setText("Paint");
        paintButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                paintButtonActionPerformed(evt);
            }
        });

        jTextField1.setEditable(false);
        jTextField1.setText("0");
        jTextField1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField1MouseClicked(evt);
            }
        });
        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField1KeyTyped(evt);
            }
        });

        jTextField2.setEditable(false);
        jTextField2.setText("0");
        jTextField2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField2MouseClicked(evt);
            }
        });
        jTextField2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField2KeyTyped(evt);
            }
        });

        jTextField3.setEditable(false);
        jTextField3.setText("0");
        jTextField3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField3MouseClicked(evt);
            }
        });
        jTextField3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField3KeyTyped(evt);
            }
        });

        jTextField4.setEditable(false);
        jTextField4.setText("0");
        jTextField4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField4MouseClicked(evt);
            }
        });
        jTextField4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField4KeyTyped(evt);
            }
        });

        jTextField5.setEditable(false);
        jTextField5.setText("1");
        jTextField5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField5MouseClicked(evt);
            }
        });
        jTextField5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField5KeyTyped(evt);
            }
        });

        jTextField6.setEditable(false);
        jTextField6.setText("0");
        jTextField6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField6MouseClicked(evt);
            }
        });
        jTextField6.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField6KeyTyped(evt);
            }
        });

        jTextField7.setEditable(false);
        jTextField7.setText("0");
        jTextField7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField7MouseClicked(evt);
            }
        });
        jTextField7.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField7KeyTyped(evt);
            }
        });

        jTextField8.setEditable(false);
        jTextField8.setText("0");
        jTextField8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField8MouseClicked(evt);
            }
        });
        jTextField8.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField8KeyTyped(evt);
            }
        });

        jTextField9.setEditable(false);
        jTextField9.setText("0");
        jTextField9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField9MouseClicked(evt);
            }
        });
        jTextField9.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField9KeyTyped(evt);
            }
        });

        buttonGroup1.add(customButton);
        customButton.setText("Custom");
        customButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                customButtonActionPerformed(evt);
            }
        });

        rectangleButton.setText("Rectangle");
        rectangleButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rectangleButtonActionPerformed(evt);
            }
        });

        ovalButton.setText("Oval");
        ovalButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ovalButtonActionPerformed(evt);
            }
        });

        colorButton.setBackground(new java.awt.Color(0, 0, 0));
        colorButton.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        colorButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                colorButtonMouseClicked(evt);
            }
        });

        sizeButton.setMaximum(10);
        sizeButton.setValue(5);
        sizeButton.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                sizeButtonStateChanged(evt);
            }
        });

        textButton.setText("Text");
        textButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textButtonActionPerformed(evt);
            }
        });

        cropButton.setText("Crop");
        cropButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cropButtonActionPerformed(evt);
            }
        });

        jMenu1.setText("File");

        jMenuItem3.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem3.setText("Open");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3);

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem2.setText("Save");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuItem5.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.ALT_MASK));
        jMenuItem5.setText("Exit");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem5);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenu2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu2ActionPerformed(evt);
            }
        });

        jMenuItem4.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Z, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem4.setText("Undo");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem4);

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Y, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem1.setText("Redo");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem1);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(processButton, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(gaussianButton, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(edgesButton, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(sharpenButton, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(embossButton, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(customButton))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 664, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(147, 147, 147)
                                .addComponent(loadimageButton, javax.swing.GroupLayout.PREFERRED_SIZE, 365, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(sizeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(38, 38, 38))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(cropButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(rectangleButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(paintButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(ovalButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(colorButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(textButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addContainerGap())))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(gaussianButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(edgesButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(sharpenButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(embossButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(paintButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(rectangleButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ovalButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(textButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cropButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(colorButton, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(sizeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(customButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(loadimageButton, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(7, 7, 7)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(processButton, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(47, 47, 47))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    private void processButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_processButtonActionPerformed

        BufferedImage mshi = new BufferedImage(jLabel2.getWidth(), jLabel2.getHeight(), BufferedImage.TYPE_INT_RGB);
        BufferedImage ashi = new BufferedImage(jLabel2.getWidth(), jLabel2.getHeight(), BufferedImage.TYPE_INT_RGB);
        g = mshi.createGraphics();
        jLabel2.getIcon().paintIcon(null, g, 0, 0);
        g = ashi.createGraphics();
        if(filterchoose == 1)
        {
            kernel = new float[]{1.0f / 16.0f, 1.0f / 8.0f, 1.0f / 16.0f, 1.0f / 8.0f, 1.0f / 4.0f, 1.0f / 8.0f, 1.0f / 16.0f, 1.0f / 8.0f, 1.0f / 16.0f};
        }
        else if(filterchoose == 2)
        {
            kernel = new float[]{0.0f, 1.0f, 0.0f, 1.0f, -4.0f, 1.0f, 0.0f, 1.0f, 0.0f};
        }
        else if(filterchoose == 3)
        {
            kernel = new float[]{0.0f, -1.0f, 0.0f, -1.0f, 5.0f, -1.0f, 0.0f, -1.0f, 0.0f};
        }
        else if(filterchoose == 4)
        {
            kernel = new float[]{-2.0f, -1.0f, 0.0f, -1.0f, 1.0f, 1.0f, 0.0f, 1.0f, 2.0f};
        }
        else if(filterchoose == 5)
        {
            if(jTextField1.getText().isEmpty() || jTextField2.getText().isEmpty() || jTextField3.getText().isEmpty() || jTextField4.getText().isEmpty() || jTextField5.getText().isEmpty() || jTextField6.getText().isEmpty() || jTextField7.getText().isEmpty() || jTextField8.getText().isEmpty() || jTextField9.getText().isEmpty())
            {
                JOptionPane.showMessageDialog(this, "Các ô trong bộ lọc không được để trống, xin nhập đầy đủ !!!");
            }
            else
            {
                float x1 = Float.parseFloat(jTextField1.getText());
                float x2 = Float.parseFloat(jTextField2.getText());
                float x3 = Float.parseFloat(jTextField3.getText());
                float x4 = Float.parseFloat(jTextField4.getText());
                float x5 = Float.parseFloat(jTextField5.getText());
                float x6 = Float.parseFloat(jTextField6.getText());
                float x7 = Float.parseFloat(jTextField7.getText());
                float x8 = Float.parseFloat(jTextField8.getText());
                float x9 = Float.parseFloat(jTextField9.getText());
                kernel = new float[]{x1, x2, x3, x4, x5, x6, x7, x8, x9};
            } 
        }
        if(kernel != null)
        {
            convol = new ConvolveOp(new Kernel(3, 3, kernel));
            BufferedImage result = convol.filter(mshi, new BufferedImage(mshi.getWidth(), mshi.getHeight(), mshi.getType()));
            g.drawImage(result, null, 0, 0);
            jLabel2.setIcon(new ImageIcon(ashi));
            if(currentG < listG.size() - 1)
            {
                listG.subList(currentG + 1, listG.size()).clear();
            }
            listG.add(ashi);
            currentG = listG.size() - 1;
        }  
    }//GEN-LAST:event_processButtonActionPerformed

    private void gaussianButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gaussianButtonActionPerformed
        filterchoose = 1;
        jTextField1.setEditable(false);
        jTextField2.setEditable(false);
        jTextField3.setEditable(false);
        jTextField4.setEditable(false);
        jTextField5.setEditable(false);
        jTextField6.setEditable(false);
        jTextField7.setEditable(false);
        jTextField8.setEditable(false);
        jTextField9.setEditable(false);
    }//GEN-LAST:event_gaussianButtonActionPerformed

    private void edgesButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edgesButtonActionPerformed
        filterchoose = 2;
        jTextField1.setEditable(false);
        jTextField2.setEditable(false);
        jTextField3.setEditable(false);
        jTextField4.setEditable(false);
        jTextField5.setEditable(false);
        jTextField6.setEditable(false);
        jTextField7.setEditable(false);
        jTextField8.setEditable(false);
        jTextField9.setEditable(false);
    }//GEN-LAST:event_edgesButtonActionPerformed

    private void sharpenButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sharpenButtonActionPerformed
        filterchoose = 3;
        jTextField1.setEditable(false);
        jTextField2.setEditable(false);
        jTextField3.setEditable(false);
        jTextField4.setEditable(false);
        jTextField5.setEditable(false);
        jTextField6.setEditable(false);
        jTextField7.setEditable(false);
        jTextField8.setEditable(false);
        jTextField9.setEditable(false);
    }//GEN-LAST:event_sharpenButtonActionPerformed

    private void embossButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_embossButtonActionPerformed
        filterchoose = 4;
        jTextField1.setEditable(false);
        jTextField2.setEditable(false);
        jTextField3.setEditable(false);
        jTextField4.setEditable(false);
        jTextField5.setEditable(false);
        jTextField6.setEditable(false);
        jTextField7.setEditable(false);
        jTextField8.setEditable(false);
        jTextField9.setEditable(false);

    }//GEN-LAST:event_embossButtonActionPerformed

    private void jTextField1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyTyped
        char v = evt.getKeyChar();
        if(jTextField1.getText().equals("") && v == '-')
        {
            jTextField1.setText("-"); evt.consume();          
        }
        else if(!(Character.isDigit(v)))
        {
            evt.consume(); 
        }     
    }//GEN-LAST:event_jTextField1KeyTyped

    
    private void jTextField2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField2MouseClicked
        if(filterchoose == 5) jTextField2.setText("");
    }//GEN-LAST:event_jTextField2MouseClicked

    private void jTextField3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField3MouseClicked
        if(filterchoose == 5) jTextField3.setText("");
    }//GEN-LAST:event_jTextField3MouseClicked

    private void jTextField6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField6MouseClicked
        if(filterchoose == 5) jTextField6.setText("");
    }//GEN-LAST:event_jTextField6MouseClicked

    private void jTextField5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField5MouseClicked
        if(filterchoose == 5) jTextField5.setText("");
    }//GEN-LAST:event_jTextField5MouseClicked

    private void jTextField4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField4MouseClicked
        if(filterchoose == 5) jTextField4.setText("");
    }//GEN-LAST:event_jTextField4MouseClicked

    private void jTextField7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField7MouseClicked
        if(filterchoose == 5) jTextField7.setText("");
    }//GEN-LAST:event_jTextField7MouseClicked

    private void jTextField8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField8MouseClicked
        if(filterchoose == 5) jTextField8.setText("");
    }//GEN-LAST:event_jTextField8MouseClicked

    private void jTextField9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField9MouseClicked
        if(filterchoose == 5) jTextField9.setText("");
    }//GEN-LAST:event_jTextField9MouseClicked

    private void jTextField1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField1MouseClicked
        if(filterchoose == 5) jTextField1.setText("");
    }//GEN-LAST:event_jTextField1MouseClicked

    private void jTextField2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField2KeyTyped
        char v = evt.getKeyChar();
        if(jTextField2.getText().equals("") && v == '-')
        {
            jTextField2.setText("-"); evt.consume();          
        }
        else if(!(Character.isDigit(v)))
        {
            evt.consume(); 
        }
    }//GEN-LAST:event_jTextField2KeyTyped

    private void jTextField3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField3KeyTyped
        char v = evt.getKeyChar();
        if(jTextField3.getText().equals("") && v == '-')
        {
            jTextField3.setText("-"); evt.consume();          
        }
        else if(!(Character.isDigit(v)))
        {
            evt.consume(); 
        }
    }//GEN-LAST:event_jTextField3KeyTyped

    private void jTextField6KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField6KeyTyped
        char v = evt.getKeyChar();
        if(jTextField6.getText().equals("") && v == '-')
        {
            jTextField6.setText("-"); evt.consume();          
        }
        else if(!(Character.isDigit(v)))
        {
            evt.consume(); 
        }
    }//GEN-LAST:event_jTextField6KeyTyped

    private void jTextField4KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField4KeyTyped
        char v = evt.getKeyChar();
        if(jTextField4.getText().equals("") && v == '-')
        {
            jTextField4.setText("-"); evt.consume();          
        }
        else if(!(Character.isDigit(v)))
        {
            evt.consume(); 
        }
    }//GEN-LAST:event_jTextField4KeyTyped

    private void jTextField7KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField7KeyTyped
        char v = evt.getKeyChar();
        if(jTextField7.getText().equals("") && v == '-')
        {
            jTextField7.setText("-"); evt.consume();          
        }
        else if(!(Character.isDigit(v)))
        {
            evt.consume(); 
        }
    }//GEN-LAST:event_jTextField7KeyTyped

    private void jTextField8KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField8KeyTyped
        char v = evt.getKeyChar();
        if(jTextField8.getText().equals("") && v == '-')
        {
            jTextField8.setText("-"); evt.consume();          
        }
        else if(!(Character.isDigit(v)))
        {
            evt.consume(); 
        }
    }//GEN-LAST:event_jTextField8KeyTyped

    private void jTextField9KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField9KeyTyped
        char v = evt.getKeyChar();
        if(jTextField9.getText().equals("") && v == '-')
        {
            jTextField9.setText("-"); evt.consume();          
        }
        else if(!(Character.isDigit(v)))
        {
            evt.consume(); 
        }
    }//GEN-LAST:event_jTextField9KeyTyped

    private void jTextField5KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField5KeyTyped
        char v = evt.getKeyChar();
        if(jTextField5.getText().equals("") && v == '-')
        {
            jTextField5.setText("-"); evt.consume();          
        }
        else if(!(Character.isDigit(v)))
        {
            evt.consume(); 
        }
    }//GEN-LAST:event_jTextField5KeyTyped

    private void jLabel2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MousePressed
        old = evt.getPoint();
        if(paintchoose == 4)
        {
            text = new JTextArea();
            text.setSize(100, 20);
            text.setLocation(old);
            text.setOpaque(false);
            text.setBackground(new Color(0, 0, 0, 0));
            text.setForeground(c);
            text.setBorder(BorderFactory.createDashedBorder(c));
            jLabel2.add(text);
           
        }
        if (paintchoose == 0)
        {
           BufferedImage mshi = new BufferedImage(jLabel2.getWidth(), jLabel2.getHeight(), BufferedImage.TYPE_INT_ARGB);
           g = (Graphics2D)mshi.createGraphics();
           jLabel2.getIcon().paintIcon(null, g, 0, 0);
           g.setColor(c);
           float y = text.getLocation().y;
           for (String line : text.getText().split("\n"))
           {
               g.drawString(line, text.getLocation().x, y += g.getFontMetrics().getHeight());
           }
           g.dispose();
           jLabel2.setIcon(new ImageIcon(mshi));
           text.setEditable(false);
           text.setVisible(false);
        }
        
    }//GEN-LAST:event_jLabel2MousePressed

    private void jLabel2MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseDragged
        BufferedImage mshi = new BufferedImage(jLabel2.getIcon().getIconWidth(), jLabel2.getIcon().getIconHeight(), BufferedImage.TYPE_INT_RGB);
        g = (Graphics2D)mshi.createGraphics();
        jLabel2.getIcon().paintIcon(null, g, 0, 0);
        g.setColor(c);
        current = evt.getPoint();
        if(paintchoose == 1)
        { 
            g.setStroke(s);
            g.drawLine(old.x, old.y, current.x, current.y);
            g.dispose();
            jLabel2.setIcon(new ImageIcon(mshi));
            old = current;
        }
        else if(paintchoose == 2)
        {
            g = (Graphics2D)jLabel2.getGraphics();
            g.drawImage(mshi, null, 0, 0);
            g.setColor(c);
            g.setStroke(s);
            g.drawRect(Math.min(old.x, current.x), Math.min(old.y, current.y), Math.abs(old.x - current.x), Math.abs(old.y - current.y));  
            g.dispose();
        }
        else if(paintchoose == 3)
        {
            g = (Graphics2D)jLabel2.getGraphics();
            g.drawImage(mshi, null, 0, 0);
            g.setColor(c);
            g.setStroke(s);
            g.drawOval(Math.min(old.x, current.x), Math.min(old.y, current.y), Math.abs(old.x - current.x), Math.abs(old.y - current.y)); 
            g.dispose();
        }
        else if( paintchoose == 4)
        {
            text.setSize(current.x - old.x, current.y - old.y);
            text.setBorder(BorderFactory.createDashedBorder(Color.BLACK));
        }
        else if (paintchoose == 5)
        {
            g = (Graphics2D)jLabel2.getGraphics();
            g.drawImage(mshi, null, 0, 0);
            g.setColor(Color.BLACK);
            g.setStroke(new BasicStroke(5));
            g.drawRect(Math.min(old.x, current.x), Math.min(old.y, current.y), Math.abs(old.x - current.x), Math.abs(old.y - current.y));  
            g.dispose();
        }

    }//GEN-LAST:event_jLabel2MouseDragged

    private void jLabel2MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseReleased

        BufferedImage mshi = new BufferedImage(jLabel2.getIcon().getIconWidth(), jLabel2.getIcon().getIconHeight(), BufferedImage.TYPE_INT_RGB);
        g = (Graphics2D)mshi.createGraphics();
        jLabel2.getIcon().paintIcon(null, g, 0, 0);
        g.setColor(c);
        current = evt.getPoint();
        if(paintchoose == 2)
        {
            g.setStroke(s);
            g.drawRect(Math.min(old.x, current.x), Math.min(old.y, current.y), Math.abs(old.x - current.x), Math.abs(old.y - current.y));
            g.dispose();
            jLabel2.setIcon(new ImageIcon(mshi));
            
        }
        else if(paintchoose == 3)
        {
            g.setStroke(s);
            g.drawOval(Math.min(old.x, current.x), Math.min(old.y, current.y), Math.abs(old.x - current.x), Math.abs(old.y - current.y));
            g.dispose();
            jLabel2.setIcon(new ImageIcon(mshi)); 
        }
        else if (paintchoose == 4)
        {
            paintchoose = 0;
            jLabel2.setIcon(new ImageIcon(mshi));
        }
        else if (paintchoose == 5)
        {
            BufferedImage dest = mshi.getSubimage(old.x, old.y, Math.abs(old.x - current.x),Math.abs(old.y - current.y));
            mshi = new BufferedImage(jLabel2.getWidth(), jLabel2.getHeight(), BufferedImage.TYPE_INT_ARGB);
            g = (Graphics2D)mshi.createGraphics();
            try {
                BufferedImage img = ImageIO.read(new File("src\\default_image\\white.png"));
                g.drawImage(img,0,0,null);
                g.drawImage(dest, jLabel2.getWidth()/2 - dest.getWidth()/2 , jLabel2.getHeight()/2 - dest.getHeight()/2, null);
                g.dispose();
                jLabel2.setIcon(new ImageIcon(mshi));
            } catch (IOException ex) {
                Logger.getLogger(SimpleImageEditor.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        if(currentG < listG.size() - 1)
        {
            listG.subList(currentG + 1, listG.size()).clear();
        }
        listG.add(mshi);
        currentG = listG.size() - 1;
    }//GEN-LAST:event_jLabel2MouseReleased

    private void colorButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_colorButtonMouseClicked
        JColorChooser jc = new JColorChooser();
        c = jc.showDialog(null, "Please select color", Color.BLACK);
        colorButton.setBackground(c);
        
    }//GEN-LAST:event_colorButtonMouseClicked

    private void sizeButtonStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_sizeButtonStateChanged
        s = new BasicStroke(sizeButton.getValue());
    }//GEN-LAST:event_sizeButtonStateChanged

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed

        JFileChooser fileChooser = new JFileChooser();
        if (fileChooser.showSaveDialog(null) == JFileChooser.APPROVE_OPTION)
        {
            
            File file = fileChooser.getSelectedFile();
            BufferedImage mshi = new BufferedImage(jLabel2.getWidth(), jLabel2.getHeight(), BufferedImage.TYPE_INT_RGB);
            g = (Graphics2D)mshi.createGraphics();
            jLabel2.getIcon().paintIcon(null, g, 0, 0);
            try {
                ImageIO.write(mshi,"jpg", file);
            } catch (IOException ex) {
                Logger.getLogger(SimpleImageEditor.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed

        if((currentG - 1) >= 0)
        {
            jLabel2.setIcon(new ImageIcon(listG.get(currentG - 1)));    
            currentG--;
        }
        
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void textButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textButtonActionPerformed

        paintchoose = 4;
    }//GEN-LAST:event_textButtonActionPerformed

    private void cropButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cropButtonActionPerformed

        paintchoose = 5;
    }//GEN-LAST:event_cropButtonActionPerformed

    private void paintButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_paintButtonActionPerformed

        paintchoose = 1;
    }//GEN-LAST:event_paintButtonActionPerformed

    private void rectangleButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rectangleButtonActionPerformed

        paintchoose = 2;
    }//GEN-LAST:event_rectangleButtonActionPerformed

    private void ovalButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ovalButtonActionPerformed

        paintchoose = 3;
    }//GEN-LAST:event_ovalButtonActionPerformed

    private void loadimageButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loadimageButtonActionPerformed

        this.load();
    }//GEN-LAST:event_loadimageButtonActionPerformed

    private void jMenu2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu2ActionPerformed

    }//GEN-LAST:event_jMenu2ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed

        if ((currentG + 1) < listG.size())
        {
            jLabel2.setIcon(new ImageIcon(listG.get(currentG + 1)));
            currentG++;
        }
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed

        int result = choose.showOpenDialog(null);
        if(result == JFileChooser.APPROVE_OPTION)
        {
            File f = choose.getSelectedFile();
            String filename = f.getAbsolutePath();
            ImageIcon icon = new ImageIcon(filename);
            Image out = icon.getImage().getScaledInstance(jLabel2.getWidth(), jLabel2.getHeight(), Image.SCALE_SMOOTH);
            icon = new ImageIcon(out);
            jLabel2.setIcon(icon);
            BufferedImage mshi = new BufferedImage(jLabel2.getWidth(), jLabel2.getHeight(), BufferedImage.TYPE_INT_RGB);
            g = (Graphics2D)mshi.createGraphics();
            jLabel2.getIcon().paintIcon(null, g, 0, 0);
            if(currentG < listG.size() - 1)
            {
                listG.subList(currentG + 1, listG.size()).clear();
            }
            listG.add(mshi);
            currentG = listG.size() - 1;
        }
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed

        this.dispose();
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void customButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_customButtonActionPerformed
        jTextField1.setEditable(true);
        jTextField2.setEditable(true);
        jTextField3.setEditable(true);
        jTextField4.setEditable(true);
        jTextField5.setEditable(true);
        jTextField6.setEditable(true);
        jTextField7.setEditable(true);
        jTextField8.setEditable(true);
        jTextField9.setEditable(true);
        filterchoose = 5;
    }//GEN-LAST:event_customButtonActionPerformed

    public void load()
    {
        int result = choose.showOpenDialog(null);
        if(result == JFileChooser.APPROVE_OPTION)
        {
            File f = choose.getSelectedFile();
            String filename = f.getAbsolutePath();
            ImageIcon icon = new ImageIcon(filename);
            Image out = icon.getImage().getScaledInstance(jLabel2.getWidth(), jLabel2.getHeight(), Image.SCALE_SMOOTH);
            icon = new ImageIcon(out);
            jLabel2.setIcon(icon);
            BufferedImage mshi = new BufferedImage(jLabel2.getWidth(), jLabel2.getHeight(), BufferedImage.TYPE_INT_RGB);
            g = (Graphics2D)mshi.createGraphics();
            jLabel2.getIcon().paintIcon(null, g, 0, 0);
            if(currentG < listG.size() - 1)
            {
                listG.subList(currentG + 1, listG.size()).clear();
            }
            listG.add(mshi);
            currentG = listG.size() - 1;
        }
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(SimpleImageEditor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SimpleImageEditor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SimpleImageEditor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SimpleImageEditor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SimpleImageEditor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton colorButton;
    private javax.swing.JButton cropButton;
    private javax.swing.JRadioButton customButton;
    private javax.swing.JRadioButton edgesButton;
    private javax.swing.JRadioButton embossButton;
    private javax.swing.JRadioButton gaussianButton;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    private javax.swing.JButton loadimageButton;
    private javax.swing.JButton ovalButton;
    private javax.swing.JButton paintButton;
    private javax.swing.JButton processButton;
    private javax.swing.JButton rectangleButton;
    private javax.swing.JRadioButton sharpenButton;
    private javax.swing.JSlider sizeButton;
    private javax.swing.JButton textButton;
    // End of variables declaration//GEN-END:variables
}