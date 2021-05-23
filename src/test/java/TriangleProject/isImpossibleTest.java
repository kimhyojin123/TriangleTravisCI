package TriangleProject;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class isImpossibleTest {

	@Test
	void TC_1_test() {
		Triangle tri= new Triangle(1,2,3);
		assertTrue(tri.isImpossible());
	}
	@Test
	void TC_2_test() {
		Triangle tri= new Triangle(3,4,5);
		assertTrue(!tri.isImpossible());
	}
}
