package modelo;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;



public class UsuariosModel {
	
	private static UsuariosModel instance = null;
	private  String PASSWORD="SELECT pass FROM usuarios WHERE usuario = ";
	private  String USUARIOS_LIST="SELECT * FROM usuarios;";

	private Conexion bd;
	
	private UsuariosModel(){
		bd = Conexion.getInstance();
	}
	
	public String consultaUsuario(String usuario){
		String password = "";
		String consulta = PASSWORD+"'"+usuario+"'";
		System.out.println(consulta);
		try {
			
			ResultSet resultado = bd.getConexion().createStatement().executeQuery(consulta);
			while (resultado.next()){
			password = resultado.getString("pass");
			}
		} catch (SQLException e) {
			
		}
		return password;
	}
	
	public ArrayList<String> getUsers(){
		
     ArrayList<String> datos = new ArrayList<String>();
		
		try {
			ResultSet resultado = bd.getConexion().createStatement().executeQuery(USUARIOS_LIST);
			
			while (resultado.next()){
				
				String nombre = resultado.getString("usuario");
				datos.add(nombre);
			}
		} catch (SQLException exceptionSql) {
			exceptionSql.printStackTrace();
		}
		return datos;
	}
	
	public static UsuariosModel getInstance() {
		if (instance == null){
			instance = new UsuariosModel();
		}
		return instance;
	}
}