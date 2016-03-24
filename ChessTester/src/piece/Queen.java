package piece;

import handler.*;

public class Queen extends Piece {
	
	public Queen(Player p, Position pos)
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
		
		//TODO: maybe remove checkSquare in future
		return Move.checkSquare(getPosition(), newPos) || Move.checkDiagonal(getPosition(), newPos) || Move.checkVertical(getPosition(), newPos) || Move.checkHorizontal(getPosition(), newPos);
		
//		if(newPos.checkValidPos())
//		{
//			
//			if((newPos.getDistanceX(getPosition()) == 1 && newPos.getDistanceY(getPosition()) == 0) || (newPos.getDistanceX(getPosition()) == 0 && newPos.getDistanceY(getPosition()) == 1) || (newPos.getDistanceX(getPosition()) == 1 && newPos.getDistanceY(getPosition()) == 1)
//				|| (newPos.getDistanceX(getPosition()) != 0 && newPos.getDistanceY(getPosition()) != 0 && newPos.getDistanceX(getPosition()) == newPos.getDistanceY(getPosition())
//				|| (newPos.getDistanceX(getPosition()) != 0 && newPos.getDistanceY(getPosition()) == 0) || (newPos.getDistanceX(getPosition()) == 0 && newPos.getDistanceY(getPosition()) != 0)))
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
		return PieceType.QUEEN;
	}
	
	@Override
	public String toString()
	{
		return getPlayer().toString().substring(0, 1).toLowerCase() + "Q(" + getPosition().getX() + "," + getPosition().getY() + ")";
	}
	
}