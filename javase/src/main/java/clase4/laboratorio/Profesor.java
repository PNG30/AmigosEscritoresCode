package clase4.laboratorio;

import java.util.Arrays;

public class Profesor extends Empleado {

	private String[] cursos;

	// Constructores

	public Profesor() {
		super();
	}

	public Profesor(String[] cursos) {
		super();
		this.cursos = cursos;
	}

	@Override
	public String toString() {
		return "Profesor [cursos=" + Arrays.toString(cursos) + "]";
	}

	// Getter setter
	public String[] getCursos() {
		return cursos;
	}

	public void setCursos(String[] cursos) {
		this.cursos = cursos;
	}

	@Override
	public void guardar() {
		// TODO Auto-generated method stub

	}

	@Override
	public void eliminar() {
		// TODO Auto-generated method stub

	}

	@Override
	public void modificar() {
		// TODO Auto-generated method stub

	}

	@Override
	public void mostrarTipoPersona() {
		System.out.println(this.getApellido() + ", soy un profesor");

	}

}
