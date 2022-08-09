package com.nazo.bombland.gui.unit;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public  class GameCell  extends JLabel {


    private  int x;
    private  int y;

    private  Image image;
    public  GameCell(int x,int y){


        this.x=x;
        this.y=y;
        setPreferredSize(new Dimension(20,20));

        setBorder(BorderFactory.createLineBorder(Color.BLACK));


        BufferedImage img = null;
        try {
            img = ImageIO.read(new File("resouces/normalBoomb.jpg"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        Image dimg = img.getScaledInstance(40, 40,
                Image.SCALE_SMOOTH);

        ImageIcon imageIcon = new ImageIcon(dimg);


        setIcon(imageIcon);

    }



}
