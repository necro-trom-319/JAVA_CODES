package ONLY_FOR_ME;
import java.util.Scanner;
public class FIBONACCI_SERIES {
    static void main(String[] args) {

        System.out.println("THE FIBONACCI SERIES");
        Scanner sc = new Scanner(System.in);
        int previous = 0;
        int current = 1;
        int sum ;
        do {
            System.out.println(current);
            sum = previous;
            previous = current;
            current = sum + current;
        }while (current <= 200000000);





    }
}
