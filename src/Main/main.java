//code by Helene, antoine & alban

package Main;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        //menu.menu(); feature a venir
        Scanner sc = new Scanner(System.in); //initialisation
        int i= 3;
        String str;
        int j;
        int die1 = 0;
        int die2 = 0;
        int die3 = 0;
        int die4 = 0;
        int die5 = 0;
        do {



            if (die1 == 0) {//phase de condition pour la sauvegarde des données
                die1=dice.rollDice(die1);
            }
            if (die2 == 0){
                die2= dice.rollDice(die2);
            }
            if(die3==0){
                die3= dice.rollDice(die3);
            }
            if (die4==0){
                die4=dice.rollDice(die4);
            }

            if (die5==0){
            die5=dice.rollDice(die5);
            }
            System.out.println("scores are : " +die1+" "+die2+" "+die3+" "+die4+" "+die5);
            System.out.println("Do you want to reroll some dice ? Say yes or no ");

           str = sc.nextLine();
            if(str.equals("yes"))
            {
                System.out.println("how many ?");
                int NumbDice = sc.nextInt();
                    for (j = 0 ;j< NumbDice ; j++)
                    {
                        System.out.println("number of the dice to reroll ?");
                        int reroll= sc.nextInt();
                        if (reroll<1 || reroll>5){
                            System.out.println("please enter number between 1 and 5?");
                            reroll= sc.nextInt();
                        }
                                switch (reroll)
                                {
                                    case 1:
                                        die1 =0;
                                        break;
                                    case 2:
                                        die2 =0;
                                        break;
                                    case 3:
                                        die3 =0;
                                        break;
                                    case 4:
                                        die4 =0;
                                        break;
                                    case 5:
                                        die5 =0;
                                        break;


                                }
                    }


            }

            i-=1;
        }while (i!=0);




    }

}
