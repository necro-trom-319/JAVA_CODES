package for_questions_and_solving_ps_ONLY;

import java.util.Scanner;

public class CH_4_PS {
    static void main(String[] args) {

    // problem 2
//        Scanner sc = new Scanner(System.in);
//        System.out.println("RESULT OF THE STUDENT");
//       int max = 300;
//        System.out.println("MAXIMUM MARKS THAT CAN BE ACQUIRED");
//       System.out.println(max);
//        int t = 100;
//        System.out.println("MAXIMUM MARKS THAT CAN BE ACQUIRED IN EACH SUBJECT");
//        System.out.println(t);
//        System.out.println("TO PASS THE TEST U MUST MEET THE MINIMUM REQUIREMENTS");
//        System.out.println("U MUST CLEAR THE AVG MARKS ALSO WHICH IS GIVEN BELOW");
//        int j = 60;
//        System.out.println(j);
//        System.out.println("ENTER YOUR SUBJECT 1 MARKS");
//        Float a = sc.nextFloat();
//        if (a>33) {
//            System.out.println("YOU'VE PASSED THIS SUBJECT");
//        }else if (a==33){
//            System.out.println("CAN DO BETTER");
//        }else{
//            System.out.println("NOT PASSED");
//        }
//        System.out.println("ENTER YOUR 2nd SUBJECT MARKS");
//        Float b = sc.nextFloat();
//        if (b>33) {
//            System.out.println("YOU'VE PASSED THIS SUBJECT");
//        }else if (b==33){
//            System.out.println("NEEDS IMPROVEMENT");
//        }else{
//            System.out.println("NOT PASSED");
//        }
//        System.out.println("ENTER YOUR 3rd SUBJECT MARKS");
//        Float c = sc.nextFloat();
//        if (c>33) {
//            System.out.println("YOU'VE PASSED THE SUBJECT");
//        }else if (c==33){
//            System.out.println("PUT MORE EFFORTS AND THEN WATCH");
//        }else{
//            System.out.println("NOT PASSED");
//        }
//        System.out.println("SO YOUR TOTAL MARKS ARE:\n  " + (a + b + c) );
//        System.out.println("AND YOUR AVG MAKRS WILL BE:\n" + ((a+b+c)/3f));
//        if (((a+b+c)/3f)>=40) {
//            System.out.println("YOU'VE PASSED THE TEST");
//        }else{
//            System.out.println("SORRY BUT U CAN DO BETTER");
//        }

//    problem 3
//        System.out.println("Income Tax To Be Paid By The Employee");
//        System.out.println("enter your income");
//        Scanner sc = new Scanner(System.in);
//       Double tax;
//       int income = sc.nextInt();
//       if (income<250000) {
//           tax = 0D;
//           System.out.println("no tax to be paid");
//       } else if (income>250000 && income<500000) {
//           tax = (0.05* income);
//           System.out.println("tax to be paid");
//           System.out.println(tax);
//       } else if (income>500000 && income<1000000) {
//           tax = (0.2*income);
//           System.out.println("tax to be paid");
//           System.out.println(tax);
//       } else if (income>1000000) {
//           tax = (0.3*income);
//           System.out.println("tax to be paid");
//           System.out.println(tax);
//       }
//        System.out.println("THE TAX U ARE PAYING IS FOR THE DEVELOPMENT OF A NEW WORLD");

//    problem 4
//        Scanner sc = new Scanner(System.in);
//        System.out.println("WHAT THE...  DAY");
//        int day = sc.nextInt();
//        if (day==1) {
//            System.out.println("ITS MONDAY!!");
//        } else if (day==2) {
//            System.out.println("ITS TUESDAY");
//        } else if (day==3) {
//            System.out.println("ITS WEDNESDAY");
//        } else if (day==4) {
//            System.out.println("ITS THURSDAY");
//        } else if (day==5) {
//            System.out.println("ITS FRIDAY");
//        } else if (day==6) {
//            System.out.println("ITS SATURDAY");
//        } else if (day==7) {
//            System.out.println("FINALLY ITS A WEEKDAY");
//        }

//    problem 5
//        System.out.println("FINDING THE LEAP YEAR");
//        Scanner sc = new Scanner(System.in);
//        float leap = sc.nextFloat();
//        if (leap % 4 == 0) {
//            System.out.println("a leap year");
//        }else {
//            System.out.println("not a leap year");
//        }

//    problem 6
        System.out.println("TYPES OF WEBS");
        Scanner sc = new Scanner(System.in);
        String web = sc.nextLine();
        if (".com".equals(web)) {
            System.out.println("commercial website");
        } else if (".org".equals(web)) {
            System.out.println("organizational website");
        } else if (".in".equals(web)) {
            System.out.println("indian website");
        }


    }

}
