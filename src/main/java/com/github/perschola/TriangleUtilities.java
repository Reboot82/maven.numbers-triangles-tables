package com.github.perschola;

public class TriangleUtilities {

    public static String getTriangle(int numberOfRows) {

        StringBuilder sb = new StringBuilder();
        for (int i = 1; i < numberOfRows; i++) {
             sb.append(getRow(i) + "\n");
        }
        return sb.toString();
    }

    public static String getRow(int numberOfStars) {
        String star = "*";
        String string = "";
        for (int i = 0; i < numberOfStars; i++) {
             string += star;
        }
        return string;

//        return new String(new char[numberOfStars-1]).replaceAll("", "*");
    }

    public static String getSmallTriangle() {

        return getTriangle(5);
    }

    public static String getLargeTriangle() {
        return getTriangle(10);
    }
}
