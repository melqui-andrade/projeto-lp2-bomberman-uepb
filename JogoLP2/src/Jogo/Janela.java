package Jogo;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.List;

import javax.swing.AbstractButton;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.JComboBox;
import javax.swing.table.DefaultTableModel;

public class Janela extends JFrame{
	JPanel painel = new JPanel();
	private JTable table;
	private Image fundo;
	JButton b1;
	JLabel l1;
	
	public Janela() {
		iniciar();
					
		getContentPane().setLayout(null);
		painel.setBounds(0, 0, 1, 561);
		getContentPane().add(painel);
		painel.setLayout(null);
				
		
		JButton btnIniciar = new JButton("INICIAR");
		btnIniciar.setBorderPainted(false);
		btnIniciar.setContentAreaFilled(false); 
		Icon iconeIniciar = new ImageIcon("res//btnIniciar.png");
		btnIniciar.setIcon( iconeIniciar );
		btnIniciar.setFocusPainted(false); 
		btnIniciar.setBounds(101, 300, 128, 35);
		getContentPane().add(btnIniciar);
		btnIniciar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				new ConteinerDeJanelas();
				setVisible(false);
				
			}
		});
		
		JButton btncredito = new JButton("CRÉDITO");
		btncredito.setBounds(101, 360, 125, 50);
		btncredito.setBorderPainted(false);
		btncredito.setContentAreaFilled(false); 
		Icon iconeCredito = new ImageIcon("res//btnCredito.png");
		btncredito.setIcon( iconeCredito );
		getContentPane().add(btncredito);
		btncredito.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				new Janela3();
				setVisible(false);
			}
		});
		
		
		JButton btnSair = new JButton("SAIR");
		btnSair.setBounds(101, 420, 125, 50);
		btnSair.setBorderPainted(false);
		btnSair.setContentAreaFilled(false); 
		Icon iconeSair = new ImageIcon("res//btnSair.png");
		btnSair.setIcon( iconeSair );
		
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
		setContentPane(new JLabel(new ImageIcon("res//inicial.jpg")));
		setSize(801, 601);
		setSize(800, 600);
		
		
		
	}
	
	
	public static void main(String[] args) {
		new Janela();

	}
}
