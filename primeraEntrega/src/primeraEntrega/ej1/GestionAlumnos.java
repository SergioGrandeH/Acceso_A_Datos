package primeraEntrega.ej1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;
import java.util.InputMismatchException;
import java.util.Scanner;

public class GestionAlumnos {

	public static void main(String[] args) throws ParseException {
		try {
			Scanner sc = new Scanner(System.in);

			ArrayList<Alumno> listaAlumnos = new ArrayList<>();
			Alumno a1 = new Alumno(123513, "Pepe", "Martinez", "DAW", "Primero", "2", 'h', LocalDate.of(1234, 03, 12));
			Alumno a2 = new Alumno(534235, "Luis", "Martinez", "DAW", "Primero", "2", 'h', LocalDate.of(1997, 5, 2));
			Alumno a3 = new Alumno(876456, "Maria", "Martinez", "DAW", "Primero", "2", 'f', LocalDate.of(2001, 6, 4));
			Alumno a4 = new Alumno(234245, "Ares", "Martinez", "DAW", "Primero", "2", 'H', LocalDate.of(2003, 11, 24));
			Alumno a5 = new Alumno(634355, "Koldo", "Martinez", "DAW", "Primero", "2", 'H', LocalDate.of(1980, 2, 14));

			listaAlumnos.add(a1);
			listaAlumnos.add(a2);
			listaAlumnos.add(a3);
			listaAlumnos.add(a4);
			listaAlumnos.add(a5);
			/*
			 * System.out.println("Lista no ordenada"); for (int i = 0; i <
			 * listaAlumnos.size(); i++) { System.out.println(listaAlumnos);
			 * 
			 * }
			 */
			System.out.println(
					"Elige una opcion: 1 para leer los alumnos, 2 para anyadir, 3 para ordenarlos por NIA y mostrarlos, y 4 para ordenarlos por el requisito que elijas\n"
							+ "5 para salir");
			int opcionMenu = sc.nextInt();
			while (opcionMenu > 5 || opcionMenu < 1) {
				System.out.println("Introduce opciones validas");
				opcionMenu = sc.nextInt();
			}
			switch (opcionMenu) {
			case 1:
				System.out.println("Mostrar alumnos");
				mostrarElementos(listaAlumnos);

				break;
			case 2:
				System.out.println("Addanir alumnos(palabra inventada)");
				System.out.println("Intropduce el NIA, nombre, apellidos, ciclo, curso,grupo, genero y fecha de nacimiento del alumno nuevo");
				int niaN=sc.nextInt();
				String nombreN=sc.next();
				String apellidosN=sc.next();
				String cicloN=sc.next();
				String cursoN=sc.next();
				String grupoN=sc.next();
				char generoN=sc.next().charAt(0);
				String fechaN=sc.next();
				SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");

				Date fecha = formatter.parse(fechaN);
				
				Alumno an=new Alumno(niaN, nombreN, apellidosN, cicloN, cursoN, grupoN, generoN);
				listaAlumnos.add(a5);
		
				listaAlumnos.add(a5);
				break;
			case 3:
				System.out.println("Mostrar alumnos por NIA");
				ordenarElementosXNia(listaAlumnos);
				break;
			case 4:
				System.out.println(
						"Elige una opcion: 1 para ordenar por NIA, 2 para hacerlo por nombre, 3 para los apellidos, 4 para genero, 5 para la fecha de nacimiento, 6 para el ciclo, 7 para el curso, y 8 para el grupo");

				int metodo = sc.nextInt();
				while (metodo < 1 || metodo > 5) {
					System.out.println("Elige una opcion valida");
					metodo = sc.nextInt();
				}
				elegirMetodoYOrdenar(listaAlumnos, metodo);
				break;
			case 5:
				System.out.println("Adios");
				break;
			default:
				System.out.println("Introduce opciones validas");
				metodo = sc.nextInt();
				break;

			}
			sc.close();

		} catch (InputMismatchException ime) {
			System.out.println("Introduce valores validos, no mezcles churras con merinas");

		}
		;
	}

	public static void mostrarElementos(ArrayList<Alumno> listaAlumnos) {
		System.out.println(listaAlumnos);
	}

	public static void ordenarElementosXNia(ArrayList<Alumno> listaAlumnos) {
		Comparator<Alumno> comp = Comparator.comparing(Alumno::getNia);
		listaAlumnos.sort(comp);
		System.out.println("Lista ordenada por NIA");
		System.out.println(listaAlumnos);
	}

	public static void elegirMetodoYOrdenar(ArrayList<Alumno> listaAlumnos, int metodo) {

		switch (metodo) {

		case 1:
			Comparator<Alumno> comp = Comparator.comparing(Alumno::getNia);
			System.out.println("Lista ordenada por NIA");
			listaAlumnos.sort(comp);
			System.out.println(listaAlumnos);
			break;
		case 2:
			comp = Comparator.comparing(Alumno::getNombre);
			listaAlumnos.sort(comp);
			System.out.println("Lista ordenada por nombre");
			System.out.println(listaAlumnos);
			break;

		case 3:
			comp = Comparator.comparing(Alumno::getApellidos);
			listaAlumnos.sort(comp);
			System.out.println("Lista ordenada por apellidos");
System.out.println(listaAlumnos);
			break;

		case 4:
			comp = Comparator.comparing(Alumno::getGenero);
			listaAlumnos.sort(comp);
			System.out.println("Lista ordenada por genero");
			System.out.println(listaAlumnos);
			break;

		case 5:
			comp = Comparator.comparing(Alumno::getFechaNac);
			listaAlumnos.sort(comp);
			System.out.println("Lista ordenada por fecha de nacimiento");
			System.out.println(listaAlumnos);
			break;

		case 6:
			comp = Comparator.comparing(Alumno::getCiclo);
			listaAlumnos.sort(comp);
			System.out.println("Lista ordenada por ciclo");
			System.out.println(listaAlumnos);
			break;

		case 7:
			comp = Comparator.comparing(Alumno::getCurso);
			listaAlumnos.sort(comp);
			System.out.println("Lista ordenada por curso");
			System.out.println(listaAlumnos);
			break;

		case 8:
			comp = Comparator.comparing(Alumno::getGrupo);
			listaAlumnos.sort(comp);
			System.out.println("Lista ordenada por grupo");
			System.out.println(listaAlumnos);
			break;
		default:
			System.out.println("Introduce una opcion valida");
			break;
		}

	}
}
