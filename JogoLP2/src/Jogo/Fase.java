package Jogo;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.List;

import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.Timer;

public class Fase extends JPanel implements ActionListener{
	
	private Image fundo;
	private Personagem jogador;
	private Timer timer;

	public Fase(){
		
		setDoubleBuffered(true);
		setFocusable(true);
		addKeyListener(new TecladoAdapter());
		ImageIcon referencia = new ImageIcon("res\\fundo1.jpg");
		fundo = referencia.getImage();
		jogador = new Personagem();
		timer = new Timer(8, this);
		timer.start();
		
	}

	public void paint(Graphics g){
		
		Graphics2D graficos = (Graphics2D) g;
		graficos.drawImage(fundo, 0, 0, null);
		graficos.drawImage(jogador.getImagem(), jogador.getX(), jogador.getY(),this);
		
		List<Bomba> bombas = jogador.getBombas();
		
		for(int i = 0; i < bombas.size();i++){
			Bomba b = (Bomba)bombas.get(i);
			graficos.drawImage(b.getImagem(),b.getX(),b.getY(),this);
		}
		
		g.dispose();
	}
	
	public void actionPerformed(ActionEvent e) {
		
		List<Bomba> bombas = jogador.getBombas();
		for(int i = 0; i < bombas.size();i++){
			Bomba b = (Bomba)bombas.get(i);
			if(b.isVisivel()){
				b.soltaBomba();
			}
		}
		
		jogador.mexer();
		repaint();
	}
	
	private class TecladoAdapter extends KeyAdapter{

		@Override
		public void keyPressed(KeyEvent arg0) {
			// TODO Auto-generated method stub
			jogador.keyPressed(arg0);
		}

		@Override
		public void keyReleased(KeyEvent arg0) {
			// TODO Auto-generated method stub
			jogador.keyReleased(arg0);
		}
		
		
	}
	
}
