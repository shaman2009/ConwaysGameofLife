import java.util.List;
import java.util.Map;


public class Cell {
	private int x;
	private int y;
	private Map<String, Cell> neighbourCells;
	private boolean isLiving;
	private boolean nextStatus;
	


	public boolean isNextStatus() {
		return nextStatus;
	}


	public void setNextStatus(boolean nextStatus) {
		this.nextStatus = nextStatus;
	}


	public Cell(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	
	public boolean isLiving() {
		return isLiving;
	}
	public void setLiving(boolean isLiving) {
		this.isLiving = isLiving;
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}


	public Map<String, Cell> getNeighbourCells() {
		return neighbourCells;
	}


	public void setNeighbourCells(Map<String, Cell> neighbourCells) {
		this.neighbourCells = neighbourCells;
	}
	
}
