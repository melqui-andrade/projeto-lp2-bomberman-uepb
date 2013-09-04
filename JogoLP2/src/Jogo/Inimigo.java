package Jogo;

import java.awt.Image;
import java.awt.Rectangle;
import java.util.Random;

import javax.swing.ImageIcon;

public class Inimigo {

	private Image imagem;
	private int x, y;
	private int largura, altura;
	private boolean isVisivel, isLimX = false, isLimY = false;
	private Random rand = new Random();
	private int direcao = 2;
	private static final int  LARGURA_DA_TELA = 755;
	private static final int  ALTURA_DA_TELA = 530;
	private static final int VELOCIDADE = 2;
	
	
	public Inimigo(int x, int y, String resource){
		this.x = x;
		this.y = y;
		
		
		ImageIcon refencia = new ImageIcon(resource);
		this.imagem = refencia.getImage();
		this.largura = imagem.getWidth(null);
		this.altura = imagem.getHeight(null);
		
		isVisivel = true;
		
	}
	
	public boolean mexerDireita(){
		if (this.x < LARGURA_DA_TELA && !isLimX ){
			x+=VELOCIDADE;
			}
		if(this.x >= LARGURA_DA_TELA){
			isLimX = true;
			this.x = LARGURA_DA_TELA;
		}
		return isLimX;
	}
	public boolean mexerEsquerda(){
		if (this.x >= LARGURA_DA_TELA || isLimX){
			x-=VELOCIDADE;
		}
		if(this.x <= 0){
			isLimX = false;
			this.x = 0;
		}
		return isLimX;
	}
	public boolean mexerBaixo(){
		if (this.y < ALTURA_DA_TELA && !isLimY ){
			y+=VELOCIDADE;
		}
		if(this.y == ALTURA_DA_TELA){
			isLimY = true;
			this.y = ALTURA_DA_TELA;
		}
		return isLimY;
		
	}
	public boolean mexerCima(){
		if (this.y >= ALTURA_DA_TELA || isLimY){
			y-=VELOCIDADE;
		}
		if(this.y <= 0){
			isLimY = false;
			this.y = 0;
		}
		return isLimY;
	}
	
	public void mexer(){
		
		if(direcao == 0){
			
			if(mexerDireita())
				direcao = rand.nextInt(4);
		}
		if(direcao == 1){
			
			if(!mexerEsquerda())
				direcao = rand.nextInt(3);
		}
		if(direcao == 2){
			
			if(!mexerCima())
				direcao = rand.nextInt(3);
		}
		if(direcao == 3){
			
			if(mexerBaixo())
				direcao = rand.nextInt(3);
		}			
	}
	
	public Rectangle getBounds(){
		return new Rectangle(x, y, largura, altura);
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
