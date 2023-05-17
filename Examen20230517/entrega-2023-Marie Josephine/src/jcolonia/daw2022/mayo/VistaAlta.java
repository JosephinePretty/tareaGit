package jcolonia.daw2022.mayo;

import java.util.Scanner;

/**
 * Colección de utilidades comunes para las «vistas» sobre la consola de texto.
 * @author <a href= "mailto:josephinepretty828@gmail.com">Marie josephine</a>
 * @version  (20230428)
 */
public class VistaAlta extends Vista{

//	/**
//	 * 
//	 */
//	Vector<String> lista;
	
	/**
	 * Inicializa la vista con el título facilitado.
	 * 
	 * @param nombre el texto correspondiente
	 * @param sc zxcv
	 * @throws VistaException  si el gestor de la entrada ya estuviera definido
	 */
	public VistaAlta(String nombre,Scanner sc) throws VistaException {
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
	public AgendaTeléfonos cargarTelefono() {
		
//		sc = new Scanner(System.in);
//		lista= new Vector<>();

	AgendaTeléfonos nuevoAlumno;
	nuevoAlumno=new AgendaTeléfonos();
		
			Integer núm = pedirEntero("Introduzca un nuevo telefono");
			String nombre = pedirTexto("Introduzca el nombre nombre");
			nuevoAlumno.añadir(nombre, núm);
			return nuevoAlumno;
		
		
	}

}
