//code by Helene, antoine & alban

package Main;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        int die1=0;
        int die2=0;
        int die3=0;
        int die4=0;
        int die5=0;

        dice.rollDice(die1);
        dice.rollDice(die2);
        dice.rollDice(die3);
        dice.rollDice(die4);
        dice.rollDice(die5);

        System.out.println("Do you want to save some dice ? Say yes or no ");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();



    }

}
