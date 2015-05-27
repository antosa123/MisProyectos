package modelo;

public class Delincuente {
	
	private String nombre;
	private int edad;
	private String sexo;
	private String nacionalidad;
	private String direccion;
	private String poblacion;
	private String antecedentes;
	
	public Delincuente(String nombre, int edad, String sexo, String nacionalidad, String direccion, String poblacion, String antecedentes){
		
		
		this.nombre = nombre;
		this.edad = edad;
		this.sexo = sexo;
		this.nacionalidad = nacionalidad;
		this.direccion = direccion;
		this.poblacion = poblacion;
		this.antecedentes = antecedentes;
	}

	public String getNombre() {
		return nombre;
	}

	public int getEdad() {
		return edad;
	}

	public String getSexo() {
		return sexo;
	}

	public String getNacionalidad() {
		return nacionalidad;
	}

	public String getDireccion() {
		return direccion;
	}

	public String getPoblacion() {
		return poblacion;
	}

	public String getAntecedentes() {
		return antecedentes;
	}
}
