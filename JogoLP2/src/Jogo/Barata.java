package Jogo;

import java.awt.Image;
import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;

/**
 * 
 * @author Melqui
 *
 */
public class Barata {

	private int x, y;
	private int dx, dy;
	private Image imagem;
	
	public Barata(){
		ImageIcon referencia = new ImageIcon("res\\barata.gif");
		imagem = referencia.getImage();
		
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
		if(this.x < 2){
			x = 2;
		}
		if(this.x > 435){
			x = 435;
		}
		if(this.y < 0){
			y = 0;
		}
		if(this.y > 315){
			y = 315;
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
	/**
	 * keyPressed Captura a tecla pressionada pelo usuario e executa
	 * a ação correspondente
	 * @param tecla Tecla pressionada
	 */
	public void keyPressed(KeyEvent tecla){
		
		int codigo = tecla.getKeyCode();
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
