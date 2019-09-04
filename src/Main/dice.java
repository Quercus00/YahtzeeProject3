package Main;
import java.util.* ;

public class dice {
    public static int random(int x){
        Random r = new Random();
        int a = r.nextInt(x)+1;
        return a;
    }

    public static int rollDice(int d) {
        d = dice.random(6);
        return d;
    }

// the dices are in an array
    public static int[] roll() {
        int []d= new int[]{0,0,0,0,0};
        for(int i=0; i<4; i++){
            d[i] = dice.random(6);
        }
        return d;
    }

// fct for reroll the dices
    public static int[] roll(int[]d, int[]e) {
        for (int i = 0; i < 4; i++) {
            if (e[i] != 0) {
                d[i] = dice.random(6);
            }
        }
        return d;
    }
}

