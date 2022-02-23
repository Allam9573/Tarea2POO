package source;
import java.util.ArrayList;

public class Empresa {
	
	private String rtn;
	private String nombre;
	private String rubro;
	private ArrayList<Departamento> departamentos = new ArrayList<Departamento>();
	
	public Empresa(String rtn, String nombre, String rubro, Departamento departamento) {
		this.rtn = rtn;
		this.nombre = nombre;
		this.rubro = rubro;
		this.departamentos.add(departamento);
	}

	public String getRtn() {
		return rtn;
	}

	public void setRtn(String rtn) {
		this.rtn = rtn;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getRubro() {
		return rubro;
	}

	public void setRubro(String rubro) {
		this.rubro = rubro;
	}

	public ArrayList<Departamento> getDepartamentos() {
		return departamentos;
	}

	public void setDepartamentos(Departamento departamento) {
		this.departamentos.add(departamento);
	}
	public String getAllDepartamentos() {
		String result = "";
		for(int i = 0; i < departamentos.size(); i ++) {
			result += departamentos.get(i).getNombre() +"\n";
		}
		return result;
	}
}
