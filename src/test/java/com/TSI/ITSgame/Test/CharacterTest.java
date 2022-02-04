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


//    @Test
//    public void testMoveUpMiddleBoard() {
//
//        Character
//
//        moveUp()
//
//        assertEquals("Big Jeff", testPlayer.getName(), "That's not his or her name");
//    }
//
//    @Test
//    public void testMoveUpTopBoard() {
//
//        Character testPlayer = new Character(0,0, "Big Jeff");
//
//        assertEquals("Big Jeff", testPlayer.getName(), "That's not his or her name");
//    }

}
