package com.nazo.bombland.gui.unit;

import com.nazo.bombland.gui.BombLandPanel;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.InputEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public  class GameCell  extends JLabel {


    private  final int x;
    private  final  int y;

    private  Image image;

    private  final String unit;

    private BombLandPanel bombLandPanel;
    public  GameCell(BombLandPanel parent,int x,int y,String unit){

        this.bombLandPanel=parent;
        this.x=x;
        this.y=y;
        this.unit=unit;
        this.setFont(new Font("Serif", Font.BOLD, 20));

        this.setHorizontalAlignment(SwingConstants.CENTER);
        this.setVerticalAlignment(SwingConstants.CENTER);
        setPreferredSize(new Dimension(20,20));

        setBorder(BorderFactory.createLineBorder(Color.BLACK));




        addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {

                if ((e.getModifiers() & InputEvent.BUTTON1_MASK) != 0) {
                    System.out.println("Left click detected : " + (e.getPoint()));


                    switch (unit){
                        case  "b":
                            bombLandPanel.finito();
                            break;
                        default:
                            GameCell.this.openCell();
                    }
                }

                if ((e.getModifiers() & InputEvent.BUTTON3_MASK) != 0) {
                    System.out.println("Right click detected : " + (e.getPoint()));

                    readFlag();

                }

                if ((e.getModifiers() & InputEvent.BUTTON2_MASK) != 0) {
                    System.out.println("Middle click detected : " + (e.getPoint()));
                }



            }

            @Override
            public void mousePressed(MouseEvent e) {



            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {

            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        });


    }

    private void openCell() {
        setText(unit);
    }

    public String getUnit() {
        return unit;
    }




    public void readFlag (){

        BufferedImage img = null;
        try {
            img = ImageIO.read(new File("resouces/flag.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        Image dimg = img.getScaledInstance(40, 40,
                Image.SCALE_SMOOTH);


        ImageIcon imageflag = new ImageIcon(dimg);
        setIcon(imageflag);

    }
    public void setBombIcon() {


       BufferedImage img = null;
        try {
            img = ImageIO.read(new File("resouces/normalBoomb.jpg"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        Image dimg = img.getScaledInstance(40, 40,
                Image.SCALE_SMOOTH);


        ImageIcon imageIcon = new ImageIcon(dimg);

        if (unit.equals("b")){
            setIcon(imageIcon);
        }
    }
}
