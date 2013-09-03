package Jogo;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class Fase002 extends JPanel implements ActionListener {
	private Image fundo;
	private Image caixa;
	private Image vaso;
	public Fase002() {
		ImageIcon referencia = new ImageIcon("res\\fundo002.png");
		fundo = referencia.getImage();
		
		ImageIcon caixa1 = new ImageIcon("res\\caixa.png");
		ImageIcon vaso1 = new ImageIcon("res\\vaso.png");
				
		caixa = caixa1.getImage();
		vaso = vaso1.getImage();
	}

	
void drawImageFase(Graphics2D graficos){
	String[][] arrayFase = {	{"p","-","p","p","p","p","p","p","p","p","p","p","p","p","p","p","p","p","p"},
								{"p","-","p","p","p","x","x","x","-","x","x","x","x","x","x","-","x","x","p"},
								{"p","-","p","-","p","x","x","-","-","-","-","-","p","p","x","p","x","p","p"},
								{"p","-","p","-","-","x","x","-","-","-","-","-","p","p","x","p","x","x","p"},
								{"p","-","p","-","-","x","x","-","-","-","-","-","p","p","x","x","-","-","p"},
								{"p","-","p","p","p","x","x","x","x","x","x","x","x","-","x","x","p","p","p"},
								{"p","-","x","-","-","-","-","p","x","x","-","-","-","-","x","p","-","p","p"},
								{"p","-","x","x","-","p","p","p","x","x","-","-","-","-","x","p","-","p","p"},
								{"p","-","x","x","-","p","p","p","p","x","p","p","-","-","x","x","x","p","p"},
								{"p","x","x","x","p","p","-","p","p","x","p","p","p","p","x","-","x","p","p"},
								{"p","x","x","x","p","p","x","-","p","x","-","x","x","x","x","-","x","-","p"},
								{"p","x","-","-","-","x","x","x","p","x","-","-","-","-","x","-","x","-","p"},
								{"p","p","p","p","p","p","p","p","p","p","p","p","p","p","p","p","p","p","p"},
							};
		int x = 18;
		int y = 18;
	for (int i = 0; i< arrayFase.length; i++){
		for (int j =0; j< arrayFase[i].length; j++){
			if (arrayFase[i][j] == "x"){
				graficos.drawImage(vaso, x,y,this);
							
			}if(arrayFase[i][j] == "p"){
				graficos.drawImage(caixa, x,y,this);
			}
			x+=40;	
			System.out.print(arrayFase[i][j] + " ");
			
		 }
		 System.out.println();
		 x=20;
		 y+=40;
	}			
}
	public void paint(Graphics g){
		
		Graphics2D graficos = (Graphics2D) g;
		graficos.drawImage(fundo, 0, 0, null);
			
		drawImageFase(graficos);
				
		g.dispose();
	}
	
	public void actionPerformed(ActionEvent arg0) {
	
		
	}

}
