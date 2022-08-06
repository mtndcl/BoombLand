package com.nazo.bombland.gui.unit;

import javax.swing.*;
import java.awt.*;

public  class GameCell  extends JLabel {


    private  int x;
    private  int y;

    public  GameCell(int x,int y){

        super(x+","+y,JLabel.CENTER);
        this.x=x;
        this.y=y;
        setPreferredSize(new Dimension(20,20));

        setBorder(BorderFactory.createLineBorder(Color.PINK));



    }



}
