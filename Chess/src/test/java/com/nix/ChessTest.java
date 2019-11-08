package com.nix;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class ChessTest {
    @Test
    public void canMoveTest (){
        boolean res = new Chess().canMove(int placeI=1, placeJ=1, targetA=3, targetB = 2 );
        assertTrue(res);
    }
}
