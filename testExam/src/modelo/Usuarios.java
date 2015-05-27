package modelo;

public class Usuarios {

	private int id;
	private String usuario;
	private String pass;
	
	public Usuarios(int id, String usuario, String pass){
		
		this.setId(id);
		this.setUsuario(usuario);
		this.setPass(pass);
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}
}