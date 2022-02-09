package assignment1;

import java.util.Scanner;

public class solution8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Input percentage mark:");
        double marks = scan.nextDouble();
        scan.close();

        if(marks>=90.0) {
            System.out.println("Grade A: Excellent");
        }else if(marks<90.0 && marks>=80.0) {
            System.out.println("Grade B: Good");
        }else if(marks<80.0 && marks>=70.0) {
            System.out.println("Grade C: Average");
        }else if(marks<70.0 && marks>=60.0) {
            System.out.println("Grade D: Deficient");
        }else {
            System.out.println("Grade F: Failing");
        }

    }

}
