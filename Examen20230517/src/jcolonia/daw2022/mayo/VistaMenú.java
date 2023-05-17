/**
 * 
 */
package jcolonia.daw2022.mayo;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author Josephine;
 *
 */
public class VistaMenú extends VistaGeneral {
	
	/**
	 * Lista de opciones a elegir.
	 */
	ArrayList<String> opciones;


	/**
	 * Inicializa la vista con el título facilitado y copia los textos
	 * correspondientes a las opciones de menús.
	 * @param <T> un
	 * 
	 * @param título       el texto correspondiente
	 * @param opcionesMenú la lista de textos para las opciones
	 * @param sc jkjkl
	 */
	public <T> VistaMenú(String título, T[] opcionesMenú, Scanner sc) {
		super(título, sc);

		opciones = new ArrayList<>();

		for (T línea : opcionesMenú) {
			opciones.add(línea.toString());
		}
	}

	/**
	 * Muestra por pantalla el menú al usuario. 
	 * 
	 * @param opcionesMenúEjemplo son opciones a elegir.
	 * @param sc d
	 * 
	 */ 
	 
	public VistaMenú(Scanner sc, String[] opcionesMenúEjemplo) {
		
		 super (sc);	
//	opciones = new ArrayList<>(Arrays.asList(opcionesMenúEjemplo));
		opciones = new ArrayList<>();
		 
		for(String elementos: opcionesMenúEjemplo) {
			opciones.add(elementos);
		}
		
		}


	/**
	 * Muestra todas los opciones del menú.
	 * @param pregunta    pregunta para los menús.
	 */
	public void mostrarOpciones(String pregunta) {
		
	System.out.println(pregunta);
		for(int i=2;i<=opciones.size(); i++) {
		System.out.printf("(%d): %s%n",i-1, opciones.get(i-2));
		}
		System.out.println("(0): Salir");
	}
	
	/**
	 * Pide al usuario el número de la opción deseada.
	 * 
	 * @return la opción elegida por el usuario.
	 */
	public int pedirOpción() {
		int númOpción=0;
		try {
		númOpción=pedirEntero("\t Introduzca el número de la opción deseada:", 0, opciones.size());
		} catch (VistaException e) {
			//No hacer nada, seguir, devuelve 0 y se interpretaá como «0 = salir»
		}

			return númOpción;
	}
	

}
