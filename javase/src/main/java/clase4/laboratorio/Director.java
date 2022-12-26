package clase4.laboratorio;

import java.util.Date;

public class Director extends Empleado {

	// Atributos
	private String carrera;

	// Constructor vacio
	public Director() {
		super();
	}

	// Constructor parametrizado
	public Director(String nombre, String apellido, Documento documento, Date fechaNacimiento, Date fechaCargo,
			double sueldo, String carrera) {
		super(nombre, apellido, documento, fechaNacimiento, fechaCargo, sueldo);
		this.carrera = carrera;
	}

	// Implementa los metodos definidos en la interfaz persistencia
	@Override
	public String toString() {
		return "Director [" + super.toString() + carrera + "]";
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
		System.out.println(this.getApellido() + " Soy un director");

	}

	// Getter setter
	public String getCarrera() {
		return carrera;
	}

	public void setCarrera(String carrera) {
		this.carrera = carrera;
	}

}
