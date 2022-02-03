package com.TSI.ITSgame;

import java.util.ArrayList;

public class Character {

    private String Name;
    private ArrayList<InventoryItem> Inventory = new ArrayList<InventoryItem>();

    int playerPosition = 0;

    //Constructor
    public Character(String name){

        Name = name;

    }

//    public static void PlayerMove(){
//        switch(PlayerDirection){
//            case "w":
//                Move = "";
//                break;
//
//            case "a":
//                Move = "";
//                break;
//
//            case "s":
//                Move = "";
//                break;
//
//            case "d":
//                Move = "";
//                break;
//
//            default:
//                Message = "Invalid movement Try again";
//                break;
//            }
//
//    }


}


