package handler;

public class Position {
	
	private int x, y;
	
	public Position(int x, int y)
	{
		this.x = x;
		this.y = y;
	}
	
	/**
	 * Checks if the position is valid (i.e. a valid row and column
	 * when accessing elements in the 2D array of pieces.
	 * 
	 * @return true if position is valid, false if not valid
	 */
	public boolean checkValidPos()
	{
		return (getX() >= 0 && getX() < 8 && getY() >= 0 && getY() < 8);
	}
	
	/**
	 * Calculates the vertical distance between two positions.
	 * 
	 * @param oldPos
	 * @return distance
	 */
	public int getDistanceX(Position oldPos)
	{
		return Math.abs(getX() - oldPos.getX());
	}
	
	/**
	 * Calculates the horizontal distance between two positions.
	 * 
	 * @param oldPos
	 * @return distance
	 */
	public int getDistanceY(Position oldPos)
	{
		return Math.abs(getY() - oldPos.getY());
	}
	
	public int getX()
	{
		return x;
	}
	
	public int getY()
	{
		return y;
	}
	
	public void setX(int x)
	{
		this.x = x;
	}
	
	public void setY(int y)
	{
		this.y = y;
	}
	
}