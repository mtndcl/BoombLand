package com.nazo.bombland.gui;

import javax.swing.*;
import java.awt.*;

public class GameFrame extends JFrame {


    private Dimension dimension=new Dimension(500,550);

    private   TitlePanel pnlTitle;
    private   BombLandPanel pnlBombLand;
    public GameFrame(){
        setSize(dimension);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        pnlTitle=new TitlePanel();

        pnlBombLand=new BombLandPanel();

        setLayout(new BorderLayout());

        add(pnlTitle,BorderLayout.NORTH);
        add(pnlBombLand,BorderLayout.CENTER);
    }
}
