//code by Helene, antoine & alban

package Main;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        //menu.menu(); feature a venir
        Scanner sc = new Scanner(System.in); //initialisation
        int i;
        String str;
        int j;
        int bug = 1;
        int die1 = 0;
        int die2 = 0;
        int die3 = 0;
        int die4 = 0;
        int die5 = 0;

       for(i=1; i<=3;i++) {


           if (die1 == 0) {//phase de condition pour la sauvegarde des données
               die1 = dice.rollDice(die1);
           }
           if (die2 == 0) {
               die2 = dice.rollDice(die2);
           }
           if (die3 == 0) {
               die3 = dice.rollDice(die3);
           }
           if (die4 == 0) {
               die4 = dice.rollDice(die4);
           }

           if (die5 == 0) {
               die5 = dice.rollDice(die5);
           }
           System.out.println("scores are : " +die1+" "+die2+" "+die3+" "+die4+" "+die5);
           System.out.println(" ");
           System.out.println(" ");
           //test functions
           combinaisons.test_brelan(die1, die2, die3, die4, die5);
           combinaisons.test_yahtzee(die1, die2, die3, die4, die5);
           combinaisons.test_square(die1, die2, die3, die4, die5);
           // end test functions" + die3 + " " + die4 + " " + die5);
           if (i < 3){
               System.out.println("Do you want to reroll some dice ? Say yes or no ");

           str = sc.next();//want to use nextline but then it just skip the text input

           if (str.equals("yes")) {
               System.out.println("how many?");
               int NumbDice = sc.nextInt();
               for (j = 0; j < NumbDice; j++) {
                   System.out.println("number of the dice to reroll?");
                   int reroll = sc.nextInt();
                   if (reroll < 1 || reroll > 5) {
                       System.out.println("please enter number between 1 and 5?");
                       reroll = sc.nextInt();
                   }
                   switch (reroll) {
                       case 1:
                           die1 = 0;
                           break;
                       case 2:
                           die2 = 0;
                           break;
                       case 3:
                           die3 = 0;
                           break;
                       case 4:
                           die4 = 0;
                           break;
                       case 5:
                           die5 = 0;
                           break;


                   }
               }


           } else {
               System.out.println("no reroll");

           }

       }
       }
        if (die1==die2 && die1==die3 && die1==die4 && die1==die5)
        {
            System.out.println("YAHTZEE");
        }




    }

}
