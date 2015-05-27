package vista;

import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Panel;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.SystemColor;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JTextArea;

public class Antecedentes extends JPanel {
	private JLabel lblAntecedentes;
	private JButton btnSalvar;


	/**
	 * Create the panel.
	 */
	public Antecedentes() {
		setBackground(new Color(173, 216, 230));
		setLayout(null);
		
		
		lblAntecedentes = new JLabel("Antecedentes");
		lblAntecedentes.setBounds(30, 41, 113, 14);
		add(lblAntecedentes);
		
		btnSalvar = new JButton("Salvar  > >");
		btnSalvar.setBounds(30, 329, 133, 23);
		add(btnSalvar);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(30, 72, 373, 221);
		add(textArea);
		
		

	}
}
