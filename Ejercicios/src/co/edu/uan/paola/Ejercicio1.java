/**
 * 
 */
package co.edu.uan.paola;

/**
 * @author Paola Rincón
 *
 */
public class Ejercicio1 {

	public static int indexOf(int[] a, int n) {
		if (a == null) {
			throw new IllegalArgumentException("Array is null");
		}
		int index = -1;
		for (int i = 0; i <= a.length; i++) {
			if (a[i] == n) {
				index = i;
				break;
			}
		}
		return index;
	}

}
