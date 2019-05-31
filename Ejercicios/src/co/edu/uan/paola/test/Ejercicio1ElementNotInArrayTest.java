package co.edu.uan.paola.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import co.edu.uan.paola.Ejercicio1;

class Ejercicio1ElementNotInArrayTest {

	@Test
	void testNotInArrayIndexOf() {
		int[] a = {2,7,6,4,8,3};
		Throwable exception = assertThrows(ArrayIndexOutOfBoundsException.class, ()->Ejercicio1.indexOf(a, 5), "El elemento no se encuentra en el array");
		exception.printStackTrace();
	}

}
