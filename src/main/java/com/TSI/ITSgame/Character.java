package com.TSI.ITSgame;

import java.util.ArrayList;
import java.util.Scanner;

public class Character {

    private String Name;
    private ArrayList<InventoryItem> Inventory = new ArrayList<InventoryItem>();

    private int playerPosX;
    private int playerPosY;
    private int playerPrevPosX;
    private int playerPrevPosY;





    //Constructor
    public Character(int posX, int posY, String name){

        setName(name);

        playerPosX = posX;
        playerPosY = posY;
        playerPrevPosX = posX;
        playerPrevPosY = posY;


    }

    //Methods

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getPlayerPosX() {
        return playerPosX;
    }

    public void setPlayerPosX(int playerPosX) {
        this.playerPrevPosX = this.playerPosX;
        this.playerPosX = playerPosX;
    }

    public int getPlayerPosY() {
        return playerPosY;
    }

    public void setPlayerPosY(int playerPosY) {
        this.playerPrevPosY = this.playerPosY;
        this.playerPosY = playerPosY;
    }

    public void goBack()
    {
        this.playerPosX = this.playerPrevPosX;
        this.playerPosY = this.playerPrevPosY;

    }


    public void moveUp(Board board){
        Tile old_tile = board.getTiles()[this.getPlayerPosX()][this.getPlayerPosY()];
        this.setPlayerPosY(this.getPlayerPosY() + 1);
        if (this.getPlayerPosY() >= board.getTiles()[0].length)
        {
            this.setPlayerPosY(0);
        }
        board.getTiles()[this.getPlayerPosX()] [this.getPlayerPosY()].onCharacterEnter(this);
    }

    public void moveDown(Board board){
        Tile old_tile = board.getTiles()[this.getPlayerPosX()][this.getPlayerPosY()];
        this.setPlayerPosY(this.getPlayerPosY() - 1);
        if (this.getPlayerPosY() < 0)
        {
            this.setPlayerPosY(board.getTiles()[0].length -1);
        }
        board.getTiles()[this.getPlayerPosX()] [this.getPlayerPosY()].onCharacterEnter(this);
    }

    public void moveLeft(Board board){
        Tile old_tile = board.getTiles()[this.getPlayerPosX()][this.getPlayerPosY()];
        this.setPlayerPosX(this.getPlayerPosX() - 1);
        if (this.getPlayerPosX() < 0)
        {
            this.setPlayerPosX(board.getTiles().length -1);
        }
        board.getTiles()[this.getPlayerPosX()] [this.getPlayerPosY()].onCharacterEnter(this);
    }

    public void moveRight(Board board){
        Tile old_tile = board.getTiles()[this.getPlayerPosX()][this.getPlayerPosY()];
        this.setPlayerPosX(this.getPlayerPosX() + 1);
        if (this.getPlayerPosX() >= board.getTiles().length -1)
        {
            this.setPlayerPosX(0);
        }
        board.getTiles()[this.getPlayerPosX()] [this.getPlayerPosY()].onCharacterEnter(this);
    }

    public void HUD(){

        System.out.println("X:" + getPlayerPosX() + "  " + "Y:" + getPlayerPosY());
    }


}


