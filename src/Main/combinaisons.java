package Main;

public class combinaisons {

    public static int sum(int[] dice){
        int sum =0;
        for(int i : dice){
            sum = sum + i;
        }
        return sum;
    }

    public static int cpt_numb(int[] dice, int test){
        int cpt = 0;
        for(int i : dice){
            if (test==i)
                cpt++;
        }
        return cpt;
    }

    public static int numb_similarities(int[] dice, int numb){
        int sim = 0;
        for(int i : dice){
            if(cpt_numb(dice, i)==numb)
                sim++;
        } return sim;
    }

    /**yahtzee**/

    public static int yahtzee(int[] dice){
        for(int i : dice){
            if(cpt_numb(dice,i)>4){
                return 50;
            }
            return 0;
        }
        return 0;
    }

    /**Chance**/

    public static int chance(int[] dice){
        for(int i : dice){
            return sum(dice);
        }
        return 0;
    }

    /** Square **/

    public static int square(int[] dice){
        for(int i : dice){
            if (numb_similarities(dice, 4)== 4)
                return sum(dice);
        }
        return 0;
    }

    /** Full **/

    public static int full(int[] dice){
        for(int i : dice){
            if ((numb_similarities(dice, 3) == 3) && (numb_similarities(dice, 2) == 2))
                return 25;
        }
        return 0;
    }

    /** Brelan **/

    public static int brelan(int[] dice){
        for(int i : dice){
            if (numb_similarities(dice, 3) == 3)
                return sum(dice);
        }
        return 0;
    }

    /** Little suite **/

    public static int littlesuite(int[] dice){
        for (int i : dice){
            if ((cpt_numb(dice, 4)>=1) && (cpt_numb(dice,3)>=1))
                if ((cpt_numb(dice, 2)>=1) && (cpt_numb(dice, 1)>=1))
                    return 30;
                else if ((cpt_numb(dice, 2)>=1) && (cpt_numb(dice, 5)>=1))
                    return 30;
                else if ((cpt_numb(dice, 5)>=1) && (cpt_numb(dice, 6)>=1))
                    return 30;
            return 0;
        }
        return 0;
    }

    /** big suite **/

    public static int bigsuite(int[] dice){
        for (int i : dice){
            if ((cpt_numb(dice, 2)>=1) && (cpt_numb(dice,3)>=1) && (cpt_numb(dice, 4)>=1) && (cpt_numb(dice, 5)>=1))
                if ((cpt_numb(dice, 1)>=1))
                    return 40;
                else if ((cpt_numb(dice, 6)>=1))
                    return 40;
            return 0;
        }
        return 0;
    }

    /** Aces **/

    public static int aces(int[] dice){
        for(int i : dice){
            return cpt_numb(dice, 1)*1;
        }
        return 0;
    }

    /** Twos **/

    public static int twos(int[] dice){
        for(int i : dice){
            return cpt_numb(dice, 2)*2;
        }
        return 0;
    }

    /** Threes **/

    public static int threes(int[] dice){
        for(int i : dice){
            return cpt_numb(dice, 3)*3;
        }
        return 0;
    }

    /** Fours **/

    public static int fours(int[] dice){
        for(int i : dice){
            return cpt_numb(dice, 4)*4;
        }
        return 0;
    }

    /** Fives **/

    public static int fives(int[] dice){
        for(int i : dice){
            return cpt_numb(dice, 5)*5;
        }
        return 0;
    }

    /** Sixes **/

    public static int sixes(int[] dice){
        for(int i : dice){
            return cpt_numb(dice, 6)*6;
        }
        return 0;
    }
}
