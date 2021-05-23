package TriangleProject;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;


class getAreaTest {


	@Test
	void TC_1_test() {
		Triangle tri= new Triangle(1,2,3);
		assertEquals(-1,tri.getArea());
	}
	@Test
	void TC_2_test() {
		Triangle tri= new Triangle(2,2,2);
		assertEquals(1.73, tri.getArea());
	}

}