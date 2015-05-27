package modelo;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class DelincuentesModel {
	
	private static DelincuentesModel instance = null;
	private  String delincuentes ="SELECT * FROM delinquentes;";

	private Conexion bd;
	
	private DelincuentesModel(){
		bd = Conexion.getInstance();
	}
	
	
	
	public ArrayList<Delincuente> getDelincuentes(){
		
     ArrayList<Delincuente> datos = new ArrayList<Delincuente>();
		
		try {
			ResultSet resultado = bd.getConexion().createStatement().executeQuery(delincuentes);
			
			while (resultado.next()){
				
				Delincuente d = new Delincuente(resultado.getString("nombre"),resultado.getInt("edad"),resultado.getString("sexo"), resultado.getString("nacionalidad"),resultado.getString("direccion"), resultado.getString("poblancion"), resultado.getString("antecedentes"));
				datos.add(d);
			}
		} catch (SQLException exceptionSql) {
			exceptionSql.printStackTrace();
		}
		return datos;
	}
	
	public static DelincuentesModel getInstance() {
		if (instance == null){
			instance = new DelincuentesModel();
		}
		return instance;
	}
}

