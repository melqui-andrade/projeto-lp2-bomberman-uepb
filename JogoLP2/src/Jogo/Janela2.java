package Jogo;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class Janela2 extends JFrame{

	public Janela2(){
		setTitle("JOGO");
		
		setSize(800, 600);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JButton btnSair = new JButton("SAIR");
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
