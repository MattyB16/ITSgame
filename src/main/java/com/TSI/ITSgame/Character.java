package com.TSI.ITSgame;

import java.util.ArrayList;

public class Character {

    private String Name;
    private ArrayList<InventoryItem> Inventory = new ArrayList<InventoryItem>();

    private int playerPosX = 0;
    private int playerPosY = 0;
    private int playerPrevPosX = 0;
    private int playerPrevPosY = 0;



    //Constructor
    public Character(String name){

        Name = name;

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



    }

    public void moveDown(Board board){



    }

    public void moveLeft(Board board){



    }

    public void moveRight(Board board){



    }


}


