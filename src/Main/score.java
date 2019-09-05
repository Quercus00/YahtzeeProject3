package Main;

public class score {

    // Print the score of the actual player
    public static void printPlayerScore(int players, int[][] data) {
        String[]name = new String[]{"Aces           ","Twos           ","Threes         ","Fours          ","Fives          ","Sixes          ",
                "Three Of A Kind", "Four Of A Kind ","Full House     ","Small Straight ",
                "Large Straight ","Yahtzee        ","Chance         "};
        System.out.println("Your Score :");
        for(int j=0; j<13; j++){
            System.out.println(name[j] + " [" +data[players-1][j] +"]");
        }
        System.out.println("\n");
    }

 // Print the score of all the players
    public static void printFinalScore(int players, int[][] data) {
        String[]name = new String[]{"Aces","Twos","Threes","Fours","Fives","Sixes",
                "Three Of A Kind", "Four Of A Kind","Full House","Small Straight",
                "Large Straight","Yahtzee","Chance"};
        for(int i=0; i<players; i++){
            System.out.println("Score of player " +(i+1));
            for(int j=0; j<13; j++){
                System.out.println(name[j] + " [" +data[i][j] +"]");
            }
            System.out.println("\n");
        }
    }
}
