package TriangleProject;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class classifyTest {

	@Test
	void TC_1_test() {
		Triangle tri= new Triangle(1,2,3);
		assertEquals("impossible", tri.classify());
	}
	@Test
	void TC_2_test() {
		Triangle tri= new Triangle(2,2,2);
		assertEquals("equilateral", tri.classify());
	}
	@Test
	void TC_3_test() {
		Triangle tri= new Triangle(2,3,2);
		assertEquals("isossceles", tri.classify());
	}
	@Test
	void TC_4_test() {
		Triangle tri= new Triangle(5,3,4);
		assertEquals("right-angled", tri.classify());
	}
	@Test
	void TC_5_test() {
		Triangle tri= new Triangle(2,5,4);
		assertEquals("scalene", tri.classify());
	}
}
