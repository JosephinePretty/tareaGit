package jcolonia.daw2022.mayo;

import java.util.Scanner;

/**
 * Gestión de números de teléfono.
 * 
 * @author <a href="dmartin.jcolonia@gmail.com">David H. Martín</a>
 * @version 2023.3.2_incompleta (20230516)
 */
public class ControlAgenda {
	Scanner scConsola;
	/**
	 * Texto identificativo de las funciones de la aplicación que aparecerán en el
	 * menú principal.
	 */
	private static final String[] OPCIONES_MENÚ_PRINCIPAL = { "Agregar teléfono", "Mostrar agenda", "Mostrar estado",
			"Restablecer", "SALIR" };

	/** Título de la aplicación. Se mostrará como encabezado del menú principal. */
	private static final String TÍTULO_MENÚ_PRINCIPAL = "Agenda telefónica";

	/** Almacen de números de teléfono. */
	private AgendaTeléfonos agenda;
	/** Marca de que la agenda actual fue importada. */
	private boolean agendaFueImportada;
	/** Marca de que la agenda actual fue exportada. */
	private boolean agendaFueExportada;
	/** Marca de que la agenda actual fue borrada. */
	private boolean agendaFueBorrada;

	/** Vista del menú principal. */
	private VistaMenúBásico menúPrincipal;

	/**
	 * Crea una nueva agenda y quita todas las marcas de estado.
	 * 
	 * @see #agendaFueImportada
	 * @see #agendaFueExportada
	 * @see #agendaFueBorrada
	 */
	public ControlAgenda() {
		agenda = new AgendaTeléfonos();

		agendaFueImportada = false;
		agendaFueExportada = false;
		agendaFueBorrada = false;
	}

	/**
	 * Gestiona el menú principal y ejecuta las operaciones elegidas.
	 * @throws VistaException si el gestor de la entrada ya estuviera definido
	 */
	private void buclePrincipal() throws VistaException {
		int opciónElegida;
		boolean fin = false;

		menúPrincipal = new VistaMenúBásico(TÍTULO_MENÚ_PRINCIPAL, OPCIONES_MENÚ_PRINCIPAL);

		// Bucle general
		do {
			menúPrincipal.mostrarTítulo1();
			menúPrincipal.mostrarOpciones("Elige una opción");
			opciónElegida = menúPrincipal.pedirOpción();
			switch (opciónElegida) {
			case 0:
			case 5: // SALIR
				fin = true;
				Vista.mostrarAviso("¡¡¡A-D-I-O-S!!");
				break;
			case 1: // Opción 1: Entrada datos
				cargarTeléfono();
				break;
			case 2: // Opción 2: Mostrar listado
				mostrarAgenda();
				break;
			//case 3: // Opción 3: Mostrar estado
			//	mostrarEstado();
			//	break;
			//case 4: // Opción 4: Reset
			//	restablecer();
			//	break;
			default: // Opción no esperada: abortar
				ejecutarGenérico(opciónElegida);
				Vista.mostrarError("Error interno de programa - operación pendiente de desarrollo");
				System.exit(1);
			}
		} while (!fin);
	}
	
	/**
	 * Devuelve un listado de los telefonos ya exixtante en la agenda de telefonos
	 */
	private void mostrarAgenda() {
		VistaListado entrada = new VistaListado(agenda);
		entrada.mostrarTextos(agenda);
		
	}

	/**
	 * Pide al usuario los datos(telefono y nombre) para el nuevo telefono
	 * @throws VistaException si el gestor de la entrada ya estuviera definido
	 */

	private void cargarTeléfono() throws VistaException {
//		AgendaTeléfonos nuevoTelefono;
				
				VistaAlta formulario = new VistaAlta("Introducir los datos ", scConsola);
				
				System.out.printf("\t Introduzca los datos del alumno y pulse «Enter» cuando terminas%n%n");
				agenda =formulario.cargarTelefono();
		
		//	almacenAlumnos.añadir(nuevoAlumno);
				System.out.printf("\t→%d telefono en el agenda %n", agenda.tamaño());
				formulario.pedirContinuar();
			}

	/**
	 * Proporciona al usuario un mensaje informativo sobre la opción elegida.
	 * Operación «comodín» a ejecutar para opciones no implementadas.
	 * 
	 * @param id el número de la opción elegida
	 */
	private void ejecutarGenérico(int id) {
		String mensaje;
		mensaje = String.format("%n  Ha elegido la opción %d: «%s»", id, OPCIONES_MENÚ_PRINCIPAL[id - 1]);
		Vista.mostrarTexto(mensaje);
	}

	/**
	 * Activa el programa con el menú principal.
	 * 
	 * @param argumentos opciones en la línea de ejecución —no se usan—
	 * @throws VistaException si el gestor de la entrada ya estuviera definido
	 */
	public static void main(String[] argumentos) throws VistaException {
		ControlAgenda control = new ControlAgenda();
		control.buclePrincipal();
	}
}
