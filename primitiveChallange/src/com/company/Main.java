package com.company;

public class Main {

    public static void main(String[] args) {

        byte myByte = (byte) 376;
        short myShort = (short) 48378;
        int myInt = 362732;

        long myLong = (long) 50000 + (10 * (myByte + myShort + myInt));

        System.out.println(myLong);

        short shortTotal = (short) (1000 + 10 * (myByte + myShort + myInt));
        System.out.println(shortTotal);

    }
}
