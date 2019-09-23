package Main;
import java.util.* ;

public class dice {
    private static int random(int x){
        Random r = new Random();
        int a = r.nextInt(x)+1;
        return a;
    }

    public static int rollDice(int d){
        d = dice.random(6);
        return d;
    }

// the dices are in an array
    static int[] roll(){
        int []d= new int[]{0,0,0,0,0};
        for(int i=0; i<=4; i++){
            d[i] = dice.random(6);
        }

        return d;
    }

// fct for reroll the dices
    static int[] reroll(int[] d, String[] name, int[] possibilities) {
        Scanner sc = new Scanner(System.in);
        String e;
        int x;
        for (int j=0; j<13; j++){
            System.out.println("Score available " + name[j] +"  ["+possibilities[j] +"]");
        }
        printDice(d);
        System.out.println("which dices do you want to reroll ?");
        e = sc.nextLine();
        char[] choice = e.toCharArray(); //convert 'e' to an array of char
        int k = e.length();

        for (int i = 0; i < k; i++) {
            x = Character.getNumericValue(choice[i]);
            if (x != 0 && choice[i] != ' ') {
                d[x - 1] = dice.random(6);
            }
        }
        return d;
    }


    /** ------------Print the dices -------------- **/
    static void printDice(int[] dice){
        for (int i=0; i<5; i++) {
            System.out.println("DICE "+ (i+1) +" : [" + dice[i] + "]");
        }
        System.out.println("\n\n");
    }




}



