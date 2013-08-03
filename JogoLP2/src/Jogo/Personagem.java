package Jogo;

import java.awt.Image;
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
	private Image imagem;
	private List<Bomba> bombas;
	
	public Personagem(){
		ImageIcon referencia = new ImageIcon("res\\personagem.gif");
		imagem = referencia.getImage();
		bombas = new ArrayList<Bomba>();
		this.x = 100;
		this.y = 100;
	}
	/**
	 * mexer Metodo para movimentar o objeto na tela
	 */
	public void mexer(){
		System.out.println(x +" "+y);
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
	
	public List<Bomba> getBombas() {
		return bombas;
	}
	
	public void soltaBomba(){
		this.bombas.add(new Bomba(x, y, 1));
	}
	
	/**
	 * keyPressed Captura a tecla pressionada pelo usuario e executa
	 * a ação correspondente
	 * @param tecla Tecla pressionada
	 */
	public void keyPressed(KeyEvent tecla){
		
		int codigo = tecla.getKeyCode();
		
		if(codigo == KeyEvent.VK_SPACE)
			soltaBomba();
		
		if(codigo == KeyEvent.VK_UP)
			dy = -1;
		
		if(codigo == KeyEvent.VK_DOWN)
			dy = 1;
		
		if(codigo == KeyEvent.VK_LEFT)
			dx = -1;
		
		if(codigo == KeyEvent.VK_RIGHT)
			dx = 1;
		
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
	

}
