import java.util.HashMap;
import java.util.Map;
import java.util.Random;


public class CellBoard {

	Map<String, Cell> g_cells = new HashMap<String, Cell>();
	public Map<String, Cell> init() {
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				Cell cell = new Cell(i, j);
				cell.setLiving(new Random().nextBoolean());
				String str = i + "," + j;
				g_cells.put(str, cell);
			}
		}
		
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				String str = i + "," + j;
				Cell cell = g_cells.get(str);
				cell.setNeighbourCells(getNeighbourCells(cell));
			}
		}
		
		
		
		
		return g_cells;
	}
	public Map<String, Cell> getNeighbourCells(Cell cell) {
		Map<String, Cell> cells = new HashMap<String, Cell>();
		int x = cell.getX();
		int y = cell.getY();
		
		
		for (int i = (x - 1); i <= (x + 1) ; i++) {
			for (int j = (y - 1); j <= (y + 1); j++) {
				String key = i + "," + j;
				if (i == x && j == y) {
					continue;
				}
				if (g_cells.get(key) != null) {
					cells.put(key, g_cells.get(key));
				}
			}
		}
		
		return cells;
	}
	
	
	public boolean getNextGeneration(Cell cell) {
		boolean result = false;
		int aliveCount = 0;
		Map<String, Cell> neighbourCells = cell.getNeighbourCells();
		for (Cell neighbourCell : neighbourCells.values()) {
			if (neighbourCell.isLiving()) {
				aliveCount++;
			}
		}
		if (aliveCount == 2 || aliveCount ==3 ) {
			result = true;
		}
		return result;
	}
	
	public Map<String, Cell> getCellsNextStatus(Map<String, Cell> cells) {
		for (Cell cell : cells.values()) {
			cell.setNextStatus(getNextGeneration(cell));
		}
		return cells;
	}
	
}
