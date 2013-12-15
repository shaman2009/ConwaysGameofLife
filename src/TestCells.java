import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.junit.Test;


public class TestCells {

	
//	@Test
	public void initTest() {
		CellBoard cellBoard = new CellBoard();
		Map<String, Cell> cells = cellBoard.init();
		Assert.assertTrue(!cells.isEmpty());
		Assert.assertEquals(100, cells.size());
		for (Cell cell : cells.values()) {
			System.out.println(cell.isLiving());
		}
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				if(cells.get(i + "," + j).isLiving()) {
					System.out.print(" * ");
				} else {
					System.out.print(" # ");
				}
			}
			System.out.println();
		}
	}
	
	
	@Test
	public void getCellsNextStatusTest() {
		CellBoard cellBoard = new CellBoard();
		Map<String, Cell> cells = cellBoard.init();
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				if(cells.get(i + "," + j).isLiving()) {
					System.out.print(" * ");
				} else {
					System.out.print(" # ");
				}
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println();
		System.out.println();
		cells = cellBoard.getCellsNextStatus(cells);
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				if(cells.get(i + "," + j).isNextStatus()) {
					System.out.print(" * ");
				} else {
					System.out.print(" # ");
				}
			}
			System.out.println();
		}
	}
	
	
	
}
