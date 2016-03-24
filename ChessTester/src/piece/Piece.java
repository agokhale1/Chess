package piece;

import handler.*;

public abstract class Piece {
	
	private Player p;
	private Position pos;
	
	public Piece(Player p, Position pos)
	{
		this.p = p;
		this.pos = pos;
	}
	
	public abstract void move(Position newPos);
	public abstract boolean canMakeLegalMove(Position newPos);
	public abstract PieceType getPieceType();
	public abstract String toString();
	
	public Player getPlayer()
	{
		return p;
	}
	
	public Position getPosition()
	{
		return pos;
	}
	
	public void setPosition(Position newPos)
	{
		pos = newPos;
	}
	
}