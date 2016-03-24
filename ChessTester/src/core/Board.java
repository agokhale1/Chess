package core;

import handler.*;
import piece.*;

public class Board {
	
	private static Piece[][] board;
	
	public void initBoard()
	{
		
		board = new Piece[8][8];
		
//		board[0][0] = new Rook(Player.BLACK, new Position(0, 0));
//		board[0][1] = new Knight(Player.BLACK, new Position(0, 1));
//		board[0][2] = new Bishop(Player.BLACK, new Position(0, 2));
//		board[0][3] = new King(Player.BLACK, new Position(0, 3));
//		board[0][4] = new Queen(Player.BLACK, new Position(0, 4));
//		board[0][5] = new Bishop(Player.BLACK, new Position(0, 5));
//		board[0][6] = new Knight(Player.BLACK, new Position(0, 6));
//		board[0][7] = new Rook(Player.BLACK, new Position(0, 7));
//		
//		for(int i = 0; i < 8; i++)
//			board[1][i] = new Pawn(Player.BLACK, new Position(1, i), false);
//		
//		for(int i = 0; i < 8; i++)
//			board[6][i] = new Pawn(Player.WHITE, new Position(6, i), false);
//		
//		board[7][0] = new Rook(Player.WHITE, new Position(7, 0));
//		board[7][1] = new Knight(Player.WHITE, new Position(7, 1));
//		board[7][2] = new Bishop(Player.WHITE, new Position(7, 2));
//		board[7][3] = new Queen(Player.WHITE, new Position(7, 3));
//		board[7][4] = new King(Player.WHITE, new Position(7, 4));
//		board[7][5] = new Bishop(Player.WHITE, new Position(7, 5));
//		board[7][6] = new Knight(Player.WHITE, new Position(7, 6));
//		board[7][7] = new Rook(Player.WHITE, new Position(7, 7));
		
		board[4][3] = new Pawn(Player.WHITE, new Position(4, 3), false);
		
	}
	
	public static Piece[][] getBoard()
	{
		return board;
	}
	
	public static boolean isBlankTile(Position pos)
	{
		return board[pos.getX()][pos.getY()] == null;
	}
	
	public void printBoard()
	{
		
		for(Piece[] row : board)
		{
			
			for(Piece p : row)
			{
				
				if(p == null)
					System.out.print(p + "     ");
				else
					System.out.print(p + "  ");
				
			}
			System.out.println("\n");
		}
		
	}
	
}