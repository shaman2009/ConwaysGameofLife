import java.awt.Point;
import java.util.ArrayList;
import java.util.List;

public class Block {
	private List<Point> points = new ArrayList<Point>();

	public Block(int x, int y) {
		for(int i = 0; i < x / 2; i++) {
			for(int j = 0; j < x / 2; j++) {
				points.add(new Point(i, j));
			}
		}
	}
	public List<Point> Result() {
		return points;
	}
	

}
