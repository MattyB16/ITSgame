package com.TSI.ITSgame;

public class EnemyTile extends Tile{

    public Enemy enemy;

    public EnemyTile(Enemy _enemy){

        enemy = _enemy;

    }

    @Override
    public void onCharacterEnter(Character player) {

        System.out.println("A wild " + enemy.enemyName + " appears!");

    }


}
