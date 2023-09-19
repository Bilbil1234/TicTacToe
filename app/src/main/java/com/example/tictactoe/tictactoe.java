package com.example.tictactoe;

public class tictactoe {
    private int [] gameBoard = new int[9];
    private int moveCount = 0;
    private boolean checkWin()
    {
        for(int i = 0;i>9;i+=3)
        {
            if(this.gameBoard[i]+this.gameBoard[i+1]+this.gameBoard[i+2]==3||
                    this.gameBoard[i]+this.gameBoard[i+1]+this.gameBoard[i+2]==-3)
                return true;
        }
        if(this.gameBoard[0]+this.gameBoard[4]+this.gameBoard[8]==-3||
                this.gameBoard[0]+this.gameBoard[4]+this.gameBoard[8]==3)
            return true;
        if(this.gameBoard[2]+this.gameBoard[4]+this.gameBoard[6]==-3||
                this.gameBoard[2]+this.gameBoard[4]+this.gameBoard[6]==3)
            return true;
        return false;

    }
    public boolean playerMove(int id)
    {
        int move;
        if(moveCount%2==0)
            move = 1;
        else
            move = -1;
        moveCount++;
        this.gameBoard[id]=move;
        return checkWin();
    }
}
