/**
 * 
 */
package co.edu.uan.paola;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/**
 * @author Paola Rincón
 *
 */
class Ejercicio2SuccessTest {

	/**
	 * Test method for {@link co.edu.uan.paola.Ejercicio2#average(int[])}.
	 */
	@Test
	void test1Average() {
		int[] a = {0, 0, 0, 0};
		assertEquals(0, Ejercicio2.average(a));
	}
	
	@Test
	void test2Average() {
		int[] a = {0, 1, 1, 0};
		assertEquals(0, Ejercicio2.average(a));
	}
	
	@Test
	void test3Average() {
		int[] a = {0, 1, 1, 0, 0, 2, 0, 1};
		assertEquals(0, Ejercicio2.average(a));
	}
}
