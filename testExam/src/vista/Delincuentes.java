package vista;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

import modelo.DelincuentesModel;



public class Delincuentes extends JPanel {
	private JLabel lblNombre;
	private JLabel lblEdad;
	private JLabel lblSexo;
	private JLabel lblNacionalidad;
	private JLabel lblDireccin;
	private JLabel lblPoblacin;
	private JButton btnAntecedentes;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JList list;
	private JScrollPane scrollPane;
	private DelincuentesModel md;



	/**
	 * Create the panel.
	 */
	public Delincuentes(JPanel card) {
	
		setBackground(new Color(222, 184, 135));
		setLayout(null);
		scrollPane = new JScrollPane();
		scrollPane.setBounds(22, 363, 170, -342);
		add(scrollPane);
		
		
		
		//Etiquetas
		lblNombre = new JLabel("Nombre");
		lblNombre.setBounds(226, 22, 46, 14);
		add(lblNombre);
		
		lblEdad = new JLabel("Edad");
		lblEdad.setBounds(226, 80, 46, 14);
		add(lblEdad);
		
		lblSexo = new JLabel("Sexo");
		lblSexo.setBounds(332, 80, 46, 14);
		add(lblSexo);
		
		lblNacionalidad = new JLabel("Nacionalidad");
		lblNacionalidad.setBounds(226, 156, 88, 14);
		add(lblNacionalidad);
		
		lblDireccin = new JLabel("Direcci\u00F3n");
		lblDireccin.setBounds(226, 217, 88, 14);
		add(lblDireccin);
		
		lblPoblacin = new JLabel("Poblaci\u00F3n");
		lblPoblacin.setBounds(226, 274, 88, 14);
		add(lblPoblacin);
		
		//Botón manda a otro panel
		btnAntecedentes = new JButton("Antecedentes >>");
		btnAntecedentes.setBounds(226, 343, 152, 23);
		add(btnAntecedentes);
		btnAntecedentes.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				Antecedentes a=new Antecedentes();
				card.add(a, "a");
				CardLayout layout = (CardLayout) card.getLayout();
				layout.show(card, "a");
				
			}
			
			
		});
		
		//Campos de texto
		textField = new JTextField();
		textField.setBounds(226, 47, 86, 20);
		add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(226, 108, 60, 20);
		add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(332, 108, 60, 20);
		add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(226, 186, 108, 20);
		add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBounds(226, 242, 108, 20);
		add(textField_4);
		textField_4.setColumns(10);
		
		textField_5 = new JTextField();
		textField_5.setBounds(226, 299, 108, 20);
		add(textField_5);
		textField_5.setColumns(10);
		
		//lista 
		list = new JList();
		list.setBounds(24, 21, 168, 343);
		add(list);
		
	}

}
