package handler;

import core.*;
import piece.*;

public class Move
{

	public static void handleMove(Position oldPos, Position newPos)
	{

		Piece temp = Board.getBoard()[oldPos.getX()][oldPos.getY()];
		Board.getBoard()[oldPos.getX()][oldPos.getY()] = null;
		temp.setPosition(newPos);
		Board.getBoard()[newPos.getX()][newPos.getY()] = temp;

	}

	public static boolean checkSquare(Position oldPos, Position newPos)
	{

		if(!newPos.checkValidPos())
			return false;
		if((newPos.getDistanceX(oldPos) == 1 && newPos.getDistanceY(oldPos) == 0) || (newPos.getDistanceX(oldPos) == 0 && newPos.getDistanceY(oldPos) == 1) || (newPos.getDistanceX(oldPos) == 1 && newPos.getDistanceY(oldPos) == 1))
		{
			// Capturing
			if(!Board.isBlankTile(newPos))
				if(Board.getPiece(newPos).getPlayer() != Board.getPiece(oldPos).getPlayer())
					return true;
				else
					return false;

			return true;
		}

		return false;
	}

	public static boolean checkDiagonal(Position oldPos, Position newPos)
	{

		if(!newPos.checkValidPos())
			return false;
		if(newPos.getDistanceX(oldPos) != 0 && newPos.getDistanceY(oldPos) != 0 && newPos.getDistanceX(oldPos) == newPos.getDistanceY(oldPos))
		{
			// Checks if there is a piece between current and desired positions
			if(newPos.getY() > oldPos.getY() && newPos.getX() > oldPos.getX())
				for(int i = oldPos.getX() + 1, j = oldPos.getY() + 1; i < newPos.getX() && j < newPos.getY(); i++, j++)
				{
					if(!Board.isBlankTile(new Position(i, j)))
						return false;
				}
			if(newPos.getY() > oldPos.getY() && newPos.getX() < oldPos.getX())
				for(int i = oldPos.getX() - 1, j = oldPos.getY() + 1; i > newPos.getX() && j < newPos.getY(); i--, j++)
				{
					if(!Board.isBlankTile(new Position(i, j)))
						return false;
				}
			if(newPos.getY() < oldPos.getY() && newPos.getX() < oldPos.getX())
				for(int i = oldPos.getX() - 1, j = oldPos.getY() - 1; i > newPos.getX() && j > newPos.getY(); i--, j--)
				{
					if(!Board.isBlankTile(new Position(i, j)))
						return false;
				}
			if(newPos.getY() < oldPos.getY() && newPos.getX() > oldPos.getX())
				for(int i = oldPos.getX() + 1, j = oldPos.getY() - 1; i < newPos.getX() && j > newPos.getY(); i++, j--)
				{
					if(!Board.isBlankTile(new Position(i, j)))
						return false;
				}
			// Capturing
			if(!Board.isBlankTile(newPos))
				if(Board.getPiece(newPos).getPlayer() != Board.getPiece(oldPos).getPlayer())
					return true;
				else
					return false;
			return true;
		}

		return false;
	}

	public static boolean checkHorizontal(Position oldPos, Position newPos)
	{

		if(!newPos.checkValidPos())
			return false;
		if(newPos.getDistanceX(oldPos) == 0 && newPos.getDistanceY(oldPos) != 0)
		{
			// Checks for pieces between desired and current positions
			if((oldPos.getY() > newPos.getY()))
			{
				for(int i = oldPos.getY() - 1; i > newPos.getY(); i--)
					if(!Board.isBlankTile(new Position(oldPos.getX(), i)))
						return false;
			}
			else if(oldPos.getY() < newPos.getY())
			{
				for(int i = oldPos.getY() + 1; i < newPos.getY(); i++)
					if(!Board.isBlankTile(new Position(oldPos.getX(), i)))
						return false;
			}
			// Capturing
			if(!Board.isBlankTile(newPos))
				if(Board.getPiece(newPos).getPlayer() != Board.getPiece(oldPos).getPlayer())
					return true;
				else
					return false;

			return true;
		}

		return false;
	}

	public static boolean checkVertical(Position oldPos, Position newPos)
	{

		if(!newPos.checkValidPos())
			return false;
		if(newPos.getDistanceX(oldPos) != 0 && newPos.getDistanceY(oldPos) == 0)
		{
			// Checks for pieces between desired and current positions
			if((oldPos.getX() > newPos.getX()))
			{
				for(int i = oldPos.getX() - 1; i > newPos.getX(); i--)
					if(!Board.isBlankTile(new Position(i, oldPos.getY())))
						return false;
			}
			else if(oldPos.getX() < newPos.getX())
			{
				for(int i = oldPos.getX() + 1; i < newPos.getX(); i++)
					if(!Board.isBlankTile(new Position(i, oldPos.getY())))
						return false;
			}
			// Capturing
			if(!Board.isBlankTile(newPos))
			{
				if(Board.getPiece(newPos).getPlayer() != Board.getPiece(oldPos).getPlayer())
					return true;
				else
					return false;
			}
			else
				return true;
		}

		return false;
	}

	public static boolean checkKnight(Position oldPos, Position newPos)
	{

		if(!newPos.checkValidPos())
			return false;
		if((newPos.getDistanceX(oldPos) == 1 && newPos.getDistanceY(oldPos) == 2) || (newPos.getDistanceX(oldPos) == 2 && newPos.getDistanceY(oldPos) == 1))
		{
			if(!Board.isBlankTile(newPos))
			{
				if(Board.getPiece(newPos).getPlayer() != Board.getPiece(oldPos).getPlayer())
					return true;
				else
					return false;
			}
			else
				return true;
		}
		return false;
	}

}