package com.bridgelabz;

import java.util.Scanner;

public class TicTacToe {
    public static void main(String[] args){
        System.out.println("Welcome to Tic Tac Toe game !");
        createBoard();
        playerChoice();
    }
    public static void createBoard(){
        char[] board = new char[10];
        for (int i=0;i<board.length;i++){
            board[i]=' ';
        }
    }
    public static void playerChoice(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Choose x or o : ");
        char player = scanner.next().charAt(0);
        char computerPlayer;

        if (player == 'x'){
            computerPlayer = 'o';
        }else{
            computerPlayer = 'x';
        }
        System.out.println("player choice is: "+player+" computer choice is: "+ computerPlayer);
    }
}