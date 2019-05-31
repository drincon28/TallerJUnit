package co.edu.uan.paola.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import co.edu.uan.paola.Ejercicio1;

class Ejercicio1EmptyArrayTest {

	/**
	 * En este caso de prueba validamos como responde el método
	 * cuando se envía un array vacío. Dado que se intenta iterar
	 * un array vacío, se debe generar una excepción del tipo
	 * ArrayIndexOutOfBoundsException.
	 * Adicionalmente se imprime la traza de la excepción que demuestra
	 * el origen de esta.
	 */
	@Test
	void testIndexOfEmptyArray () {
		int[] b = new int[0];
		Throwable exception = assertThrows(ArrayIndexOutOfBoundsException.class, ()->Ejercicio1.indexOf(b, 2), "El arreglo no tiene elementos");
		exception.printStackTrace();
	}

}
