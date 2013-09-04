package Jogo;

import java.awt.Image;
import java.awt.Rectangle;

import javax.swing.ImageIcon;

public class Explosao {

	private Image imagem;
	private int x, y;
	private boolean isVisivel;
	private int timer;
	private int largura = 30;
	private int altura = 30;
	
	private static final int TEMPO_ESTOURO = 20;
	
	public Explosao(int x, int y){
		this.x = x;
		this.y = y;
		timer = 0;
		
		ImageIcon refencia = new ImageIcon("res\\explosao.gif");
		imagem = refencia.getImage();
		
		isVisivel = true;
		
	}
	public void explode(){
		timer++;

		if (timer >= TEMPO_ESTOURO) {
			isVisivel = false;
		}
	}
	public boolean isVisivel() {
		return isVisivel;
	}
	
	
	public Image getImagem() {
		return imagem;
	}
	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}
	public Rectangle getBounds() {
		return new Rectangle(x, y, largura, altura);
	}
	
}
