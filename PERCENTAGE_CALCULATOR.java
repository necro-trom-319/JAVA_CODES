package com.company;
import java.util.Scanner;
public class PERCENTAGE_CALCULATOR {
    static void main(String[] args) {
        System.out.println("PERCENTAGE OF RAHUL IN CBSE");
        Scanner S = new Scanner(System.in);
        System.out.println("SUBJECT1");
        int SUBJECT1 = S.nextInt();
        System.out.println("SUBJECT2");
        int SUBJECT2 = S.nextInt();
        System.out.println("SUBJECT3");
        int SUBJECT3 = S.nextInt();
        System.out.println("SUBJECT4");
        int SUBJECT4 = S.nextInt();
        System.out.println("SUBJECT5");
        int SUBJECT5 = S.nextInt();
        int TOTAL_MARKS_OBTAINED = (SUBJECT1 + SUBJECT2 + SUBJECT3 + SUBJECT4 + SUBJECT5);
        System.out.println("TOTAL MARKS OBTAINED: " +   TOTAL_MARKS_OBTAINED);
        double PERCENTAGE = ((double) (TOTAL_MARKS_OBTAINED * 100) /500);
        System.out.println("PERCENTAGE: " +   PERCENTAGE);

    }
}
