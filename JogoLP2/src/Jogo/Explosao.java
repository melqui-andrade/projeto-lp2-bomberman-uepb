package Jogo;

import java.awt.Image;

import javax.swing.ImageIcon;

public class Explosao {

	private Image imagem;
	private int x, y;
	private boolean isVisivel;
	private int timer;
	private static final int  LARGURA_DA_TELA = 800;
	private static final int TEMPO_ESTOURO = 10;
	
	public Explosao(int x, int y, int potencia){
		this.x = x;
		this.y = y;
		timer = 0;
		
		ImageIcon refencia = new ImageIcon("res\\explosao.gif");
		imagem = refencia.getImage();
		
		isVisivel = true;
		
	}
	
}
