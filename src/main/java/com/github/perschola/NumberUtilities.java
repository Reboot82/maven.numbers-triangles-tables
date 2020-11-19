package com.github.perschola;


public class NumberUtilities {
    public static String getEvenNumbers(int start, int stop) {

        String toReturn = "";
        for(int i = start; i < stop; i++){
            if(i%2 == 1){
                toReturn += i;
            }
        }
        return toReturn;
    }


    public static String getOddNumbers(int start, int stop) {

        String toReturn = "";
        for(int i = start; i < stop; i++){
            if(i%2 == 0){
                toReturn += i;
            }
        }
        return toReturn;
    }


    public static String getSquareNumbers(int start, int stop, int step) {

        String toReturn = "";
        for(int i = start; i < stop; i = i + step){
            toReturn += (int)Math.pow(i,2);
        }
        return toReturn;
    }

    public static String getRange(int start) {

        String toReturn = "";
        for(int i = 0; i < start; i++){
            toReturn += i;
        }
        return toReturn;
    }

    public static String getRange(int start, int stop) {

        String toReturn = "";
        for(int i = start; i < stop; i++){
            toReturn += i;
        }
        return toReturn;
    }


    public static String getRange(int start, int stop, int step) {

        String toReturn = "";
        for(int i = start; i < stop; i = i + step){
            toReturn += i;
        }
        return toReturn;
    }


    public static String getExponentiations(int start, int stop, int step, int exponent) {

        String toReturn = "";
        for(int i = start; i < stop; i = i + step){
            Double resultAsDouble = Math.pow(i,exponent);
            Integer resultAsInteger = resultAsDouble.intValue();
            toReturn += resultAsInteger;
        }
        return toReturn;
    }
}
