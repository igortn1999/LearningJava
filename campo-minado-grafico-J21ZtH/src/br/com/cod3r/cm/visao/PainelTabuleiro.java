package br.com.cod3r.cm.visao;

import java.awt.GridLayout;

import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

import br.com.cod3r.cm.modelo.Tabuleiro;

@SuppressWarnings("serial")
public class PainelTabuleiro extends JPanel{
	
	public PainelTabuleiro(Tabuleiro tabuleiro) {
		
		setLayout(new GridLayout(tabuleiro.getLinhas(), tabuleiro.getColunas()));
		
		tabuleiro.paraCada(c -> add(new BotaoCampo(c)));
		
		tabuleiro.registrarObservador(e ->{
			
			SwingUtilities.invokeLater( () ->{//renderizar a dialog só depois do * da mina aparecer
				if(e.isGanhou()) {
					JOptionPane.showMessageDialog(this, "GANHOU!!");
				}else {
					JOptionPane.showMessageDialog(this, "Perdemo!");
				}
				
				tabuleiro.reiniciar();
			});
			
			
		});
	
	}

}
