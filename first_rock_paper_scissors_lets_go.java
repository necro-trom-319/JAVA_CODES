package ONLY_FOR_ME;
import java.util.Scanner;
public class first_rock_paper_scissors_lets_go {
    static void main(String[] args) {

        System.out.println("THIS WILL BE MY FIRST PERSONAL PROJECT");
        System.out.println("LETS MAKE ROCK PAPER SCISSORS");
        System.out.println("ENTER WHAT U'VE GOT BABY");
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        switch (a) {
            case "paper" -> System.out.println("scissors\n" + "U SUCK AT THIS GAME MY GUY ");
            case "scissors" -> System.out.println(  "rock\n" + "NAH I WON ");
            case "rock" -> System.out.println("paper\n" + "YOU'LL NEVER LEARN DO U HUH ");
            default -> System.out.println("U GOOD ?? DO U KNOW HOW TO PLAY THIS GAME");
        }







    }
}

