/**
 * 
 */
package co.edu.uan.paola;

/**
 * @author Paola Rincón
 *
 *Para este ejercicio, se evidencio que el error estaba en el a la
 *declaracion de la capacity, cuando de corrio se quedaba colgado
 *se agrega capacity <=0 y corre. 
 *
 *
 */
 
public class Knapsack {
	

	public static int knapsack(int[] values, int[] weights, int i, int capacity) {
		if (i <= 0 || capacity <= 0) {
			return 0;
		} else if (weights[i] > capacity) {
			return knapsack(values, weights, i-1, capacity);
		} else {
			int a = knapsack(values, weights, i - 1, capacity);
			int b = knapsack(values, weights, i - 1, capacity - weights[i]) + values[i];
			return Math.max(a, b);
		}
	}
	
	public static int solve(int[] values, int[] weights, int capacity ) {
		if (values == null || weights == null) {
			throw new IllegalArgumentException("Array is null");
		}
		if (values.length != weights.length) {
			throw new IllegalArgumentException("Arrays have different lengths");
		}
		
		return knapsack(values, weights, values.length-1, capacity);
	}
	
	public static void main(String[] args) {
		int[] array1 = {120000, 40000, 250000, 80000, 150000};
		int[] array2 = {2, 1, 3, 1, 4};
		System.out.println(solve(array1, array2, 5));
	}
}
