package obj;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class MasaCorporal extends JFrame {

	private JPanel contentPane;
	
	private JLabel texto;
	private JLabel texto2;
	private JTextField num1;
	private JTextField num2;
	private JLabel mensaje;
	private JButton calculo;

	private double resultado = 0;
	
	public MasaCorporal() {
		
		setTitle("<< IMC >>");
		setBounds(100, 100, 210, 270);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		contentPane = new JPanel();
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		calculo = new JButton("CALCULAR");
		calculo.setBounds(25,165,98,30);
		contentPane.add(calculo);
		
		calculo.addActionListener(new ActionListener(){
			
			public void actionPerformed (ActionEvent e) {
				resultado = Double.parseDouble(num2.getText()) / Math.pow(Double.parseDouble(num1.getText()) , 2);
				resultado = Math.round(resultado*100.0) /100.0;
				String text = "IMC: " + resultado;
				mensaje = new JLabel(text);
				mensaje.setBounds(25,210,81,10);
				contentPane.add(mensaje);
				
			}
		});
		
		texto = new JLabel("Altura (metros)");
		texto.setBounds(25, 35, 100, 20);
		contentPane.add(texto);
		
		texto2 = new JLabel("Peso (kg)");
		texto2.setBounds(25, 100, 81, 20);
		contentPane.add(texto2);
		
		num1 = new JTextField();
		num1.setBounds(25, 66, 143, 20);
		contentPane.add(num1);

		num2 = new JTextField();
		num2.setBounds(25, 131, 143, 20);
		contentPane.add(num2);
		
	}

}