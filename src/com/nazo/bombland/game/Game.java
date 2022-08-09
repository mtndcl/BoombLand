package com.nazo.bombland.game;

import java.util.Random;

public class Game {



    String[][]  gameArea=new String[10][10];

    int bombCount=12;
    public Game(){

        for (int i = 0; i <10 ; i++) {
            for (int j = 0; j <10 ; j++) {
                gameArea[i][j]="n";
            }
        }
        plantBomb();
        detactBombNumber();





    }

    private void detactBombNumber() {

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {



                    if (!gameArea[i][j].equals("b")){
                        continue;
                    }
                    int bombCount=0;


                    if (i>=1 && j>=1 && gameArea[i-1][j-1].equals("b")){

                        bombCount++;
                    }
                    if (i>=1 && gameArea[i-1][j].equals("b")){
                        bombCount++;
                    }
                    if (i>=1 && j<9 && gameArea[i-1][j+1].equals("b")){
                        bombCount++;
                    }
                    if (j>1 && gameArea[i][j-1].equals("b")){
                        bombCount++;
                    }
                    if ( j<9 &&gameArea[i][j+1].equals("b")){
                        bombCount++;
                    }
                    if (i<9 &&j>1 &&gameArea[i+1][j-1].equals("b")){
                        bombCount++;
                    }
                    if (i<9 && gameArea[i+1][j].equals("b")){
                        bombCount++;
                    }
                    if ( i<9&&j<9 &&gameArea[i+1][j+1].equals("b")){
                        bombCount++;
                    }
                    gameArea[i][j]=String.valueOf(bombCount);



                }
        }
    }

    private void plantBomb() {

        Random random=new Random();

        for (int i = 0; i <bombCount ; i++) {
            int x= random.nextInt(10);
            int y= random.nextInt(10);
            gameArea[x][y]="b";
        }
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder=new StringBuilder();

        for (int i = 0; i <10 ; i++) {
            for (int j = 0; j <10 ; j++) {
                stringBuilder.append(gameArea[i][j]+" ");
            }
            stringBuilder.append("\n");
        }
        return stringBuilder.toString();
    }
}
