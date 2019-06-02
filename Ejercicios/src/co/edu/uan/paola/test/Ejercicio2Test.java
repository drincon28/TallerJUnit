/**
 * 
 */
package co.edu.uan.paola.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import co.edu.uan.paola.Ejercicio2;

/**
 * @author Paola Rinc�n
 * 
 * El ejercicio empieza a iterar desde el �ndice 1
 * pero los arrays empiezan desde el �ndice 0
 * por lo tanto, se est� omitiendo el primer elemento al
 * momento de calcular la suma y se divide sobre el n�mero
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
