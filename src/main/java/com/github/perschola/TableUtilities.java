package com.github.perschola;

public class TableUtilities {
    public static String getSmallMultiplicationTable() {

        return getMultiplicationTable(5);
    }

    public static String getLargeMultiplicationTable() {
        return getMultiplicationTable(10);

    }

    public static String getMultiplicationTable(int tableSize) {
        String result = "";
        for (int i = 1; i <= tableSize; i++) {
            for (int j = 1; j <= tableSize; j++) {
                 int product = i*j;
                 result += String.format("%3d |", product);

            }
            result += "\n";
        }

        return result;
    }
}
