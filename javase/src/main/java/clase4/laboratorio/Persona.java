package clase4.laboratorio;

import java.util.Date;

public abstract class Persona implements Persistencia {

	// Atributos
	private Integer id;
	private String nombre;
	private String apellido;
	private Documento documento;
	private Date fechaNacimiento;

	private static int contador = 0;

	// Constructor por defecto
	public Persona() {
		super();
		this.id = ++contador; // BOXING
	}

	// Constructor parametrizado
	public Persona(String nombre, String apellido, Documento documento, Date fechaNacimiento) {
		super();
		this.id = ++contador;
		this.nombre = nombre;
		this.apellido = apellido;
		this.documento = documento;
		this.fechaNacimiento = fechaNacimiento;
	}

	// Metodo abstracto
	public abstract void mostrarTipoPersona();

	@Override
	public String toString() {
		return "Persona [id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", documento=" + documento
				+ ", edad=" + "]";
	}

	// Getter y setter

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public Documento getDocumento() {
		return documento;
	}

	public void setDocumento(Documento documento) {
		this.documento = documento;
	}

	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public static int getContador() {
		return contador;
	}

	public static void setContador(int contador) {
		Persona.contador = contador;
	}

}
