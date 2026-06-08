package for_questions_and_solving_ps_ONLY;
import java.util.Scanner;
public class CH_2_PS {
    void main(String[] args) {


        //QUESTION NO.1
//        static void main(String[] args) {
//        float a = 7/4f*9/2f;
//            System.out.println(a);


/*  7/4 = 1.75 and 1.75*9=   15.75
15.75/2= 7.875*/

        //QUESTION NO.2

//  this is pending

        //QUESTION NO.3

//    Scanner s = new Scanner(System.in);
//    System.out.println("ENTER THE NUMBER U WANT TO VERIFY");
//    int num = s.nextInt();
//    System.out.println(num>12);
//    if (num>12) {
//        System.out.println("YOU GOT IT");
//    }
//    if (num<12) {
//        System.out.println("NOPE TRY AGAIN");
//    }

//QUESTION NO. 4

        Scanner S = new Scanner(System.in);
        System.out.println();
        System.out.println("TO USE THE FORMULA");
        System.out.println("(v^2 - u^2)/2as");
        System.out.println("enter the value asked below");
        System.out.println("v");
        Double v = S.nextDouble();
        System.out.println("u");
        Double u = S.nextDouble();
        System.out.println("a");
        Double a = S.nextDouble();
        System.out.println("s");
        Double s = S.nextDouble();
        System.out.println((v*v - u*u)/2*a*s);
      }

}