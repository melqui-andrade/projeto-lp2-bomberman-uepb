package Jogo;

import java.awt.Image;

import javax.swing.ImageIcon;

public class Bomba {

	private Image imagem;
	private int x, y;
	private boolean isVisivel;
	private int timer;
	private static final int  LARGURA_DA_TELA = 500;
	private static final int TEMPO_ESTOURO = 10;
	
	public Bomba(int x, int y){
		this.x = x;
		this.y = y;
		timer = 0;
		
		ImageIcon refencia = new ImageIcon("res\\bomba.jpeg");
		imagem = refencia.getImage();
		
		isVisivel = true;
		
	}
	public void estourar(){
		timer ++;
		if(timer >= TEMPO_ESTOURO){
			
		}
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
