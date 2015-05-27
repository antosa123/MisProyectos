package vista;

import javax.swing.JPanel;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JButton;

import modelo.UsuariosModel;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class Principal extends JPanel {
	private JPasswordField passwordField;
	private JLabel lblUsuario;
	private JComboBox comboBox;
	private JLabel lblContrasea;
	private JButton btnLogIn;
	private JButton btnLogOut;
	private UsuariosModel um;

	/**
	 * Create the panel.
	 */
	public Principal(JPanel card) {
		setBackground(new Color(255, 250, 240));
		setLayout(null);
		
		um = UsuariosModel.getInstance();
		
		comboBox = new JComboBox();
		comboBox.setBounds(29, 51, 150, 20);
		add(comboBox);
		ArrayList<String> usuarios = um.getUsers();
		for (int i=0; i<usuarios.size();i++){
			comboBox.addItem(usuarios.get(i));
		}
		
		lblUsuario = new JLabel("Usuario:");
		lblUsuario.setBounds(29, 26, 150, 14);
		add(lblUsuario);
		
		lblContrasea = new JLabel("Contrase\u00F1a:");
		lblContrasea.setBounds(29, 111, 150, 14);
		add(lblContrasea);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(29, 136, 150, 20);
		add(passwordField);
		
		btnLogIn = new JButton("Log in");
		btnLogIn.setBounds(29, 203, 150, 23);
		add(btnLogIn);
		btnLogIn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if (passwordField.getText().equalsIgnoreCase(um.consultaUsuario(comboBox.getSelectedItem().toString()))){
					btnLogOut.setEnabled(true);
					btnLogIn.setEnabled(false);
				}
				
			}
		});
		
		btnLogOut = new JButton("Log out");
		btnLogOut.setBounds(29, 250, 150, 23);
		add(btnLogOut);
		btnLogOut.setEnabled(false);
		btnLogOut.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				btnLogIn.setEnabled(true);
				passwordField.setText("");
				btnLogOut.setEnabled(false);
				
			}
		});
		

		
	}
}
