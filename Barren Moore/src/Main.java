import java.util.Scanner;

/**
 * Created by Administrator on 28/07/2017.
 */
public class Main {

    public static void main(String[] args) {

     MainCharacter mc = new MainCharacter();
     Calculations c = new Calculations();
     ScreenMessages sc = new ScreenMessages();
     Scanner scan = new Scanner(System.in);
     boolean b = false;

    sc.outputNormalmessage("Welcome Adventurer, you have began a journey which will end with two ways...either defeating the dark lord furbie or dying along the journey. Only you decide your fate...");
    sc.outputBlankLine();
    sc.outputNormalmessage("...Anyway on a lighter note, please state your name....for research purposes.");
    String cName = scan.nextLine();
    sc.outputNormalmessage("Well hello " + cName + " it's a pleasure to be the one forcing you on this journey.");
    sc.outputNormalmessage("Purely out of interest, if you had to pick between a mage, fighter or marksman which one would you choose?");
    String cClass = scan.nextLine();

     while(b = false)
        {
            if(cClass.equals("mage"))
            {
                sc.outputNormalmessage("Ahhhh a mage, not the one i would have picked but an interesting choice");
                b = true;
            }
            else if(cClass.equals("fighter"))
            {
                sc.outputNormalmessage("Ahhhh a fighter, not the one i would have picked but an interesting choice");
                b = true;
            }
            else if(cClass.equals("marksman"))
            {
                sc.outputNormalmessage("Ahhhh a marksman, not the one i would have picked but an interesting choice");
                b = true;
            }
        }


      







    }
}
