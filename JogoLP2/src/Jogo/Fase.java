package Jogo;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Rectangle;
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
	private Inimigo monstro1, monstro2;
	private Timer timer;
	private boolean emJogo;

	public Fase(){
		
		setDoubleBuffered(true);
		setFocusable(true);
		addKeyListener(new TecladoAdapter());
		ImageIcon referencia = new ImageIcon("res\\fundo1.jpg");
		fundo = referencia.getImage();
		jogador = new Personagem();
		monstro1 = new Inimigo(700,100,"res\\inimigo_1.gif");
		monstro2 = new Inimigo(150,400,"res\\inimigo_1.gif");
		emJogo = true;
		timer = new Timer(8, this);
		timer.start();
		
	}

	public void paint(Graphics g){
		
		Graphics2D graficos = (Graphics2D) g;
		graficos.drawImage(fundo, 0, 0, null);
		graficos.drawImage(jogador.getImagem(), jogador.getX(), jogador.getY(),this);
		graficos.drawImage(monstro1.getImagem(),monstro1.getX(),monstro1.getY(),this);
		graficos.drawImage(monstro2.getImagem(),monstro2.getX(),monstro2.getY(),this);
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
		monstro1.mexer();
		System.out.println("X: "+monstro1.getX());
		monstro2.mexer();
		jogador.mexer();
		repaint();
	}
	
	public void capturaColisoes(){
		
		Rectangle doPersonagem = jogador.getBounds();
		Rectangle doInimigo;
		Rectangle daBomba;
		
		for(int i = 0; i < 4; i++){
			
			
		}
		
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
