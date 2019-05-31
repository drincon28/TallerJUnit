/**
 * 
 */
package co.edu.uan.paola;

/**
 * @author Paola Rincón
 *
 */
public class Ejercicio2 {

	/**
	 * Calcula y retorna el promedio de los enteros en el arreglo a.
	 * 
	 * @param a Arreglo con los valores a promediar.
	 * @return Promedio de los valores en el arreglo.
	 */
	public static int average(int[] a) {
		if (a == null) {
			throw new IllegalArgumentException("Array is null");
		}
		if (a.length == 0) {
			throw new IllegalArgumentException("Array is empty");
		}
		int sum = 0;
		for (int i = 1; i < a.length; i++) {
			sum += a[i];
		}
		System.out.println(sum + " " + a.length + " " +sum / a.length);
		return sum / a.length;
	}

	public static void main(String[] args) {
		int[] a = {1, 1,1,1,1};
		Ejercicio2.average(a);
	}
}
