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
    public static int[] roll(String[] name,int[] possibilities) {
        int []d= new int[]{0,0,0,0,0};
        for(int i=0; i<4; i++){
            d[i] = dice.random(6);
        }
        for (int j=0; j<13; j++){

            System.out.println(j+"score available " + name[j] +"  ["+possibilities[j] +"]");

        }
        return d;
    }

// fct for reroll the dices
    public static int[] reroll(int[]d,String[] name,int[] possibilities) {
        Scanner sc = new Scanner(System.in);
        String e;
        int x;
        boolean secu= false;
        while(!secu ) {
            System.out.println("Do you want to reroll? tape yes or no");
            String reroll = sc.nextLine();
            reroll = reroll.toLowerCase();
            if (reroll.equals("no")) {
                secu = true;


            } else if (reroll.equals("yes")) {

                secu = true;
                for (int j=0; j<13; j++){

                    System.out.println(j+"score available " + name[j] +"  ["+possibilities[j] +"]");

                }
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

            }else {secu = false;}

        }
        return d;
    }
}



