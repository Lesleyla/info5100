package com.company;

import java.util.Scanner;

public class solution5 {
    public static boolean isLeap(int year){
        if (year % 4 == 0 && year % 100 != 0)
            return true;
        else if (year % 400 == 0)
            return true;
        return false;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Input a year: if this year is leap year, it will return true, otherwise false.");
        int year = scan.nextInt();
        scan.close();

        System.out.println(isLeap(year));
    }
}
