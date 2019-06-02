package co.edu.uan.paola.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import co.edu.uan.paola.Ejercicio3;

/**
 * 
 * @author Paola Rincón
 * 
 * Para este caso no se puede generar una prueba aleatoria donde los datos de entrada
 * sean uniformes e independientes, ya que JUnit requiere que se conozca de antemano
 * el resultado de la prueba, es decir, si yo genero l y r aleatoriamente, no puedo 
 * saber en tiempo de compilación cuál es el subarray que se elegirá y por tanto es 
 * imposible calcular de antemano el promedio de dicho subarray. A esto sumésmole que 
 * si el array tiene sus elementos en orden aleatorio, la cosa se complica aún más, ya 
 * que incluso si se conoce l o r no sé cuáles son los elementos que estarán dentro 
 * del subarray.
 * Revisando el código se evidencia que el bug está en el if, en la condición que 
 * evalua que l sea menor o IGUAL a r. Esto significa que si ambos son iguales no se 
 * obtendrá ningún subarray y al intentar calcular el promedio será una división de 0
 * (la suma) sobre 0 (el conteo) y esto genera una Exception.
 * Ante la pregunta de ¿cuál es la probabilidad de encontrar un bug ante unas pruebas
 * "aleatorias" es igual a la probabilidad de que dos números generados se repitan.
 *
 */
class Ejercicio3Test {

	private int[] array;
	
	@BeforeEach
	void setUp() throws Exception {
		for(int i = 1;  i <= 100; i++) {
			array[i] = i;
		}
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void test1AverageSubarray() {
		assertEquals(2, Ejercicio3.averageSubarray(array, 1, 2));
	}

}
