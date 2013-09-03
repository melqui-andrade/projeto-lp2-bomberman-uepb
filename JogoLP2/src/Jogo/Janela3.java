package Jogo;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Janela3 extends JFrame{

	public Janela3(){
		setTitle("CRÉDITO");
		
		setSize(800, 600);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JButton btnSair = new JButton("RETORNAR");
		btnSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				new Janela();
				setVisible(false);
			}
		});
		btnSair.setBounds(51, 361, 250, 100);
		panel.add(btnSair);
		setVisible(true);
	}
	

}