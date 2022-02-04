package com.TSI.ITSgame;

public class GoalTile extends Tile{


    @Override
    public void onCharacterEnter(Character player) {

        System.out.println("You win.");

    }

}


