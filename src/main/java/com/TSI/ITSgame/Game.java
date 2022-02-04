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
        board = new Board();
        board.initialise();
        player = _player;
    }

    public void gameRun(IInputSource inputControls)
    {

        System.out.println("You are dropped into a new world you are unfamiliar with.... the world of AUTOMATION TESTING.\nAll you know is that you are at position X:" + player.getPlayerPosX()+ "  Y:" + player.getPlayerPosY()+ " in this new world....Good luck!");

        while (gameRunning == true)
        {
            System.out.println("Enter direction W,A,S,D: ");



            switch(inputControls.nextLine().toLowerCase())
            {
                case "w":
                    player.moveUp(board);
                    break;

                case "a":
                    player.moveLeft(board);
                    break;

                case "d":
                    player.moveRight(board);
                    break;

                case "s":
                    player.moveDown(board);
                    break;

                case "q":
                    System.out.println("You quit game.");
                    gameRunning = false;
                    continue;

                default:
                    System.out.println("Invalid movement Try again");
                    break;
            }

            if (board.getTiles()[player.getPlayerPosX()][player.getPlayerPosY()].getClass() == GoalTile.class){

                gameRunning = false;
            }

            if (gameRunning == true){

                player.HUD();
            }
            else{

                System.out.println("The Goal was at tile X:3  Y:3.");

            }




        }


    }



}
