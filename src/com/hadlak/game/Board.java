package com.hadlak.game;

public class Board {

    private int size;

    public Board(int size) {
        this.size = size;
    }

    public void printBoard(){
        for (int i = 1; i <= (size * 2); i ++ )
        {
            for (int j = 1; j <= (size * 6); j ++){
                if (i % 2 == 1){
                    System.out.print("-");
                } else if (j % 6 == 1 ){
                    System.out.print("|");
                } else if (j % 6 == 3){
                    System.out.print("S");
                }
                if (j == (size * 6)){
                    System.out.print("|\n");
                }
            }
        }
    }
}
