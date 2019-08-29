package Main;
import java.util.* ;

public class dice {
    public static int random(int x){
        Random r = new Random();
        int a = r.nextInt(x)+1;
        return a;
    }

    public static void rollDice(){
        int de1 = dice.random(6);
        int de2 = dice.random(6);
        int de3 = dice.random(6);
        int de4 = dice.random(6);
        int de5 = dice.random(6);
        System.out.println("the dices scores are : " + de1+"; "+de2 +"; "+  de3 +"; "+ de4+"; " + de5);

    }
}

