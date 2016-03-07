package geometry;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import edu.udel.geometery.TriangleObject;

public class TriangleObjectTest {

	//TriangleObject triangleObject;
	@Before
	public void setUp() throws Exception {
	//	triangleObject = new TriangleObject(2,3,4);
	}

	@Test
	public void testArea() {
		TriangleObject triangleObject = new TriangleObject(2,3,4);
		assertEquals(triangleObject.getArea(), 2.904, 0.1); ;
	}
	
	@Test
	public void testPerimeter() {
		TriangleObject triangleObject = new TriangleObject(2,3,4);
		assertEquals(triangleObject.getPerimeter(), 9, 0.0); ;
	}
	
	@Test
	public void test2Perimeter() {
		TriangleObject triangleObject = new TriangleObject(3,4,5);
		assertEquals(triangleObject.getPerimeter(), 12, 0.0); ;
	}
}
