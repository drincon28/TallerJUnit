package co.edu.uan.paola.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import co.edu.uan.paola.Ejercicio1;

class Ejercicio1EmptyArrayTest {

	/**
	 * En este caso de prueba validamos como responde el m�todo
	 * cuando se env�a un array vac�o. Dado que se intenta iterar
	 * un array vac�o, se debe generar una excepci�n del tipo
	 * ArrayIndexOutOfBoundsException.
	 * Adicionalmente se imprime la traza de la excepci�n que demuestra
	 * el origen de esta.
	 */
	@Test
	void testIndexOfEmptyArray () {
		int[] b = new int[0];
		Throwable exception = assertThrows(ArrayIndexOutOfBoundsException.class, ()->Ejercicio1.indexOf(b, 2), "El arreglo no tiene elementos");
		exception.printStackTrace();
	}

}
