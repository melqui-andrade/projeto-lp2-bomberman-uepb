package Jogo;

import java.awt.Image;

import javax.swing.ImageIcon;

public class Bomba {

	private Image imagem;
	private int x, y;
	private boolean isVisivel;
	private int timer;
	private static final int  LARGURA_DA_TELA = 800;
	private static final int TEMPO_ESTOURO = 10;
	
	
	public Bomba(int x, int y, int potencia){
		this.x = x;
		this.y = y;
		timer = 0;
		
		ImageIcon refencia = new ImageIcon("res\\bomb.gif");
		imagem = refencia.getImage();
		
		isVisivel = true;
		
	}
	public void soltaBomba(){
		
		timer ++;
		if(timer >= TEMPO_ESTOURO){
			
		}
		
	}
	
	

	public Image getImagem() {
		return imagem;
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
	
	
}
