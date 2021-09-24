package br.com.cod3r.calc.visao;

import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

import br.com.cod3r.calc.modelo.Memoria;

@SuppressWarnings("serial")
public class Teclado extends JPanel implements ActionListener{
	
	private final Color CINZA = new Color(99, 99, 99);
	private final Color CINZA_ESCURO = new Color(68, 68, 68);
	private final Color LARANJA = new Color(242, 163, 60);
	
	public Teclado() {
		
		GridBagLayout layout = new GridBagLayout();
		GridBagConstraints c = new GridBagConstraints();
		setLayout(layout);
		
		c.weightx = c.weighty = 1;//o espaço disponível para ocupação é 100%
		
		c.fill = GridBagConstraints.BOTH;//faz com que os botões preencham os espaços,
		//vertical e horizontalmente
		
		//Linha 1
		adicionarBotao("AC", CINZA_ESCURO, c, 0, 0);
		adicionarBotao("+/-",CINZA_ESCURO, c, 1, 0);
		adicionarBotao("%",  CINZA_ESCURO, c, 2, 0);
		adicionarBotao("/",  LARANJA, 	 	c, 3, 0);
		//Linha 2
		adicionarBotao("7", CINZA,  		c, 0, 1);
		adicionarBotao("8", CINZA,  		c, 1, 1);
		adicionarBotao("9", CINZA, 		c, 2, 1);
		adicionarBotao("*", LARANJA, 	 	c, 3, 1);
		//Linha 3
		adicionarBotao("4", CINZA,  		c, 0, 2);
		adicionarBotao("5", CINZA,  		c, 1, 2);
		adicionarBotao("6", CINZA, 		c, 2, 2);
		adicionarBotao("-", LARANJA, 	 	c, 3, 2);
		//Linha 4
		adicionarBotao("1", CINZA,  		c, 0, 3);
		adicionarBotao("2", CINZA,  		c, 1, 3);
		adicionarBotao("3", CINZA, 		c, 2, 3);
		adicionarBotao("+", LARANJA, 	 	c, 3, 3);
		//Linha 5
		c.gridwidth = 2;//o proximo botao vai ocupar o espaço de dois
		adicionarBotao("0", CINZA,  		c, 0, 4);
		c.gridwidth = 1;//voltar pro padrão
		adicionarBotao(",", CINZA,  		c, 2, 4);
		adicionarBotao("=", LARANJA, 		c, 3, 4);
		
	}

	private void adicionarBotao(String texto, Color cor, GridBagConstraints c, int x, int y) {
		c.gridx = x;
		c.gridy = y;
		Botao botao = new Botao(texto, cor);
		botao.addActionListener(this);
		this.add(botao, c);
		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource() instanceof JButton) {
			JButton botao = (JButton) e.getSource();
			Memoria.getInstancia().processarComando(botao.getText());				
		}
		
	}

}
