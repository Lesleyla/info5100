package assignment1;

import java.util.*;

public class solution6 {
    public static void main(String args[]) {
        Scanner reader = new Scanner(System.in);
        double bill; int callNum;//callNum=number of calls;
        System.out.print("Input number of monthly calls:");
        callNum = reader.nextInt();//input number of phone call
        reader.close();

        int x = (int) (callNum / 50);
        switch (x) {
            case 0://callNum < 50
            case 1://50 <= callNum < 100
                bill = 200.00;
                break;
            case 2://100 <= callNum < 150
                bill = 200.00+0.60*(callNum-100);
                break;
            case 3://150 <= callNum < 200
                bill = 230.00+0.50*(callNum-150);
                break;
            default://callNum>=200
                bill = 255.00+0.40*(callNum-200);
                break;
        }
        System.out.println("Monthly telephone bills:" + bill);
    }
}
