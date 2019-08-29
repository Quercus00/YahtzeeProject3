package Main;

import java.util.Scanner;

public class menu {
    public static void menu() {
        System.out.println("Yahtzee game by Boersma Hélène, Didier Antoine, Rambert Alban");
        System.out.println("Copyright 2019");
        int select = 0;
        do {
            Scanner choice = new Scanner(System.in);
            System.out.println("Do you want to play (1) or quit the game (2) ?");
            select = choice.nextInt();
            choice.close();
        }while (select<1 & select>2);
        if (select == 1){
            System.out.println("Let's go !");
        }
        else{
            System.out.println("game quit.");
        }

    }
}
