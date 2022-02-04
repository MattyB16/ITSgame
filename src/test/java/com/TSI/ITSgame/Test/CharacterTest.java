package com.TSI.ITSgame.Test;

import com.TSI.ITSgame.Board;
import com.TSI.ITSgame.Character;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CharacterTest {


    @Test
    public void testName() {

        Character testPlayer = new Character(0,0, "Big Jeff");

        assertEquals("Big Jeff", testPlayer.getName(), "That's not his or her name");
    }


    @Test
    public void testMoveUpMiddleBoard() {

        Board dumby = new Board();
        dumby.initialise();
        Character testPlayer = new Character(6,6, "Big Jeff");

        testPlayer.moveUp(dumby);




        assertEquals(7, testPlayer.getPlayerPosY(), "That's not the correct new coordinate.");
    }

    @Test
    public void testMoveUpTopBoard() {

        Board dumby = new Board();
        dumby.initialise();
        Character testPlayer = new Character(11,11, "Big Jeff");

        testPlayer.moveUp(dumby);

        assertEquals(0, testPlayer.getPlayerPosY(), "That's not the correct new coordinate.");

    }

    @Test
    public void testMoveDownMiddleBoard() {

        Board dumby = new Board();
        dumby.initialise();
        Character testPlayer = new Character(6,6, "Big Jeff");

        testPlayer.moveDown(dumby);

        assertEquals(5, testPlayer.getPlayerPosY(), "That's not the correct new coordinate.");

    }

    @Test
    public void testMoveDownBottomBoard() {

        Board dumby = new Board();
        dumby.initialise();
        Character testPlayer = new Character(0,0, "Big Jeff");

        testPlayer.moveDown(dumby);

        assertEquals(11, testPlayer.getPlayerPosY(), "That's not the correct new coordinate.");

    }



}
