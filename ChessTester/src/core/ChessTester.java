package core;

import handler.Position;

public class ChessTester {
	
	public static void main(String[] args)
	{
		
		Board b = new Board();
		
		b.initBoard();
		b.printBoard();
		
		System.out.println("\n\n");
		
		Board.getBoard()[4][3].move(new Position(3, 2));
		b.printBoard();
		
	}
	
}