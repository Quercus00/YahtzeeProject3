package Main;
import java.util.* ;

public class dice {
    public static int random(int x){
        Random r = new Random();
        int a = r.nextInt(x)+1;
        return a;
    }
}