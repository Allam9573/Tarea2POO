package source;

public class Departamento {

	private int numeroDepartamento;
	private String nombre;
	private String nombreJefe;

	public Departamento(int numeroDepartamento, String nombre, String nombreJefe) {
		this.numeroDepartamento = numeroDepartamento;
		this.nombre = nombre;
		this.nombreJefe = nombreJefe;
	}

	public int getNumeroDepartamento() {
		return numeroDepartamento;
	}

	public void setNumeroDepartamento(int numeroDepartamento) {
		this.numeroDepartamento = numeroDepartamento;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getNombreJefe() {
		return nombreJefe;	
	}

	public void setNombreJefe(String nombreJefe) {
		this.nombreJefe = nombreJefe;
	}

}
