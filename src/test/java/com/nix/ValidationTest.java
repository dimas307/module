package com.nix;

import org.junit.Test;

public class ValidationTest {
    @Test
    public static void main(String[] args) {

        String test = "a + (42 - b) * [wtf()] / {(2 + 2)}";
        Validation validator = new Validation();
        boolean correct = validator.validate(test);
        System.out.println("Brackets " + (correct ? "" : "in") + "correct");

    }
}
