package CH_overviews_and_details;
import java.util.Scanner;
public class If_Else {
    static void main(String[] args) {
        System.out.println("ENTER YOUR AGE SO WE CAN VERIFY U");
        Scanner sc = new Scanner(System.in);

        int age = sc.nextInt();
        if (age>18) {
        System.out.println("u are good to go");
        }

        else System.out.println("nah first be more than 18 then u are permitted");


    }



}
