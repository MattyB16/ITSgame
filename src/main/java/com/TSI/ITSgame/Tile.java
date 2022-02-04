package com.TSI.ITSgame;

import java.util.ArrayList;

public class Tile
{

    public Tile()
    {

    }

    public void onCharacterEnter(Character player)
    {
        System.out.println(player.getName() + " moved to a new empty tile.");
    }

}
