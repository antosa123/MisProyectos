import java.awt.EventQueue;

import modelo.Conexion;
import vista.Ventana;


public class Main {

	public static void main(String[] args) {
		
						Ventana frame = new Ventana();
						frame.setVisible(true);
						Conexion.getInstance();

	}
}
