package Jogo;

import java.awt.Image;
import java.awt.Rectangle;
import java.util.ArrayList;
import java.util.List;

import javax.swing.ImageIcon;

public class Bomba {

	private Image imagem1, imagem2;
	private int x, y;
	private boolean isVisivel;
	private int timer;
	private int largura;
	private int altura;
	private boolean isEstouro;
	private int potencia;
	private static final int LARGURA_DA_TELA = 800;
	private static final int TEMPO_ESTOURO = 100;
	private static List<Explosao> explosoes;

	public Bomba(int x, int y, int potencia) {
		this.x = x;
		this.y = y;
		timer = 0;
		this.potencia = potencia;

		ImageIcon refencia = new ImageIcon("res\\bomb.gif");
		imagem1 = refencia.getImage();
		this.largura = imagem1.getWidth(null);
		this.altura = imagem1.getWidth(null);
		isVisivel = true;
		isEstouro = false;

	}

	public void soltaBomba() {

		timer++;

		if (timer >= TEMPO_ESTOURO) {
			isEstouro = true;
			isVisivel = false;
		}
	}

	public Image getImagem() {
		return imagem1;
	}

	public boolean isVisivel() {
		return isVisivel;
	}

	public void setVisivel(boolean isVisivel) {
		this.isVisivel = isVisivel;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}
	
	

	public boolean isEstouro() {
		return isEstouro;
	}

	public List<Explosao> getExplosoes() {
		return explosoes;
	}

	public Rectangle getBounds() {
		return new Rectangle(x, y, largura, altura);
	}

}
