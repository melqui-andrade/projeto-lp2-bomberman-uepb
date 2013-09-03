package Jogo;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.AbstractButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.JComboBox;
import javax.swing.table.DefaultTableModel;

public class Janela extends JFrame{
	JPanel painel = new JPanel();
	private JTable table;
	public Janela() {
		iniciar();
		getContentPane().setLayout(null);
		painel.setBounds(0, 0, 1, 561);
		getContentPane().add(painel);
		
		painel.setLayout(null);
		
		JButton btnIniciar = new JButton("INICIAR");
		btnIniciar.setBounds(51, 105, 250, 100);
		getContentPane().add(btnIniciar);
		btnIniciar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				new ConteinerDeJanelas();
				setVisible(false);
				
			}
		});
		
		JButton btncredito = new JButton("CRÉDITO");
		btncredito.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				new Janela3();
				setVisible(false);
			}
		});
		btncredito.setBounds(51, 233, 250, 100);
		getContentPane().add(btncredito);
		
		JButton btnSair = new JButton("SAIR");
		btnSair.setBounds(51, 361, 250, 100);
		getContentPane().add(btnSair);
		btnSair.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});		
	}


	private void iniciar() {
		setTitle("MENU PRINCIPAL");
		setSize(800, 600);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		new Janela();

	}
}
