package ONLY_FOR_ME;
import java.util.Scanner;
import java.util.Random;
public class first_rock_paper_scissors_lets_go {
    static void main(String[] args) {

        System.out.println("THIS WILL BE MY FIRST PERSONAL PROJECT");
        System.out.println("LETS MAKE ROCK PAPER SCISSORS");
        System.out.println("ENTER WHAT U'VE GOT BABY");
        Random ra = new Random();
        Scanner sc = new Scanner(System.in);
        int a = ra.nextInt(3) +1;
        String b = sc.nextLine();
        switch (a) {
            case 1 -> System.out.println("scissors\n" + "U SUCK AT THIS GAME MY GUY ");
            case 2 -> System.out.println(  "rock\n" + "NAH U LOOSE ");
            case 3 -> System.out.println("paper\n" + "YOU'LL NEVER LEARN DO U HUH ");
//            if (b.equals("paper");a=3; ) {
//                System.out.println("TIE!!!");
            }

        }

//        switch (b) {
//            case "paper" -> System.out.println("hee hee how about this now ");
//            case "scissors" -> System.out.println("yup i won");
//            case "rock" -> System.out.println("now what cat got your thumb");
//            default -> System.out.println("i_'ll beat u to pulp one day");
//        }







    }


