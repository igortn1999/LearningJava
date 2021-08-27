package sect13_JavaSwing;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Observador {
	
	public static void main(String[] args) {
		
		JFrame janela = new JFrame("Observador");
		janela.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		janela.setSize(600, 200);
		janela.setLayout(new FlowLayout());
		janela.setLocationRelativeTo(null);
		//ao passar nulo, o comportamento é centralizar na tela do computador 
		
		
		JButton botao = new JButton("Clicar");
		janela.add(botao);
		
		
		
		
		
		janela.setVisible(true);
		
	}

}
