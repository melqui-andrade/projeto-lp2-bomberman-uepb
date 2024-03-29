package Jogo;

import java.awt.Image;
import java.awt.Rectangle;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;

import javax.swing.ImageIcon;

/**
 * 
 * @author Melqui
 *
 */
public class Personagem {

	private int x, y;
	private int dx, dy;
	private int largura;
	private int altura;
	private static final int VELOCIDADE = 2;
	private Image imagem;
	private boolean isVisivel;
	private List<Bomba> bombas;
	
	public Personagem(){
		ImageIcon referencia = new ImageIcon("res\\personagem.gif");
		imagem = referencia.getImage();
		bombas = new ArrayList<Bomba>();
		this.x = 100;
		this.y = 100;
		this.largura = imagem.getWidth(null);
		this.altura = imagem.getHeight(null);
	}
	/**
	 * mexer Metodo para movimentar o objeto na tela
	 */
	public void mexer(){
		
		x += dx;
		y += dy;
		if(this.x < 0){
			x = 0;
		}
		if(this.x > 765){
			x = 765;
		}
		if(this.y < 0){
			y = 0;
		}
		if(this.y > 520){
			y = 520;
		}
	}
	/**
	 * getX
	 * @return int x A coordenada do eixo X
	 */
	public int getX() {
		return x;
	}
	/**
	 * getY
	 * @return int y A coordenada do eixo Y
	 */
	public int getY() {
		return y;
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
	
	public List<Bomba> getBombas() {
		return bombas;
	}
	
	public void soltaBomba(){
		this.bombas.add(new Bomba(x, y, 1));
	}
	
	/**
	 * keyPressed Captura a tecla pressionada pelo usuario e executa
	 * a a��o correspondente
	 * @param tecla Tecla pressionada
	 */
	public void keyPressed(KeyEvent tecla){
		
		int codigo = tecla.getKeyCode();
		
		if(codigo == KeyEvent.VK_SPACE)
			soltaBomba();
		
		if(codigo == KeyEvent.VK_UP)
			dy = -VELOCIDADE;
		
		if(codigo == KeyEvent.VK_DOWN)
			dy = VELOCIDADE;
		
		if(codigo == KeyEvent.VK_LEFT)
			dx = -VELOCIDADE;
		
		if(codigo == KeyEvent.VK_RIGHT)
			dx = VELOCIDADE;
		
	}
	public void keyReleased(KeyEvent tecla){
		
		int codigo = tecla.getKeyCode();
		if(codigo == KeyEvent.VK_UP)
			dy = 0;
		
		if(codigo == KeyEvent.VK_DOWN)
			dy = 0;
		
		if(codigo == KeyEvent.VK_LEFT)
			dx = 0;
		
		if(codigo == KeyEvent.VK_RIGHT)
			dx = 0;
		
	}
	
	public Rectangle getBounds(){
		return new Rectangle(x, y, largura, altura);
	}
	

}
