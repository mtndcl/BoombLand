package com.nazo.bombland.gui;

import com.nazo.bombland.gui.unit.GameCell;

import javax.swing.*;
import java.awt.*;

public class BombLandPanel  extends JPanel {

    public BombLandPanel(){

        this.setBorder(BorderFactory.createLineBorder(Color.RED));

        setLayout(new GridLayout(10,10));

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                JLabel lblCell=new GameCell(i,j);
                add(lblCell);
            }
        }
    }
}
