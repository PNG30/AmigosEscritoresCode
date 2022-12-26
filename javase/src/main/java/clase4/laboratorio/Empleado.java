package clase4.laboratorio;

import java.util.Date;

public abstract class Empleado extends Persona {

	//Atributos
	private Date fechaCargo;
	private double sueldo;
	
	//Constructor vacio
	public Empleado() {
		super();
	}

	//Parametrizado
	public Empleado(String nombre, String apellido, Documento documento, Date fechaNacimiento, Date fechaCargo, double sueldo) {
		super(nombre, apellido, documento, fechaNacimiento);
		this.fechaCargo = fechaCargo;
		this.sueldo = sueldo;
	}
	
	
	@Override
	public String toString() {
		return "Empleado [" + super.toString() + ", " + fechaCargo + ", sueldo=" + sueldo + "]";
	}
	
	
	//Getter setter


	public Date getFechaCargo() {
		return fechaCargo;
	}

	public void setFechaCargo(Date fechaCargo) {
		this.fechaCargo = fechaCargo;
	}

	public double getSueldo() {
		return sueldo;
	}

	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}
	
	
	
	
	
	
}
