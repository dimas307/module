package com.nix;

public class Triangle {
    public static void main(String[] args) {
        double xA = 0.0;
        double xB = 2.0;
        double xC = 3.0;
        double yA = 1.0;
        double yB = 2.0;
        double yC = 3.0;
        double a = Math.sqrt((xA - xB) * (xA - xB) + (yA - yB) * (yA - yB));
        double b = Math.sqrt((xA - xC) * (xA - xC) + (yA - yC) * (yA - yC));
        double c = Math.sqrt((xB - xC) * (xB - xC) + (yB - yC) * (yB - yC));
        if (a + b <= c || a + c <= b || b + c <= a){
            System.out.println("Triangle does not exist");
        }else {
            double halfSquare = (a+b+c)/2.0;
            double square = Math.sqrt(halfSquare*(halfSquare-a)*(halfSquare-b)*(halfSquare-c));
            System.out.println("Square:" + square);
        }

    }
}
