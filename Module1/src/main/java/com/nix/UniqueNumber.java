package com.nix;

public class UniqueNumber {
    public static void main(String[] args) {
        int[] mas = {1, 4, 5, 1, 1, 3};
        System.out.println(uniqeNumber(mas));}

    static int uniqeNumber(int mas[]) {

        int uniqe = 0;
        int symbol = 0;
        for (int i = 0; i < mas.length; i++) {
            uniqe++;
            for (int j = i + 1; j < mas.length; j++) {
                if (mas[j] == mas[i]) {
                    symbol++;
                    break;
                }

            }
        }
        int result = 0;
        result = uniqe - symbol;
        return result;
    }

}

