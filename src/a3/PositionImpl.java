package a3;

public class PositionImpl implements Position {
	private Integer xPos;
	private Integer yPos;
	public PositionImpl(int x, int y) {
		xPos = x;
		yPos = y;
		
	}
	public int getX() {
		return xPos;
	}
	public int getY() {
		return yPos;
	}
	
}
