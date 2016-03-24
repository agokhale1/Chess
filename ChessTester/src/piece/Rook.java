package piece;

import handler.*;

public class Rook extends Piece {
	
	public Rook(Player p, Position pos)
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
		
		return Move.checkVertical(getPosition(), newPos) || Move.checkHorizontal(getPosition(), newPos);
		
//		if(newPos.checkValidPos())
//		{
//			
//			if((newPos.getDistanceX(getPosition()) != 0 && newPos.getDistanceY(getPosition()) == 0) || (newPos.getDistanceX(getPosition()) == 0 && newPos.getDistanceY(getPosition()) != 0))
//			{
//				
//				if(Board.isBlankTile(newPos))
//					return true;
//				else
//					return false;
//				
//			}
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
		return PieceType.ROOK;
	}
	
	@Override
	public String toString()
	{
		return getPlayer().toString().substring(0, 1).toLowerCase() + "R(" + getPosition().getX() + "," + getPosition().getY() + ")";
	}
	
}