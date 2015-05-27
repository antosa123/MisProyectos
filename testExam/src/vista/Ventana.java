package vista;

import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

public class Ventana extends JFrame {

	//private JPanel contentPane;
	private JMenu mnPrincipal;
	private JMenuItem mntmPrincipal;
	private JMenu mnDelincuentes;
	private JMenuItem mntmDelincuentes;
	private JMenuBar menuBar;
	private Principal p;
	private Delincuentes d;
	private Antecedentes a;
	private JPanel card;

	
	public Ventana() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 450);
		
		card=new JPanel();
		getContentPane().add(card);
		card.setBounds(0, 0, 10, 10);
		card.setLayout(new CardLayout(0,0));
		//Iniciar los paneles
		p = new Principal(card);
		d = new Delincuentes(card);
		card.add(p,"p");
		card.add(d,"d");
		
		//Barra menu
		menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		//elementos menu
		mnPrincipal = new JMenu("Principal");
		menuBar.add(mnPrincipal);
		
		
		mnDelincuentes = new JMenu("Delincuentes");
		menuBar.add(mnDelincuentes);
		
		//pestañas menu
		mntmPrincipal = new JMenuItem("principal");
		mnPrincipal.add(mntmPrincipal);
		mntmPrincipal.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent arg0) {
				CardLayout layout = (CardLayout) card.getLayout();
				layout.show(card, "p");
				
			}
			
			
		});
		
		mntmDelincuentes = new JMenuItem("delincuentes");
		mnDelincuentes.add(mntmDelincuentes);
		mntmDelincuentes.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent arg0) {
				CardLayout layout = (CardLayout) card.getLayout();
				layout.show(card, "d");
				
			}
			
			
		});
		
		
	}
}
