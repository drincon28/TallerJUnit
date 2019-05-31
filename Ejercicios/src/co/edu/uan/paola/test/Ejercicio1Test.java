package co.edu.uan.paola.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import co.edu.uan.paola.Ejercicio1;

/**
 * 
 * @author Paola Rincón
 * 
 * En este caso de prueba se valida el índice del segundo parámetro.
 * El caso de prueba debe ser exitoso, ya que el número 2 se encuentra
 * en el índice 1 del array.
 *
 */
class Ejercicio1Test {

	@Test
	void testIndexOf() {
		int[] a = {1, 2, 3};
		int result = Ejercicio1.indexOf(a, 2);
		assertEquals(1, result, "El elemento se encuentra en la posición 1");
	}
	
	@Test
	void test2IndexOf() {
		int[] a = {15000, 2, 9,74, 19, 27};
		assertEquals(5, Ejercicio1.indexOf(a, 27));
	}

	@Test
	void test3IndexOf() {
		int[] a = {14, 6, 19, 4, 19, 27};
		assertEquals(2, Ejercicio1.indexOf(a, 19));
	}
	
	@Test
	void test4IndexOf() {
		int[] a = {5};
		assertEquals(0, Ejercicio1.indexOf(a, 5));
	}
}
