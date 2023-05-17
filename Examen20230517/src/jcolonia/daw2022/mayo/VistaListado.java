/**
 * 
 */
package jcolonia.daw2022.mayo;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

/**
 * Clase de gestion de los textos introducidos por el usuario. 
 * @author <a href= "mailto:josephinepretty828@gmail.com">Marie josephine</a>
 * @versión 20231204
 */
public class VistaListado{
	
//	/**
//	 * Inicializa la vista recogiendo el nombre/título a asignar. El acceso único
//	 * compartido a la entrada estándar permanece inalterado.
//	 * 
//	 * @param nombre el texto identificador
//	 * @see #getEntrada()
//	 */
//	public VistaListado(String nombre) {
//		super(nombre);
//	}
	/**
	 * Colección de textos.
	 */
	AgendaTeléfonos listaTextos;


	/**
	 * Carga la lista de texto con textos.
	 * @param almacenAlumnos textos cargados.  
	 */
	public VistaListado(AgendaTeléfonos almacenAlumnos) {
		listaTextos = new AgendaTeléfonos();
	}



	/**
	 * Carga los textos introducidos por el usuario en un archivo.
	 * @return los textos.
	 */
	public AgendaTeléfonos cargarTextos() {
		
		File nombreArchivo = new File("Archivo.txt ");
		
		try {
			PrintWriter out = new PrintWriter(nombreArchivo);
			
 
			for(int i=0; i<listaTextos.tamaño();i++) {
				out.println(listaTextos.toListaTextos());
			}
			
		System.out.printf("\t\t Alumno exportado\n\n");	
			
			out.println("fin");
			out.close();
		} catch (FileNotFoundException e) {
			System.err.printf("Ruta no encontrada: %s",
					e.getLocalizedMessage());
		}
		return listaTextos;
	
	}
	/**
	 * Mostra los alumnos Almacenados en la escuela.
	 * @param es    la escuela.
	 */
	public void mostrarTextos(AgendaTeléfonos es) {
//		int i = 1;
//		for (Escuela nuevoAlumno : es) {
//			System.out.printf("%n-%d:%s %n", i++, nuevoAlumno);
//		}
//		
		for(int j=0; j<es.tamaño();j++) {
			System.out.printf("%d:%s%n",j, es.toListaTextos());
		}
	}
}
        

