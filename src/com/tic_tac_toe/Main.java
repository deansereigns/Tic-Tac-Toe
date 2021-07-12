package com.tic_tac_toe;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        TTT game = new TTT();
        String player = "X";
        int  i =0; // A variable to count number of moves.

        do {
            System.out.println(game.printBoard());
            System.out.println("rows and columns value can be 0,1,2.");
            System.out.println("Want to exit: -1 in rows field\n");
            System.out.println("Enter row for " + player + " or -1 to exit: ");
            int row = input.nextInt();
            input.nextLine();
            if(row == -1)
                break;

            System.out.println("Enter column for " + player + ": ");
            int column = input.nextInt();
            input.nextLine();
            game.setPlay(row,  column, player);
            if(game.isGameOver()) {
                System.out.println(game.printBoard() + "\n" + player +" wins!..\n");
                break;
            }
            i++;
            if(i==9){
                System.out.println("\nNoBody Wins. Match Tied . Out of Moves!...\n");
                break;
            }
            if(player == "X") {
                player = "O";
            }
            else {
                player = "X";
            }
        }while(true);
        System.out.println("\nGoodbye!..");
        System.out.println("Thanks for Playing!....");


    }
}
