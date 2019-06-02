/**
 * 
 */
package co.edu.uan.paola.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import co.edu.uan.paola.Ejercicio2;

/**
 * @author Paola Rincón
 * 
 * El ejercicio empieza a iterar desde el índice 1
 * pero los arrays empiezan desde el índice 0
 * por lo tanto, se está omitiendo el primer elemento al
 * momento de calcular la suma y se divide sobre el número
 * completo de elementos.
 *
 */
class Ejercicio2Test {

	/**
	 * Test method for {@link co.edu.uan.paola.Ejercicio2#average(int[])}.
	 */
	@Test
	void testAverage() {
		int[] a = {1, 1, 1, 1, 1};
		assertEquals(1, Ejercicio2.average(a));
	}

}
