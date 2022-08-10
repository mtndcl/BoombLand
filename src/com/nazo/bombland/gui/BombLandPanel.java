package com.nazo.bombland.gui;

import com.nazo.bombland.game.Game;
import com.nazo.bombland.gui.unit.GameCell;

import javax.swing.*;
import java.awt.*;

public class BombLandPanel  extends JPanel {


    GameCell[][]  gameCells=new GameCell[10][10];
    public BombLandPanel(){

        this.setBorder(BorderFactory.createLineBorder(Color.RED));

        setLayout(new GridLayout(10,10));

        Game game=new Game();
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                GameCell lblCell=new GameCell(this,i,j,game.getUnit(i,j));
                gameCells[i][j]=lblCell;
                add(lblCell);
            }
        }
    }

    public  void  finito(){

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                GameCell gameCell=gameCells[i][j];
                if (gameCell.getUnit().equals("b")){
                    gameCell.setBombIcon();
                }
            }
        }

        invalidate();
        repaint();
    }


}
