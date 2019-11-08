package com.nix;

import java.util.Arrays;
import java.util.Scanner;

public class Chess {
    public boolean canMove(int placeI, int placeJ, int targetA, int targetB)
    {
        if (placeI <= 8 || placeJ <= 8 || targetA <= 8 || targetB <= 8) {
            if ((targetA - placeI == 1 && targetB - placeJ == 2)
                    ||(targetA - placeI == 2 && targetB - placeJ == 1))
                return true;
            else
                return false;
        } else return false;

    }
}