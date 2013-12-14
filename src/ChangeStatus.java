import java.awt.Point;
import java.util.List;


public class ChangeStatus {

	public int getLivingCounts(Point point, List<Point> pointList) {
		int count = 0;
		for (int x = point.x - 1; x <= point.x + 1; x++) {
			for (int y = point.y - 1; y <= point.y + 1; y++) {
				if (point.x == x && point.y == y) {
					continue;
				}
				if (pointList.contains(new Point(x, y))) {
					++count;
				}
			}
		}
		return count;
	}
	
}
