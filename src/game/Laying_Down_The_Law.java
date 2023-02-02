package game;
import java.util.Scanner;

public class Laying_Down_The_Law {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Laying Down The Law\nBy: Darsh Patel");
        System.out.println("\nYou have chosen Jeff! A mage born with a burning passion to solve the rights");
        System.out.println("from the wrongs. Nothing will go past him without being solved.");

        System.out.println("Though, one day, a portal had appeared in his living room. \n");
        System.out.println("1. Go through the portal");
        System.out.println("2. Leave your house");

        int choose = sc.nextInt();

        if (choose == 1){
            System.out.println("\nAhh yes, the route anyone would've taken. Though, was it the best choice?");
            System.out.println("As you enter the portal, you see a white light.");
            System.out.println("-You have been transported to another universe, in a city-\n");
            System.out.println("As you look around you see a bunch of weird creatures you wouldn't normally" +
                    " see.");
            System.out.println("You look in the distance and see a bunch of people walking, flying, teleporting, etc.\n");
            System.out.println("1. Walk some more");
            System.out.println("2. Ask around for what just happened");
        }
        else {
            System.out.println("\nProbably the wisest choice, but was it?");
            System.out.println("You leave the house and immediately get knocked out by a dwarf outside ");
            System.out.println("your house. You wake up an hour later...the dwarf and the portal are gone");
            System.out.println("-Boring ending-");
        }

        choose = sc.nextInt();
        if (choose == 1){
            System.out.println("\nAs you walk down the street you notice a group of people surrounding a dwarf ");
            System.out.println("laying on the ground, as he had slipped trying to kick a boxing machine. \n");
            System.out.println("1. Help him out");
            System.out.println("2. Keep walking");

            choose = sc.nextInt();
            if (choose == 1){
                System.out.println("\nYou decide to help him out and he repays you by offering money.");
                System.out.println("Since you could not understand him, you use your powers to translate ");
                System.out.println("and speak in their language. You take the money but it comes at a cost");
                System.out.println("He tells you that you have to help him teach his students magic.\n");
                System.out.println("1. Teach his students");
                System.out.println("2. Force him to make a portal and leave");

                choose = sc.nextInt();
                if (choose == 1){
                    System.out.println("\nYou decide to teach his students in order to get out of this world as ");
                    System.out.println("an exchange. He takes you to the school, and you start teaching them ");
                    System.out.println("as best as you can. If they mess up, you make sure that they understand ");
                    System.out.println("their mistake. In the end, you did your job and made them to understand ");
                    System.out.println("how to use magic in order to go out an fight the monsters.");
                    System.out.println("Though, realizing how much you impacted the lives of these children, ");
                    System.out.println("you decided to stay and live a peaceful life as a teacher there.");
                    System.out.println("-Good ending-");
                }
                else {
                    System.out.println("\nYou steal all of his money and force him to make a portal in order ");
                    System.out.println("to return back to the world you were from. He did as you said to not get hurt. ");
                    System.out.println("The least you did was thank him for making a portal. You make it back to your ");
                    System.out.println("world and live out your life as a regular person.");
                    System.out.println("-Bad ending-");
                }
            }

            else {
                System.out.println("\nYou keep walking and finally decide to ask for help.");
                System.out.println("As you walk up to a person on the side walk you realize that you can't " +
                        "understand them.");
                System.out.println("So, since you got mage powers after being transported to this world, ");
                System.out.println("you decide to use them to translate and speak in their language.");
                System.out.println("You ask them, what is this world?");
                System.out.println("She replies, it's called CD city. Even though your main objective was ");
                System.out.println("to get out of this world, you seem intrigued.\n");
                System.out.println("1. Improve your magic");
                System.out.println("2. Tell the the lady to create a portal to leave");

                choose = sc.nextInt();
                if (choose == 1){
                    System.out.println("\nYou've been training for about a good couple of weeks.");
                    System.out.println("You have improved your magic to a point that it can destroy the entire world.");
                    System.out.println("You decide to join a guild in order to put your magic to use.");
                    System.out.println("One day, you are out doing tasks for your guild by killing monsters and collecting loot");
                    System.out.println("You realize though that there is no point in collecting loot for your guild ");
                    System.out.println("since you're already strong enough. So you decide to create your own guild. ");
                    System.out.println("You train your guild to be just as strong as you. ");
                    System.out.println("The power starts to go to your head. You end up becoming an evil villain, ");
                    System.out.println("and destroy CD city.");
                    System.out.println("-Evil ending-");
                }
                else {
                    System.out.println("\nYou realize that, your curiosity may end up getting you into deeper trouble than needed. ");
                    System.out.println("You listen to yourself and decide to tell the lady to get you back to your world. ");
                    System.out.println("You notice that she had a smirk on her face when you had asked that. ");
                    System.out.println("So as she takes you to an empty meadow, she spawns a portal just like the one from your house.");
                    System.out.println("You go into the portal...and see a white light");
                    System.out.println("You...are not back at your home. Instead, you are spawned in a world filled with demons.");
                    System.out.println("Now, you must fight for the princess in her army.");
                    System.out.println("-Betrayal Ending-");
                }
            }
        }
        else {
            System.out.println("\nYou decide to ask around for help. On your way to ask for help, you ");
            System.out.println("encounter a group of bandits that are trying to rob you. \n");
            System.out.println("1. Fight back");
            System.out.println("2. Run away");

            choose = sc.nextInt();
            if (choose == 2){
                System.out.println("\nThere was no way you would fight them. At the power level you were at ");
                System.out.println("you would no chance. You run away and live out the rest of your life with nothing.");
                System.out.println("-Loser ending-");
            }

            else {
                System.out.println("\nYou decide to be brave and fight back in order to keep your honor. ");
                System.out.println("As you get into the battle, you get smacked a couple of times, but ");
                System.out.println("seem to recover. You give them a good couple of hits but you were outnumbered.");
                System.out.println("You get knocked out and are left out in the street, with nothing left. \n");
                System.out.println("1. Get revenge");
                System.out.println("2. Give up");

                choose = sc.nextInt();
                if (choose == 1){
                    System.out.println("\nWith nothing left you are left walking on the street. The thought angers you of how easily ");
                    System.out.println("they beat you. So you decided that you will start your training arc.");
                    System.out.println("You apply for a program that will hone your skills of magic, along with melee combat. ");
                    System.out.println("After about spending 2 months training in CD city, you have almost mastered all of your skills.");
                    System.out.println("Using your prowess, you track down the bandits that had robbed you.");
                    System.out.println("You teleport to their hideout, and you take them out in the blink of an eye");
                    System.out.println("With the knowledge that you have and the amount of power you hold, you decide to stay ");
                    System.out.println("and fight to get justice. ");
                    System.out.println("-Hero ending-");
                }
                else {
                    System.out.println("\nWhy are we still here? Just to suffer? Every night, I can feel ");
                    System.out.println("my leg...and my arm...even my fingers. I've lost everything.");
                    System.out.println("With all of this in mind, you continue to live your harsh life in the ");
                    System.out.println("streets. Cold, restless, and defenseless.");
                    System.out.println("-Sad ending-");
                }
            }
        }
    }
}
