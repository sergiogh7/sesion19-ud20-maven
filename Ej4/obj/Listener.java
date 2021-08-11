package obj;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.*;

public class Listener extends JFrame {

	private JPanel contentPane;
	private JLabel mensajes;
	private JTextArea textArea;
	private JScrollPane scroll;

	private String resp = "";
	
	public Listener() {
		
		setTitle("<< Listener del mouse >>");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 456, 375);
        setVisible(true);
        contentPane = new JPanel();
        contentPane.setLayout(null);
        setContentPane(contentPane);

        mensajes = new JLabel("Acciones: ");
        mensajes.setBounds(10, 144, 75, 13);
        contentPane.add(mensajes);
		
        textArea = new JTextArea();
        textArea.setBounds(73, 36, 332, 241);
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
        
	}

}