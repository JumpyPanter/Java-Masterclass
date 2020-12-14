package com.company;

public class Main {

    public static void main(String[] args) {

        double myFirstDouble = 20.00d;
        double mySecondDouble = 80.00d;

        double myTotalDouble = (myFirstDouble + mySecondDouble) * 100.00;
        System.out.println("MyTotalDouble = " + myTotalDouble);
        double myRemainderDouble = myTotalDouble % 40.00;
        System.out.println("MyRemainderDouble =" + myRemainderDouble);

        boolean isNoRemainder = (myRemainderDouble == 0) ? true : false;
        System.out.println("isNoRemainder = " + isNoRemainder);

        if (!isNoRemainder){
            System.out.println("Get some remainder");
        }


    }
}
