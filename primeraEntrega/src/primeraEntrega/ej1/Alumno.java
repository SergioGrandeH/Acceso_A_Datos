package primeraEntrega.ej1;

import java.time.LocalDate;
import java.util.Date;

public class Alumno {
	/*
	 * Realiza un programa Java que lea los datos de 5 alumnos. Para cada alumno se tiene la siguiente información: Nia(entero), Nombre(String), Apellidos(String), Genero (Char), 
	 * Fecha de nacimiento (Fecha), Ciclo (String), Curso(String), Grupo(String).
Después de leer los 5 alumnos, los mostrarán por pantalla.
Actividad opcional: Mostrar los alumnos ordenados por NIA.
Actividad opcional 2: Mostrar ordenados los alumnos por el criterio 
que se elija por teclado. Deberás hacer un menú con las opciones de leer alumnos 
(leerá 5), añadir alumno, mostrar ordenados los alumnos por NIA, y mostrar ordenados 
los alumnos por el criterio elegido por el usuario.
	 * 
	 * */
	private int nia;
private String nombre, apellidos,ciclo,curso,grupo;
private char genero;
private LocalDate fechaNac;

public Alumno(int nia, String nombre, String apellidos, String ciclo, String curso, String grupo, char genero,
		LocalDate fecha) {
	this.nia = nia;
	this.nombre = nombre;
	this.apellidos = apellidos;
	this.ciclo = ciclo;
	this.curso = curso;
	this.grupo = grupo;
	this.genero = genero;
	this.fechaNac = fecha;
}


public Alumno(int nia, String nombre, String apellidos, String ciclo, String curso, String grupo, char genero) {
	 
	this.nia = nia;
	this.nombre = nombre;
	this.apellidos = apellidos;
	this.ciclo = ciclo;
	this.curso = curso;
	this.grupo = grupo;
	this.genero = genero;
}


public int getNia() {
	return nia;
}
public void setNia(int nia) {
	this.nia = nia;
}
public String getNombre() {
	return nombre;
}
public void setNombre(String nombre) {
	this.nombre = nombre;
}
public String getApellidos() {
	return apellidos;
}
public void setApellidos(String apellidos) {
	this.apellidos = apellidos;
}
public String getCiclo() {
	return ciclo;
}
public void setCiclo(String ciclo) {
	this.ciclo = ciclo;
}
public String getCurso() {
	return curso;
}
public void setCurso(String curso) {
	this.curso = curso;
}
public String getGrupo() {
	return grupo;
}
public void setGrupo(String grupo) {
	this.grupo = grupo;
}
public char getGenero() {
	return genero;
}
public void setGenero(char genero) {
	if(genero=='H'||genero=='M'||genero=='h'||genero=='m') {
	this.genero = genero;
	}else {
		System.out.println("Indica hombre o mujer");
	}
}
public LocalDate getFechaNac() {
	return fechaNac;
}
public void setFechaNac(LocalDate fechaNac) {
	this.fechaNac = fechaNac;
	
}


@Override
public String toString() {
	return "ALUMNO nia=" + nia + "\n nombre=" + nombre + "\n apellidos=" + apellidos + "\n ciclo=" + ciclo + "\n curso="
			+ curso + "\n grupo=" + grupo + "\n genero=" + genero + "\n fechaNac=" + fechaNac;
}




}
