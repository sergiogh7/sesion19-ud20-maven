package obj;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class CambiaDivisa extends JFrame {

	private double resultado = 0;
	private int numero = 0;
	private JPanel contentPane;
	private JButton convertir;
	private JButton pesetas;
	private JButton euros;
	private JLabel texto;
	private JLabel texto2;
	private JLabel mensaje;
	private JTextField num1;
	
	public CambiaDivisa() {
		
		setTitle("cambiaDivisa");
		setBounds(100, 100, 215, 250);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		contentPane = new JPanel();
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		convertir = new JButton("Intercambiar divisas");
		convertir.setBounds(25,85,155,20);
		contentPane.add(convertir);
		
		convertir.addActionListener(new ActionListener(){
			
			public void actionPerformed (ActionEvent e) {
				
				if (numero % 2 == 0) {
					contentPane.remove(euros);
					pesetas = new JButton("Pesetas a Euros");
					pesetas.setBounds(218, 100, 143, 20);
					contentPane.add(pesetas);
					pesetas.addActionListener(new ActionListener(){
						
						public void actionPerformed (ActionEvent e) {
							resultado = Double.parseDouble(num1.getText()) * 0.006;
							resultado = Math.round(resultado*100.0) /100.0;
							mensaje.setText("" + resultado + " Ptas");
							
						}
						
					});
					
				}else {
					contentPane.remove(pesetas);
					euros = new JButton("Euros a Pesetas");
					euros.setBounds(25, 115, 143, 20);
					contentPane.add(euros);
					
					euros.addActionListener(new ActionListener(){
						
						public void actionPerformed (ActionEvent e) {
							resultado = Double.parseDouble(num1.getText()) * 166.386;
							resultado = Math.round(resultado*100.0) /100.0;
							mensaje.setText("" + resultado + " €");
						}
						
					});
					
				}
				numero++;
				
			}
		});
		
		texto = new JLabel("Cantidad a convertir");
		texto.setBounds(25, 20, 126, 20);
		contentPane.add(texto);
		
		texto2 = new JLabel("Total");
		texto2.setBounds(25, 145, 81, 20);
		contentPane.add(texto2);
		
		euros = new JButton("Euros a Pesetas");
		euros.setBounds(25, 115, 143, 20);
		contentPane.add(euros);
		
		euros.addActionListener(new ActionListener(){
			
			public void actionPerformed (ActionEvent e) {
				resultado = Double.parseDouble(num1.getText()) * 166.386;
				resultado = Math.round(resultado*100.0) /100.0;
				mensaje.setText("" + resultado + " €");
				
			}
		});
		
		mensaje = new JLabel();
		mensaje.setBounds(25,170,81,10);
		contentPane.add(mensaje);
		
		num1 = new JTextField();
		num1.setBounds(25, 51, 143, 20);
		contentPane.add(num1);

	}

}