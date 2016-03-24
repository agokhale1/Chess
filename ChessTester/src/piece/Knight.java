package piece;

import core.*;
import handler.*;

public class Knight extends Piece {
	
	public Knight(Player p, Position pos)
	{
		super(p, pos);
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
			
			if((newPos.getDistanceX(getPosition()) == 2 && newPos.getDistanceY(getPosition()) == 1) || (newPos.getDistanceX(getPosition()) == 1 && newPos.getDistanceY(getPosition()) == 2))
			{
				
				if(Board.isBlankTile(newPos))
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
		return PieceType.KNIGHT;
	}
	
	@Override
	public String toString()
	{
		return getPlayer().toString().substring(0, 1).toLowerCase() + "N(" + getPosition().getX() + "," + getPosition().getY() + ")";
	}
	
}