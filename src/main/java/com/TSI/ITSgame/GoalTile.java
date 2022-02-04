package com.TSI.ITSgame;

public class GoalTile extends Tile{

    public GoalTile()
    {

    }

    @Override
    public void onCharacterEnter(Character player) {

        System.out.println("You win.");

    }
}


