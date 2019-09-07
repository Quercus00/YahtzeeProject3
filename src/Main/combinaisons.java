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

    /** Four Of A Kind **/

    public static int FourOfAKind(int[] dice){
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

    /** Three Of A Kind **/

    public static int ThreeOfAKind(int[] dice){
        for(int i : dice){
            if (numb_similarities(dice, 3) == 3)
                return sum(dice);
        }
        return 0;
    }

    /** Small Straight **/

    public static int SmallStraight(int[] dice){
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

    /** Large Straight **/

    public static int LargeStraight(int[] dice){
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


    /** function test which score is available **/
    public static int[] tests(boolean[][]databool, int[]dice, int player){
        int[]scorepossibilities = new int[]{0,0,0,0,0,0,0,0,0,0,0,0,0,};
            if(! databool[player-1][0]){
            scorepossibilities[0] = aces(dice);
            }
            if(! databool[player-1][1]){
                scorepossibilities[1] = twos(dice);
            }
            if(! databool[player-1][2]){
                scorepossibilities[2] = threes(dice);
            }
            if(! databool[player-1][3]){
                scorepossibilities[3] = fours(dice);
            }
            if(! databool[player-1][4]){
                scorepossibilities[4] = fives(dice);
            }
            if(! databool[player-1][5]){
                scorepossibilities[5] = sixes(dice);
            }
            if(! databool[player-1][6]){
                scorepossibilities[6] = ThreeOfAKind(dice);
            }
            if(! databool[player-1][7]){
                scorepossibilities[7] = FourOfAKind(dice);
            }
            if(! databool[player-1][8]){
                scorepossibilities[8] = full(dice);
            }
            if(! databool[player-1][9]){
            scorepossibilities[9] = SmallStraight(dice);
             }
            if(! databool[player-1][10]){
            scorepossibilities[10] = LargeStraight(dice);
            }
            if(! databool[player-1][11]){
            scorepossibilities[11] = yahtzee(dice);
            }
            if(! databool[player-1][12]) {
                scorepossibilities[12] = chance(dice);
            }
        return scorepossibilities;
    }


}
