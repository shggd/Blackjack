package com;

import com.game.BlackJackGame;

import java.util.Scanner;


public class app {

    public static void main(String[] args) {

        BlackJackGame game = new BlackJackGame();

        Scanner in = new Scanner(System.in);
        int val;
        do{
            game.StartGame();

            System.out.println("Enter 1 to play again");
            val = in.nextInt();
        }while(val==1);
        in.close();
    }
}
