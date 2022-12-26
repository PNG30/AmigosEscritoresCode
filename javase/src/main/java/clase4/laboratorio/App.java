package clase4.laboratorio;

import java.util.Date;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		Persona[] personas;
		int c = 0;

		System.out.println("Ingrese la cantidad de personas: ");
		c = scan.nextInt();

		personas = new Persona[c];

		String nombre, apellido, tipoDoc;
		int cc;
		int nroDoc, tPersona;
		Date fechaNac;
		Persona persona = null;

		for (int i = 0; i < personas.length; i++) {

			System.out.println("Ingrese el nombre: ");
			nombre = scan.next();

			System.out.println("Ingrese el apellido: ");
			apellido = scan.next();

			System.out.println("Ingrese tipo de Documento: ");
			tipoDoc = scan.next();

			System.out.println("Ingrese el numero de documento: ");
//			nroDoc = scan.nextInt();
			nroDoc = Integer.parseInt(scan.next());

			System.out.println("Ingrese la fecha de nacimiento");
			fechaNac = new Date();

			System.out.println("Ingrese el tipo de persona");
			tPersona = scan.nextInt();

			switch (tPersona) {
			case 1: // ALUMNO
				/* Cargar cursos */
				System.out.println("Ingrese la cantidad de cursos: ");
				cc = scan.nextInt();
				String[] cursos = new String[cc];

				for (int j = 0; j < cursos.length; j++) {
					System.out.println("Ingrese el nombre del curso: ");
					cursos[j] = scan.next();
				}
				persona = new Alumno(nombre, apellido, new Documento(tipoDoc, nroDoc), fechaNac, cursos);
				break;
			case 2: // DIRECTOR
				System.out.println("Ingrese la cantidad de establecimientos: ");
				cc = scan.nextInt();
				String[] establecimiento = new String[cc];

				for (int f = 0; f < establecimiento.length; f++) {
					System.out.println("Ingrese la direccion del establecimiento: ");
					establecimiento[f] = scan.next();
				}

				persona = new Director(nombre, apellido, new Documento(tipoDoc, nroDoc), fechaNac, fechaNac, i,
						tipoDoc);
				break;

			case 3: // Administrativo
				System.out.println("Ingrese sueldo del administrativo");
				cc = scan.nextInt();
				String[] administrativo = new String[cc];

				for (int u = 0; u < administrativo.length; u++) {
					System.out.println("Ingrese el nombre del admin");
					administrativo[u] = scan.next();

				}

				persona = new Administrativo(nombre, apellido, new Documento(tipoDoc, nroDoc), fechaNac, fechaNac, i);

			}

			personas[i] = persona;

		}

		/* Muestro las personas */
		for (int i = 0; i < personas.length; i++) {
			personas[i].mostrarTipoPersona();
		}

		scan.close();
	}

}
