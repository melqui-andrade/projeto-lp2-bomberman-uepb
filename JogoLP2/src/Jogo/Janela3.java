package Jogo;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Janela3 extends JFrame{

	public Janela3(){
		setTitle("CRÉDITO");
		setSize(800, 600);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		setContentPane(new JLabel(new ImageIcon("res//creditos.jpg")));
		setSize(801, 601);
		setSize(800, 600);	
		
		
		getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JButton btnSair = new JButton("RETORNAR");
		panel.add(btnSair);
		btnSair.setBounds(101, 420, 125, 50);
		btnSair.setBorderPainted(false);
		btnSair.setContentAreaFilled(false); 
		btnSair.setFocusPainted(false); 

		Icon iconeSair = new ImageIcon("res//btnRetornar.png");
		btnSair.setIcon( iconeSair );
		getContentPane().add(btnSair);

		btnSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				new Janela();
				setVisible(false);
			}
		});
		
		
		
	}
	

}