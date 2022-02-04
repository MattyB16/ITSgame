package com.TSI.ITSgame;

public class Board
{

    private Tile[][] tiles = new Tile[12][12];

    public Tile[][] getTiles()
    {
        return tiles;
    }

    public Board()
    {

    }

    public void initialise()
    {
        for (int i = 0; i < tiles.length; i++)
        {
            for (int j = 0; j < tiles[i].length; j++)
            {
                tiles[i][j] = new Tile();
            }
        }

        tiles[3][3] = new GoalTile();

    }

}
