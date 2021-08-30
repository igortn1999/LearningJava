package sect13_JavaSwing;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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
		
		//Listener:
		
		//Exemplo 1:
//		botao.addActionListener(new ActionListener() {
//			//como Action listener é uma interface, não pode ser instanciada
//			public void actionPerformed(ActionEvent e) {	
//				System.out.println("Evento ocorreu!!");
//				
//			}
//		});
		
		//Exemplo 2:
		botao.addActionListener(e -> System.out.println("Ocorreu!!!"));
		//interface funcional aceita lambda
		
		janela.setVisible(true);
		
	}

}
