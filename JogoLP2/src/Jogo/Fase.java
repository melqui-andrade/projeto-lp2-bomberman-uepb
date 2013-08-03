package Jogo;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.Timer;

public class Fase extends JPanel implements ActionListener{
	
	private Image fundo;
	private Barata barata;
	private Timer timer;

	public Fase(){
		
		setDoubleBuffered(true);
		setFocusable(true);
		addKeyListener(new TecladoAdapter());
		ImageIcon referencia = new ImageIcon("res\\fundo.jpg");
		fundo = referencia.getImage();
		barata = new Barata();
		timer = new Timer(5, this);
		timer.start();
		
	}

	public void paint(Graphics g){
		
		Graphics2D graficos = (Graphics2D) g;
		graficos.drawImage(fundo, 0, 0, null);
		graficos.drawImage(barata.getImagem(), barata.getX(), barata.getY(),this);
		
		g.dispose();
	}
	
	public void actionPerformed(ActionEvent e) {
		barata.mexer();
		repaint();
	}
	
	private class TecladoAdapter extends KeyAdapter{

		@Override
		public void keyPressed(KeyEvent arg0) {
			// TODO Auto-generated method stub
			barata.keyPressed(arg0);
		}

		@Override
		public void keyReleased(KeyEvent arg0) {
			// TODO Auto-generated method stub
			barata.keyReleased(arg0);
		}
		
		
	}
	
}
