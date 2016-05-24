package ec.epn.edu.vo;

public class Local {
	private String nombre;
	private int numero;
	private String ubicacion;
	private String telefono;
	
	public Local(){
	}
	
	
	public Local(String nombre, int numero, String ubicacion, String telefono) {
		
		this.nombre = nombre;
		this.numero = numero;
		this.ubicacion = ubicacion;
		this.telefono = telefono;
	}


	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getUbicacion() {
		return ubicacion;
	}
	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

}