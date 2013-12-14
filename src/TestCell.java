import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;




public class TestCell {
	
	@Test
	public void singleCellWillDie() {
		Game g = new Game(1);
		int[] actualCells = g.getNextGeneration();
		assertArrayEquals(new int[]{0}, actualCells);
		
	}
	
	@Test
	public void twoLivingCellsWillDie() {
		Game g = new Game(2);
		
		int[] cellsArray = null;
		
		cellsArray = g.getNextGeneration();
		
		
		assertArrayEquals(new int[]{0, 0}, cellsArray);
	}
	
	
	
	
	
}
