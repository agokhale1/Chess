package piece;

import handler.*;

public class King extends Piece {
	
	public King(Player p, Position pos)
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
		
		return Move.checkSquare(getPosition(), newPos);
		
//		if(newPos.checkValidPos())
//		{
//			
//			if((newPos.getDistanceX(getPosition()) == 1 && newPos.getDistanceY(getPosition()) == 0) || (newPos.getDistanceX(getPosition()) == 0 && newPos.getDistanceY(getPosition()) == 1) || (newPos.getDistanceX(getPosition()) == 1 && newPos.getDistanceY(getPosition()) == 1))
//				return true;
//			else
//				return false;
//			
//		}
//		else
//			return false;
		
	}
	
	@Override
	public PieceType getPieceType()
	{
		return PieceType.KING;
	}
	
	@Override
	public String toString()
	{
		return getPlayer().toString().substring(0, 1).toLowerCase() + "K(" + getPosition().getX() + "," + getPosition().getY() + ")";
	}
	
}