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
                int[]dice = Main.dice.roll(); //creation and roll the dices  of the player dices.




                // show the score of the player
                score.printPlayerScore(players, data);


            }

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
