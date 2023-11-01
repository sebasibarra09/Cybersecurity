
public class Cliente {
	private Long cuit;
	private String nombre;

	public Cliente(Long cuit, String nombre) {
		this.cuit=cuit;
		this.nombre=nombre;
	}

	public Long getCuit() {
		return cuit;
	}

	public void setCuit(Long cuit) {
		this.cuit = cuit;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

}
