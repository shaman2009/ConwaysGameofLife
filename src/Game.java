
public class Game {
	
	int cellCount;
	
	public Game(int cellCount) {
		this.cellCount = cellCount;
	}
	
	

	public int[] getNextGeneration() {
		int[] result = new int[cellCount];
		if (cellCount == 1) {
			result[0] = 0;
		} else if (cellCount == 2) {
			result[0] = 0;
			result[1] = 0;
		}
		
		
		return result;
	}

}
