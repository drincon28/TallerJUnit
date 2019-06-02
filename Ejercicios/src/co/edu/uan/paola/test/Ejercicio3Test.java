package co.edu.uan.paola.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import co.edu.uan.paola.Ejercicio3;

/**
 * 
 * @author Paola Rinc�n
 * 
 * Para este caso no se puede generar una prueba aleatoria donde los datos de entrada
 * sean uniformes e independientes, ya que JUnit requiere que se conozca de antemano
 * el resultado de la prueba, es decir, si yo genero l y r aleatoriamente, no puedo 
 * saber en tiempo de compilaci�n cu�l es el subarray que se elegir� y por tanto es 
 * imposible calcular de antemano el promedio de dicho subarray. A esto sum�smole que 
 * si el array tiene sus elementos en orden aleatorio, la cosa se complica a�n m�s, ya 
 * que incluso si se conoce l o r no s� cu�les son los elementos que estar�n dentro 
 * del subarray.
 * Revisando el c�digo se evidencia que el bug est� en el if, en la condici�n que 
 * evalua que l sea menor o IGUAL a r. Esto significa que si ambos son iguales no se 
 * obtendr� ning�n subarray y al intentar calcular el promedio ser� una divisi�n de 0
 * (la suma) sobre 0 (el conteo) y esto genera una Exception.
 * Ante la pregunta de �cu�l es la probabilidad de encontrar un bug ante unas pruebas
 * "aleatorias" es igual a la probabilidad de que dos n�meros generados se repitan.
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
