package Main;

public class combinaisons {
    public static void test_brelan(int die1, int die2, int die3, int die4, int die5) {

        //test brelan
        //System.out.println("dé 1 = " + die1 + "   dé 2 = " + die2 + "   dé 3 = " + die3 + "   dé 4 = " + die4 + "   dé 5 = " + die5);

        if(die1 == die2 && die3 == die2)
        {
            System.out.println("Brelan possible avec les dés : dé 1 = " + die1 + " dé 2 = " + die2 + " dé 3 = " + die3);
        } else if (die1 == die2 && die2 == die4){
            System.out.println("Brelan possible avec les dés : dé 1 = " + die1 + " dé 2 = " + die2 + " dé 4 = " + die4);
        } else if (die1 == die2 && die2 == die5){
            System.out.println("Brelan possible avec les dés : dé 1 = " + die1 + " dé 2 = " + die2 + " dé 5 = " + die5);
        } else if (die1 == die3 && die3 == die4){
            System.out.println("Brelan possible avec les dés : dé 1 = " + die1 + " dé 3 = " + die3 + " dé 4 = " + die4);
        } else if (die1 == die3 && die3 == die5){
            System.out.println("Brelan possible avec les dés : dé 1 = " + die1 + " dé 3 = " + die3 + " dé 5 = " + die5);
        } else if (die1 == die4 && die4 == die5){
            System.out.println("Brelan possible avec les dés : dé 1 = " + die1 + " dé 4 = " + die4 + " dé 5 = " + die5);
        } else if (die2== die3 && die3 == die4){
            System.out.println("Brelan possible avec les dés : dé 2 = " + die2 + " dé 3 = " + die3 + " dé 4 = " + die4);
        } else if (die2== die3 && die3 == die5){
            System.out.println("Brelan possible avec les dés : dé 2 = " + die2 + " dé 3 = " + die3 + " dé 5 = " + die5);
        } else if (die2== die4 && die4 == die5){
            System.out.println("Brelan possible avec les dés : dé 2 = " + die2 + " dé 4 = " + die4 + " dé 5 = " + die5);
        } else if (die3== die4 && die4 == die5){
            System.out.println("Brelan possible avec les dés : dé 3 = " + die3 + " dé 4 = " + die4 + " dé 5 = " + die5);
        } else {
            System.out.println("Brelan pas possible");
        }
    }

    public static void test_yahtzee(int die1, int die2, int die3, int die4, int die5){
        if (die1 == die2 && die1 == die3 && die1 == die4 && die1 == die5){
            System.out.println("Yahtzee possible");
        } else{
            System.out.println("Yahtzee pas possible");
        }
    }


}
