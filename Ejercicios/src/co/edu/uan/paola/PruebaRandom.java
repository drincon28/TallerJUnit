/**
 * 
 */
package co.edu.uan.paola;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

/**
 * @author Paola Rincón
 * 
 * En este programa se generan aleatoriamente 100 números entre 1 y 100.
 * Se valida entonces cuántos de esos números se repiten y se calcula
 * el porcentaje de repetición. En el ejercicio 3, existe la condición
 * que l no puede ser mayor que r.
 * Luego de repetidas ejecuciones del programa se observa que el porcentaje
 * de repetición de los números en general está entre el 30% y el 45%.
 *
 */
public class PruebaRandom {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Random r = new Random(new Date().getTime());
		List<Integer> listaRandom = new ArrayList<Integer>();
		for (int i = 0; i < 100; i++) {
			Integer a = new Integer(r.nextInt(100)+1);
			System.out.println(a);
			listaRandom.add(a);
		}
		Collections.sort(listaRandom);
		System.out.println();
		for (int j = 0; j < listaRandom.size(); j++) {
			System.out.println(j + " : " + listaRandom.get(j));
		}
		Set<Integer> setRandom = new HashSet<Integer>(listaRandom);
		System.out.println("listaRandom.size(): "+listaRandom.size()+ " setRandom.size():  "+setRandom.size());
		double porcentaje = (double)((new Double(listaRandom.size()) - new Double(setRandom.size()))/new Double(listaRandom.size()));
		System.out.println("Probabilidad de que se repitan dos números generados aleatoriamente: " + (porcentaje*100) +"%");
	}

}
