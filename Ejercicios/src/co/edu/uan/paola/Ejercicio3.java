/**
 * 
 */
package co.edu.uan.paola;

/**
 * @author Paola Rincón
 *
 */
public class Ejercicio3 {

	/**
	 * Calcula el promedio de los valores en el arreglo en un rango dado.
	 * 
	 * @param a Arreglo con los valores a promediar.
	 * @param l Inicio del rango de valores a promediar (incluido)
	 * @param r Fin del rango de valores a promediar (no incluido)
	 * @return Promedio de los valores en el arreglo.
	 */
	public static int averageSubarray(int[] a, int l, int r) {
		if (a != null && l >= 0 && r <= a.length && l <= r) {
			int sum = 0;
			int count = 0;
			while (l < r) {
				sum = sum + a[l];             
				count = count + 1;             
				l = l + 1;
			}
			return sum / count;
		} else {
			return 0;
		} 
	}
}
