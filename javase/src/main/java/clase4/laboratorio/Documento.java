package clase4.laboratorio;

public final class Documento {

	// Atributos
	private String tipoDocumento;
	private int numero;

	// Constructores

	public Documento() {
		super();
	}

	public Documento(String tipoDocumento, int numero) {
		super();
		this.tipoDocumento = tipoDocumento;
		this.numero = numero;
	}

	@Override
	public String toString() {
		return "Documento [tipoDocumento=" + tipoDocumento + ", numero=" + numero + "]";
	}
	
	// Getter/setter

	public String getTipoDocumento() {
		return tipoDocumento;
	}

	public void setTipoDocumento(String tipoDocumento) {
		this.tipoDocumento = tipoDocumento;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

}
