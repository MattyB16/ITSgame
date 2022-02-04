package com.TSI.ITSgame;

public class Board
{

    private Tile[][] tiles = new Tile[12][12];
    public int tileLength = tiles.length;

    public Tile[][] getTiles()
    {
        return tiles;
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
        tiles[6][9] = new EnemyTile(new Riccardo());
        tiles[3][4] = new EnemyTile(new Gareth());
        tiles[4][3] = new EnemyTile(new Abu());




    }

}
