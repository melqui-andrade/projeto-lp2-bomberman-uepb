package Jogo;
import javax.swing.JFrame;

public class ConteinerDeJanelas extends JFrame {

	public ConteinerDeJanelas(){
		add(new Fase());
		setTitle("Bomber Computeiro");
		setSize(800,600);
		setLocationRelativeTo(null);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new ConteinerDeJanelas();
		
	}

}
