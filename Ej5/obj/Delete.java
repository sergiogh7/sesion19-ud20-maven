package obj;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.*;

public class Delete extends JFrame {

	private JPanel contentPane;
	private JLabel mensaje;
	private JTextArea textArea;
	private JScrollPane scroll;
	private JButton boton;

	private String resp = "";
	
	public Delete() {
		
		setTitle("<< Delete >>");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 456, 375);
        setVisible(true);
        contentPane = new JPanel();
        contentPane.setLayout(null);
        setContentPane(contentPane);

        mensaje = new JLabel("Acciones: ");
        mensaje.setBounds(10, 144, 75, 13);
        contentPane.add(mensaje);
		
        textArea = new JTextArea();
        textArea.setBounds(0, 0, 332, 241);
        contentPane.add(textArea);
        
        textArea.addMouseListener(new MouseAdapter(){
        	
        	public void mouseEntered(MouseEvent e) {
        		resp += "Ha entrado\n";
        		textArea.setText(resp);
        		
        	}
        });
        
        textArea.addMouseListener(new MouseAdapter() {
        	
            public void mouseClicked(MouseEvent e) {
                resp += "Ha clicado\n";
                textArea.setText(resp);
                
            }

        });
        
        textArea.addMouseListener(new MouseAdapter(){
        	
        	public void mouseExited(MouseEvent e) {
        		resp += "Ha salido\n";
        		textArea.setText(resp);
        		
        	}
        });
        
        scroll = new JScrollPane(textArea);
        scroll.setBounds(73, 36, 332, 241);
        contentPane.add(scroll);
        
        boton = new JButton("DELETE");
        boton.setBounds(193,288,80,36);
        contentPane.add(boton);
        
        boton.addActionListener(new ActionListener(){
        	
			public void actionPerformed (ActionEvent e) {
				resp = "";
				textArea.setText(resp);
				
			}
		});
        
	}

}