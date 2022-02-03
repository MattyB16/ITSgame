package com.TSI.ITSgame;

import java.util.Arrays;
import java.util.Scanner;

public class Game
{

    private boolean gameRunning = true;
    private Character player;
    private Board board;


    //Constructors

    public Game(Character _player)
    {
        this.player = _player;
        board = new Board();
        board.initialise();

    }



    public void gameRun()
    {
        Scanner scanner = new Scanner(System.in);

        while (gameRunning = true)
        {

            switch(scanner.next())
            {
                case "w":
                    player.moveUp(board);
                    break;

                case "a":
                    player.moveLeft(board);
                    break;

                case "s":
                    player.moveRight(board);
                    break;

                case "d":
                    player.moveDown(board);
                    break;

                default:
                    System.out.println("Invalid movement Try again");
                    break;
            }





        }


    }



}
