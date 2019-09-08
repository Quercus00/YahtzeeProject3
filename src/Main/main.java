//code by Helene, antoine & alban

package Main;

import java.util.Scanner;

import  Main.dice;

public class main {
    public static void main(String[] args) {


        int players = 0; // default game is for one player
        do{
            System.out.println("How many players ? (5 players maximum)\n---> ");
            Scanner choice = new Scanner(System.in);
            players = choice.nextInt();
        }while(players < 1 || players>5);


        //intialisation of the data and the databoolean :
        int[][] data;
        boolean[][] databool;
        data = memory.data(players);
        databool = memory.dataBool(players);


        boolean stop = false;
        while(!stop){ // while the score is not complete, we continue to play


            //Play the turn of each player
            for(int i=0; i<players ; i++){
                System.out.println("******* Player " + (i+1) + " *********");
                int[]possibilities={0,0,0,0,0,0,0,0,0,0,0,0,0};
                String[]name = new String[]{"Aces           ","Twos           ","Threes         ","Fours          ","Fives          ","Sixes          ",
                        "Three Of A Kind", "Four Of A Kind ","Full House     ","Small Straight ",
                        "Large Straight ","Yahtzee        ","Chance         "};
                int[]dice = Main.dice.roll(); //creation and roll the dices  of the player dices.
                possibilities =combinaisons.tests(databool, dice, players);

                Main.dice.printDice(dice);


                // -------- show the possibilities of score ------------
                for (int j=0; j<13; j++){
                    System.out.println("Score available " + name[j] +"  ["+possibilities[j] +"]");
                }
                // -----------------------------------------------------



                //----- the player has 3 tries with the dices -----
                int t=0;
                while(t<3){
                    Scanner sc = new Scanner(System.in);
                    System.out.println("Do you want to reroll? tape yes or no");
                    String reroll = sc.nextLine();
                    reroll = reroll.toLowerCase();
                    if(reroll.equals("no")){
                        t=3;
                    }
                    else if(reroll.equals("yes")) {
                        dice = Main.dice.reroll(dice, name, possibilities);
                        Main.dice.printDice(dice);
                        t++;
                    }
                }
                // -----------------------------------------



                System.out.println("choose your score :");
                // -------- show the possibilities of score ------------
                for (int j=0; j<13; j++){
                    System.out.println("Score available " + name[j] +"  ["+possibilities[j] +"]  type -->("+j+")");
                }
                // -----------------------------------------------------
                Scanner choice = new Scanner(System.in);
                int choix = choice.nextInt();
                data[i][choix]= possibilities[choix];
                databool[i][choix]=true;

                // show the score of the player
                score.printPlayerScore(players, data);


            } // end of the player turn

            // test if the score is complete : we check the score sheet of the last player
            stop = true;
            for(int i=0 ; i<13; i++){
                if (!databool[players-1][i]) {
                    stop = false;
                    break;
                }
                System.out.println("Game over !\nFinal Score : ");
                score.printFinalScore(players, data);
            }
        }
    }
}
