/**
 * 
 */
package co.edu.uan.paola.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import co.edu.uan.paola.Ejercicio1;

/**
 * @author Paola Rincón
 *
 */
class Ejercicio1NullArrayTest {

	/**
	 * Test method for {@link co.edu.uan.paola.test.Ejercicio1Test#testIndexOf()}.
	 */
	@Test
	void testIndexOf() {
		Throwable t = assertThrows(IllegalArgumentException.class, ()->Ejercicio1.indexOf(null, 2), "El arreglo enviado es nulo");
		t.printStackTrace();
	}
	
	@Test
	void test2IndexOf() {
		int[] a = {1, 2, 3};
		int result = Ejercicio1.indexOf(a, 2);
		assertEquals(1, result, "El elemento se encuentra en la posición 1");
	}
	
	@Test
	void test3IndexOf() {
		int[] a = {15000, 2, 9,74, 19, 27};
		assertEquals(5, Ejercicio1.indexOf(a, 27));
	}

	@Test
	void test4IndexOf() {
		int[] a = {14, 6, 19, 4, 19, 27};
		assertEquals(2, Ejercicio1.indexOf(a, 19));
	}

}
