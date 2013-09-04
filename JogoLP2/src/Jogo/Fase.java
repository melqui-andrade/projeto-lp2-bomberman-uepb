package Jogo;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;

import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.Timer;

public class Fase extends JPanel implements ActionListener {

	private Image fundo;
	private Personagem jogador;
	private Timer timer;
	private boolean emJogo;
	private List<Inimigo> inimigos;
	private int[][] coordenadas = { { 120, 50 }, { 120, 300 }, { 120, 480 }, { 120, 500 } };

	public Fase() {

		setDoubleBuffered(true);
		setFocusable(true);
		addKeyListener(new TecladoAdapter());
		ImageIcon referencia = new ImageIcon("res\\fundo1.jpg");
		fundo = referencia.getImage();
		jogador = new Personagem();

		emJogo = true;
		inicializaInimigos();
		timer = new Timer(10, this);
		timer.start();

	}

	public void inicializaInimigos() {
		inimigos = new ArrayList<Inimigo>();

		for (int i = 0; i < coordenadas.length; i++) {
			inimigos.add(new Inimigo(coordenadas[i][0], coordenadas[i][1],
					"res\\inimigo_1.gif"));
		}
	}

	public void paint(Graphics g) {

		Graphics2D graficos = (Graphics2D) g;
		graficos.drawImage(fundo, 0, 0, null);

		if (emJogo) {

			graficos.drawImage(jogador.getImagem(), jogador.getX(),
					jogador.getY(), this);
			
			List<Bomba> bombas = jogador.getBombas();

			for (int i = 0; i < bombas.size(); i++) {
				Bomba b = (Bomba) bombas.get(i);
				graficos.drawImage(b.getImagem(), b.getX(), b.getY(), this);
			}

			for (int i = 0; i < inimigos.size(); i++) {
				Inimigo monstros = inimigos.get(i);
				graficos.drawImage(monstros.getImagem(), monstros.getX(),
						monstros.getY(), this);
			}
		}
		else{
			System.exit(0);
		}

		g.dispose();
	}

	public void actionPerformed(ActionEvent e) {

		if (inimigos.size() == 0) {
			emJogo = false;
		}

		List<Bomba> bombas = jogador.getBombas();
		for (int i = 0; i < bombas.size(); i++) {
			Bomba b = (Bomba) bombas.get(i);
			if (b.isVisivel()) {
				b.soltaBomba();
			}
		}
		for (int i = 0; i < inimigos.size(); i++) {
			Inimigo monstro = inimigos.get(i);
			if (monstro.isVisivel()) {
				monstro.mexer();
			} else {
				inimigos.remove(i);
			}
		}
		jogador.mexer();
		capturaColisoes();
		repaint();
	}

	public void capturaColisoes() {

		Rectangle formaPersonagem = jogador.getBounds();
		Rectangle formaInimigo;
		Rectangle formaBomba;

		for (int i = 0; i < inimigos.size(); i++) {

			Inimigo tempInimigo = inimigos.get(i);
			formaInimigo = tempInimigo.getBounds();
			if (formaPersonagem.intersects(formaInimigo)) {
				jogador.setVisivel(false);
				

			}
		}
		List<Bomba> bombas = jogador.getBombas();
		for (int i = 0; i < bombas.size(); i++) {

			Bomba tempBomba = bombas.get(i);
			formaBomba = tempBomba.getBounds();
			for (int j = 0; j < inimigos.size(); j++) {

				Inimigo tempInimigo = inimigos.get(j);
				formaInimigo = tempInimigo.getBounds();

				if (formaBomba.intersects(formaInimigo)) {

					tempInimigo.setVisivel(false);
					tempBomba.setVisivel(false);
				}
			}
		}

	}

	private class TecladoAdapter extends KeyAdapter {

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
