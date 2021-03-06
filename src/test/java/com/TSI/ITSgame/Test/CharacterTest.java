package com.TSI.ITSgame.Test;

import com.TSI.ITSgame.Board;
import com.TSI.ITSgame.Character;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CharacterTest {


    @Test
    public void testCharacterConstruction() {

        Character testPlayer = new Character(2,5, "Big Jeff");

        assertEquals("Big Jeff", testPlayer.getName(), "Incorrect name.");

        assertEquals(2, testPlayer.getPlayerPosX(), "Incorrect X position.");

        assertEquals(5, testPlayer.getPlayerPosY(), "Incorrect Y position.");
    }




    @Test
    public void testMoveUpMiddleBoard() {

        Board dummy = new Board();
        dummy.initialise();
        Character testPlayer = new Character(6,6, "Big Jeff");

        testPlayer.moveUp(dummy);




        assertEquals(7, testPlayer.getPlayerPosY(), "Incorrect new coordinate.");
    }

    @Test
    public void testMoveUpTopBoard() {

        Board dummy = new Board();
        dummy.initialise();
        Character testPlayer = new Character(11,11, "Big Jeff");

        testPlayer.moveUp(dummy);

        assertEquals(0, testPlayer.getPlayerPosY(), "Incorrect new coordinate.");

    }

    @Test
    public void testMoveDownMiddleBoard() {

        Board dummy = new Board();
        dummy.initialise();
        Character testPlayer = new Character(6,6, "Big Jeff");

        testPlayer.moveDown(dummy);

        assertEquals(5, testPlayer.getPlayerPosY(), "Incorrect new coordinate.");

    }

    @Test
    public void testMoveDownBottomBoard() {

        Board dummy = new Board();
        dummy.initialise();
        Character testPlayer = new Character(0,0, "Big Jeff");

        testPlayer.moveDown(dummy);

        assertEquals(11, testPlayer.getPlayerPosY(), "Incorrect new coordinate.");

    }

    @Test
    public void testMoveLeftMiddleBoard() {

        Board dummy = new Board();
        dummy.initialise();
        Character testPlayer = new Character(6,6, "Big Jeff");

        testPlayer.moveLeft(dummy);

        assertEquals(5, testPlayer.getPlayerPosX(), "Incorrect new coordinate.");

    }

    @Test
    public void testMoveLeftSideBoard() {

        Board dummy = new Board();
        dummy.initialise();
        Character testPlayer = new Character(0,6, "Big Jeff");

        testPlayer.moveLeft(dummy);

        assertEquals(11, testPlayer.getPlayerPosX(), "Incorrect new coordinate.");

    }

    @Test
    public void testMoveRightSideBoard() {

        Board dummy = new Board();
        dummy.initialise();
        Character testPlayer = new Character(11,6, "Big Jeff");

        testPlayer.moveRight(dummy);

        assertEquals(0, testPlayer.getPlayerPosX(), "Incorrect new coordinate.");

    }

    @Test
    public void testMoveRightMiddleBoard() {

        Board dummy = new Board();
        dummy.initialise();
        Character testPlayer = new Character(6,6, "Big Jeff");

        testPlayer.moveRight(dummy);

        assertEquals(7, testPlayer.getPlayerPosX(), "Incorrect new coordinate.");

    }



}
