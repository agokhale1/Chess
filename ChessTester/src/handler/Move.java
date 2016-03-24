package handler;

import core.*;
import piece.*;

public class Move {
	
	public static void handleMove(Position oldPos, Position newPos)
	{
		
		Piece temp = Board.getBoard()[oldPos.getX()][oldPos.getY()];
		Board.getBoard()[oldPos.getX()][oldPos.getY()] = null;
		temp.setPosition(newPos);
		Board.getBoard()[newPos.getX()][newPos.getY()] = temp;
		
	}
	
	public static boolean checkSquare(Position oldPos, Position newPos)
	{
		
		if(!newPos.checkValidPos() || !Board.isBlankTile(newPos)) return false;
		if((newPos.getDistanceX(oldPos) == 1 && newPos.getDistanceY(oldPos) == 0) || (newPos.getDistanceX(oldPos) == 0 && newPos.getDistanceY(oldPos) == 1) || (newPos.getDistanceX(oldPos) == 1 && newPos.getDistanceY(oldPos) == 1))
			return true;
		
		return false;
	}
	
	public static boolean checkDiagonal(Position oldPos, Position newPos)
	{
		
		if(!newPos.checkValidPos() || !Board.isBlankTile(newPos)) return false;
		if(newPos.getDistanceX(oldPos) != 0 && newPos.getDistanceY(oldPos) != 0 && newPos.getDistanceX(oldPos) == newPos.getDistanceY(oldPos))
				return true;
		
		return false;
	}
	
	public static boolean checkHorizontal(Position oldPos, Position newPos)
	{
		
		if(!newPos.checkValidPos() || !Board.isBlankTile(newPos)) return false;
		if(newPos.getDistanceX(oldPos) == 0 && newPos.getDistanceY(oldPos) != 0)
			return true;
		
		return false;
	}
	
	public static boolean checkVertical(Position oldPos, Position newPos)
	{
		
		if(!newPos.checkValidPos() || !Board.isBlankTile(newPos)) return false;
		if(newPos.getDistanceX(oldPos) != 0 && newPos.getDistanceY(oldPos) == 0)
			return true;
		
		return false;
	}
	
}