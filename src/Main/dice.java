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
        System.out.println("la valeur du dé est : " + de1);
        System.out.println("la valeur du dé est : " + de2);
        System.out.println("la valeur du dé est : " + de3);
        System.out.println("la valeur du dé est : " + de4);
        System.out.println("la valeur du dé est : " + de5);
    }
}

