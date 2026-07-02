package ONLY_FOR_ME;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;
public class FIRST_ARRAY_CODE {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random ra = new Random();
        String logo = """
        ┌┬──┐ ┌┐    ┌┬──┐ ┌┬──┐ ┌┬──┐      ┌┬──┐ ┌┬──┐      ┌┬──┐ ┌┬──┐ ┌─┬┬─┐ ┌┬──┐
        └┴─┬┐ ├┤    ├┤  │ ├┼──┘ ├┼─        ├┤  │ ├┼─        ├┼─   ├┼──┤   ├┤   ├┼─ \s
        └──┴┘ └┴──┘ └┴──┘ └┘    └┴──┘      └┴──┘ └┘         └┘    └┘  ┘   └┘   └┴──┘  """;
        System.out.println(logo);
        System.out.println("Press Enter To Start: ");
        sc.nextLine();
        String act1 = """                                    
▄████▄ ▄█████ ██████   ▄██   
██▄▄██ ██       ██      ██   
██  ██ ▀█████   ██      ██   
                             """;

        sc.nextLine();


        System.out.println(act1);
        System.out.println("\n\n NEX TOWN");
        String [] nex_town_characters = {"soldier 1" , "Soldier 2" , "General" , "Kot" , "Tess" , "Patrick"};
        ArrayList<String> inventory = new ArrayList<>();
        inventory.add("The All Rider");
        inventory.add("Hyper Glostur");
        inventory.add("Cleave Axe");
        inventory.add("cact blessings");
        System.out.println("(In Patrick's mind)");
        System.out.println(nex_town_characters[5] + ": Since when all of this started...");
        sc.nextLine();
        System.out.println(nex_town_characters[4] + ": You have to save him!!!");
        sc.nextLine();
        System.out.println(nex_town_characters[5] + ": Please don't go away " + "AAAAAH! (screaming)");
        sc.nextLine();
        System.out.println(nex_town_characters[3] + ": Ya good buddy??" + nex_town_characters[5] + "\n... Yeahh sorry " + nex_town_characters[3] + "\nIts alright");
        sc.nextLine();
        System.out.println(nex_town_characters[5] + ": There is no time for this let's finish this quick" + "(War sounds increasing)");
        sc.nextLine();
        System.out.println(nex_town_characters[2] + ": Hey listen you all today will be the day when we THE NEXIANS win against those Cremises " + "\nYour task is to retrieve 10 Cremis hearts in total for research purposes");
        sc.nextLine();
        System.out.println(nex_town_characters[0] + " " + nex_town_characters[1] + ": The general sure is enraged Today");
        sc.nextLine();
        System.out.println(nex_town_characters[2] + ": Everyone hop from the cargo at once " + "\n YES SIR!!" + "\n Everyone: (hops from the cargo)");
        sc.nextLine();
        System.out.println("IN THE AIR..." );
        System.out.println(nex_town_characters[3] + ": Behind you Patrick!" + "(a black figure swings fast) \n" + nex_town_characters[5] + ": These things are getting faster everyday!!");
        sc.nextLine();
        System.out.println("WAR NOISES PEAKS");
        sc.nextLine();
        System.out.println("(Everyone lands saf-)\n" + nex_town_characters[5] + ": Where is kot and where is eveyone ");
        System.out.println("I have to find him");
        sc.nextLine();
        System.out.println("Task: Find Kot");
        int hp_Patrick = 100;
        int hp_Cremis = ra.nextInt(100,150);
        int hp_neo_Cremis = 300;
        int hp_small_fly = ra.nextInt(50,100);
        int hp_The_Core = 1000;
        int hp_The_Slope = ra.nextInt(100000000 ,2000000000);
        sc.nextLine();
        String [] enemies  = {"Cremis" , "Neo Cremis" , "Small fly" , "The Core" , "The Slope"};
        String [] enemy_attacks = {"pinser" , "nectus throw" , "flash" };
        System.out.println("(A black figure is standing in front of him)");
        System.out.println("Shit its a Cremis these guys are common around here");
        int Hyper_glostur = 15;
        int the_all_rider = 30;
        int cleave_axe = 10;
        int pinser = 5;
        int nectus_throw = 7;
        int cact_blessings = 10;
        String flash = " Stun";
        System.out.println("inventory!");
        System.out.println("Choose weapon: \n" +  "The All Rider\n" + "Hyper Glostur\n" + "Cleave Axe\n" + "cact blessings");
        String weapon = sc.nextLine();
        boolean stunned = false;
        while (hp_Cremis>0 && hp_Patrick>0) {
            if (weapon.equalsIgnoreCase(inventory.get(0))) {
                System.out.println("Let's see how this baby works\n" + "Damage \uD83D\uDCA5 : " + the_all_rider);
                hp_Cremis -= the_all_rider;
            } else if (weapon.equalsIgnoreCase(inventory.get(1))) {
                System.out.println("gotchu boy\n" + "Damage ⚔\uFE0F : " + Hyper_glostur);
                hp_Cremis -= Hyper_glostur;
            } else if (weapon.equalsIgnoreCase(inventory.get(2))) {
                System.out.println("Let's cleave\n" + "Damage \uD83E\uDE93 : " + cleave_axe);
                hp_Cremis -= cleave_axe;
            } else if (weapon.equalsIgnoreCase(inventory.get(3))){
                System.out.println("Heal ❤\uFE0F : " + cact_blessings);
                hp_Patrick += cact_blessings;
            } else {
                System.out.println("no weapon equipped");
            }
            int attackIndex = ra.nextInt(enemy_attacks.length);
            String chosenAttack = enemy_attacks[attackIndex];
            System.out.println("Cremis uses: " + chosenAttack);
            if (chosenAttack.equalsIgnoreCase(enemy_attacks[0])) {
                System.out.println("damage to patrick: " + pinser);
                hp_Patrick -= pinser;
            } else if (chosenAttack.equalsIgnoreCase(enemy_attacks[1])) {
                System.out.println("damage to patrick: " + nectus_throw);
                hp_Patrick -= nectus_throw;
            } else if (chosenAttack.equalsIgnoreCase(enemy_attacks[2])) {
                System.out.println("cannot move dammit!" + flash);
                stunned = true;
                break;
            } else {
                System.out.println("dodged -> safe!");
            }
            System.out.println("Patrick HP: " + hp_Patrick + " | Cremis HP: " + hp_Cremis);
            System.out.println("Choose weapon: \n" + "The All Rider\n"  + "Hyper Glostur\n" + "Cleave Axe\n" + "cact blessings");
            weapon = sc.nextLine();
            if (hp_Cremis<=0) {
                System.out.println("Easy as hell though it caused me a lot of trouble\n " + "Patrick HP: " + hp_Patrick);
                break;
            } else if (hp_Patrick<=0){
                System.out.println("Defeated");
                break;
            }
        }
        System.out.println(nex_town_characters[5] + ": now what??\n" + "(From the back a herd of small flies approaching towards the dead cremis)");
        sc.nextLine();
        System.out.println(nex_town_characters[5] + ": They are so many but there is no place to hide as the whole town had turned to dust after that big asteroid hit the town killing over a millions people. ");
        sc.nextLine();
        System.out.println(nex_town_characters[5] + ": Ok so 2 from 3 O'clock , 5 from front , 9 behind them and..." + nex_town_characters[2] + ": Agh!!\n" + nex_town_characters[5] + ": General!!!");
        sc.nextLine();
        System.out.println(nex_town_characters[5] + ": I have to take them down!");
        sc.nextLine();
        System.out.println("(Seeing general's split open by which seems like a sharp scale Patrick enraged the all of his weapons enhanced devastatingly to their maximum potential!!)");
        int the_all_killer = 60;
        inventory.set(0, "the all killer");
        int infinity_glostur = 55;
        inventory.set(1,"infinity glostur");
        int meta_hand = 40;
        inventory.set(2, "meta hand");
        int healing_shrine = 35;
        inventory.set(3, "healing shrine");
        int multi_fly_hp = 13*hp_small_fly;
        System.out.println("Choose weapon: \n" + "The All killer\n" + "infinty Glostur\n" + "meta hand\n" + "healing shrine");
        while (hp_Patrick>0 && hp_small_fly>0) {
            if (weapon.equalsIgnoreCase(inventory.get(0))) {
                System.out.println("I'll mangle yall!" + "Damage : " + the_all_killer);
                multi_fly_hp -= the_all_killer;
            } else if (weapon.equalsIgnoreCase(inventory.get(1))) {
                System.out.println("stay lost forever\n" + "Damage ⚔\uFE0F : " + infinity_glostur);
                multi_fly_hp -= infinity_glostur;
            } else if (weapon.equalsIgnoreCase(inventory.get(2))) {
                System.out.println("i'll cut u down to nothing\n" + "Damage \uD83E\uDE93 : " + meta_hand);
                multi_fly_hp -= meta_hand;
            } else if (weapon.equalsIgnoreCase(inventory.get(3))) {
                System.out.println("Goddess of healing your blessing shall bestow upon me ❤\uFE0F : " + healing_shrine);
                hp_Patrick += healing_shrine;
            } else {
                System.out.println("no weapon equipped");
            }
            int attackIndex = ra.nextInt(enemy_attacks.length);
            String chosenAttack = enemy_attacks[attackIndex];
            System.out.println("small flies bunch attack: " + chosenAttack);
            if (chosenAttack.equalsIgnoreCase(enemy_attacks[0])) {
                System.out.println("damage to patrick: " + pinser);
                hp_Patrick -= pinser;
            } else if (chosenAttack.equalsIgnoreCase(enemy_attacks[1])) {
                System.out.println("damage to patrick: " + nectus_throw);
                hp_Patrick -= nectus_throw;
            } else if (chosenAttack.equalsIgnoreCase(enemy_attacks[2])) {
                System.out.println("cannot move dammit!" + flash);
                stunned = true;
            } else {
                System.out.println("dodged -> safe!");
            }
            System.out.println("Patrick HP: " + hp_Patrick + " | Small Flies HP: " + multi_fly_hp);
            System.out.println("Choose weapon: \n" + "The All killer\n" + "infinty Glostur\n" + "meta hand\n" + "healing shrine");
            weapon = sc.nextLine();
            if (multi_fly_hp <= 0) {
                System.out.println("\nPatrick HP: " + hp_Patrick );
                System.out.println(nex_town_characters[5] + "\nAre u ok General!? can u hear me ");
                break;
            } else if (hp_Patrick <= 0) {
                System.out.println("Defeated");
                break;
            }
        }
        System.out.println(nex_town_characters[5] + ": Captain wha... what happened to you and where is your blessings it is the only way we can survive in these lands!!");
        sc.nextLine();
        System.out.println(nex_town_characters[3] + ": Agh! (coughs blood)\n " + nex_town_characters[3] + ": why.. (sobbing) \n" + nex_town_characters[5] +"What happened to our batch general?? please answer me" + nex_town_characters[3] + "everyone.. they all died ");
        sc.nextLine();
        System.out.println(nex_town_characters[5] + ": what (furious) who...who did this to my comrades i swear it will by its last night!" + nex_town_characters[3] + ": i..it is the n..neo (noises dropped)");
        sc.nextLine();
        System.out.println(nex_town_characters[5] + ": NOOO!! please don't leave me general after her only you and kot was my family (sobbs)");
        sc.nextLine();
        String act2 = """
                
                
                ▄████▄ ▄█████ ██████   ████▄\s
                ██▄▄██ ██       ██      ▄██▀\s
                ██  ██ ▀█████   ██     ███▄▄\s
                """;
        System.out.println(act2);
        System.out.println("Press enter to start: ");
        sc.nextLine();
        System.out.println("(The general's death grieved Patrick)" + nex_town_characters[5] + "WHY!! ALWAYS THE PERSON I LOVE DIE PAINFULLY IT HURTS...");
        sc.nextLine();
        System.out.println("(Ground rumbles)");
        sc.nextLine();
        System.out.println("Am i hallucinating or what");
        sc.nextLine();
        System.out.println("******BOOM******");
        System.out.println("(The ground beneath him bursts!) ");
        sc.nextLine();
        System.out.println("(THE NEO CREMIS ARRIVES!)");
        sc.nextLine();
        System.out.println("This isn't a normal cremis,what is this");
        sc.nextLine();
        System.out.println( "(shot a bullet to neo cremis)\n" + nex_town_characters[5] +  ": Was that even effective?? " + "\nNeo Cremis HP: " + (hp_neo_Cremis-15) + " (HEALED)");
        sc.nextLine();
        System.out.println(nex_town_characters[5] + ": IT HEALED IN NO TIME AT ALL!!");
        sc.nextLine();
        System.out.println("TASK: RUN");









    }
}
