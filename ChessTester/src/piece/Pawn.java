package piece;

import core.*;
import handler.*;

public class Pawn extends Piece {

	private boolean hasMoved;

	public Pawn(Player p, Position pos, boolean hasMoved)
	{
		super(p, pos);
		this.hasMoved = hasMoved;
	}

	public boolean hasMoved()
	{
		return hasMoved;
	}

	@Override
	public void move(Position newPos)
	{

		if(canMakeLegalMove(newPos))
			Move.handleMove(getPosition(), newPos);

	}

	@Override
	public boolean canMakeLegalMove(Position newPos)
	{

		if(newPos.checkValidPos())
		{

			if(newPos.getDistanceY(getPosition()) == 0)
			{

				if(newPos.getDistanceX(getPosition()) == 1)
				{

					if(Board.isBlankTile(newPos))
						return true;
					else
						return false;

				}
				else if(newPos.getDistanceX(getPosition()) == 2)
				{

					if(hasMoved)
						return false;
					else
					{

						if(Board.isBlankTile(newPos))
							return true;
						else
							return false;

					}

				}
				else
					return false;
				
			}
			
			//Pawn Capturing
			else if(newPos.getDistanceY(getPosition()) == 1 && newPos.getDistanceX(getPosition()) == 1)
			{
			
				if(!Board.isBlankTile(newPos) && Board.getPiece(getPosition()).getPlayer() != Board.getPiece(newPos).getPlayer())
					return true;
				else
					return false;
			
			}
			else
				return false;

		}
		else
			return false;
		
	}

	@Override
	public PieceType getPieceType()
	{
		return PieceType.PAWN;
	}

	@Override
	public String toString()
	{
		return getPlayer().toString().substring(0, 1).toLowerCase() + "P(" + getPosition().getX() + "," + getPosition().getY() + ")";
	}

}