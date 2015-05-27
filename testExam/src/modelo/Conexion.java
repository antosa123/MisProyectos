package modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
		
		private static Conexion instance = null;
		
		private final String CONTROLADOR_MYSQL= "com.mysql.jdbc.Driver";
	
		//Datos de la BD
		private String bd = "delinquentes";
		private String url = "jdbc:mysql://localhost/"+bd;
		private String user = "root1";
		private String pass = "andrea";

		//Conexion
		private static Connection conexion = null;
		
		

	public Conexion(){
		try {
			Class.forName(CONTROLADOR_MYSQL);
			conexion = DriverManager.getConnection(url, user, pass);
			conexion.setAutoCommit(false);
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		System.out.println("Conectado");
	}
	
	
	
	
	public static Conexion getInstance() {
		if (instance == null){
			instance = new Conexion();
		}
		return instance;
	}




	public static Connection getConexion(){
		return conexion;
	}
	
	
}
