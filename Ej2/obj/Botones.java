package obj;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Botones extends JFrame {

	private JPanel contentPane;
	private JButton boton1;
	private JButton boton2;
	private JLabel texto;

	private String respuesta;
	
	public Botones() {
		
		setTitle("Ventana con botones");
		setBounds(100, 100, 300, 200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		contentPane = new JPanel();
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
//		Boton 1
		boton1 = new JButton("BOTON 1");
		boton1.setBounds(20,20,85,30);
		contentPane.add(boton1);
		
		boton1.addActionListener(new ActionListener(){
			
			public void actionPerformed (ActionEvent e) {
				respuesta = "Ha pulsado el boton 1";
				texto.setText(respuesta);
				
			}
		});
		
//		Boton 2
		boton2 = new JButton("BOTON 2");
		boton2.setBounds(20,65,85,30);
		contentPane.add(boton2);
		
		boton2.addActionListener(new ActionListener(){
			
			public void actionPerformed (ActionEvent e) {
				respuesta = "Ha pulsado el boton 2";
				texto.setText(respuesta);
				
			}
		});
		
//		Mensaje
		texto = new JLabel();
		texto.setBounds(120, 45, 181, 20);
		contentPane.add(texto);
	}

}