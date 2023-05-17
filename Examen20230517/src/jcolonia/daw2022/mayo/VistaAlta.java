package jcolonia.daw2022.mayo;

import java.util.Scanner;

/**
 * Colección de utilidades comunes para las «vistas» sobre la consola de texto.
 * @author <a href= "mailto:josephinepretty828@gmail.com">Marie josephine</a>
 * @version  (20230428)
 */
public class VistaAlta extends VistaGeneral{

//	/**
//	 * 
//	 */
//	Vector<String> lista;
	
	/**
	 * Inicializa la vista con el título facilitado.
	 * 
	 * @param nombre el texto correspondiente
	 * @param sc zxcv
	 */
	public VistaAlta(String nombre,Scanner sc) {
		super(nombre, sc);
	}



//	/**
//	 * 
//	 */
//	public VistaEntrada() {
//		//sc= scConsola;
//		sc = new Scanner(System.in);
//		lista= new Vector<>();
//	}

	/**
	 * Carga los datos del alumno introducido en el almacen.
	 * @return los datos en pantalla.
	 */
	public AgendaTeléfonos cargarAlumno() {
		
//		sc = new Scanner(System.in);
//		lista= new Vector<>();

	AgendaTeléfonos nuevoAlumno;
	nuevoAlumno=new AgendaTeléfonos();
		
			String nombre = pedirTexto("Introduce su nombre");
			Integer núm = pedirEntero("Introduce su telefono");
			nuevoAlumno.añadir(nombre, núm);
			return nuevoAlumno;
		
		
	}

}
