package obj;

import javax.swing.*;

public class Ventana extends JFrame {

	private JPanel contentPane;
	private JLabel etiqueta;
	
	public Ventana() {
		setTitle("<<< Ventana >>>");
		setBounds(200, 200, 300, 200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		contentPane = new JPanel();
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		etiqueta = new JLabel("Puede cambiar el tamaño de la ventana");
		etiqueta.setBounds(10, 10, 250, 25);
		contentPane.add(etiqueta);
		
	}

	
}