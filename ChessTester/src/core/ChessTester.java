package core;

import java.util.*;

import handler.*;
import piece.*;

public class ChessTester {
	
	public static void main(String[] args)
	{
		
		Scanner in = new Scanner(System.in);
		Board b = new Board();
		
		b.initBoard();
		b.printBoard();
		
		boolean gameRunning = true;
		int x, y;
		
		while(gameRunning)
		{
			
			System.out.print("Enter piece you wish to move: ");
			x = in.nextInt();
			y = in.nextInt();
			
			Piece p = Board.getBoard()[x][y];
			
			System.out.print("Enter the new position: ");
			x = in.nextInt();
			y = in.nextInt();
			
			p.move(new Position(x, y));
			
			System.out.println("\n");
			b.printBoard();
			
		}
		in.close();
	}
	
}