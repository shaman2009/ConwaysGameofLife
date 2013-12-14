import java.awt.Point;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;


public class TestLife {
	
	@Test
	public void testBlock() {
		Block block = new Block(10, 10);
		List<Point> points = block.Result();
		Assert.assertFalse(points == null);
	}
	
	@Test
	public void testLivingCountsEqualsThree() {
		Block block = new Block(10, 10);
		List<Point> pointList = block.Result();
		ChangeStatus changeStatus = new ChangeStatus();
		Assert.assertEquals(3, changeStatus.getLivingCounts(new Point(0, 0), pointList));
		Assert.assertEquals(6, changeStatus.getLivingCounts(new Point(1, 0), pointList));
		Assert.assertEquals(8, changeStatus.getLivingCounts(new Point(1, 1), pointList));
		Assert.assertEquals(3, changeStatus.getLivingCounts(new Point(5, 5), pointList));

	}
	
	
}
