package com.TSI.ITSgame;

import java.util.Arrays;

public class Game {

    private boolean gameRunning = true;
    Room[][] Board = new Room[12][12];

    //Constructors

    public void intialise (){
        for (int i = 0; i < Board.length; i++) {
            for (int j = 0; j < Board[i].length; j++) {
                Board[i][j] = new Room();
            }
        }



    }

    public void gameRun(){

        while (gameRunning = true){






        }


    }



}
