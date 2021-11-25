package layout;

import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.RowConstraints;

public class TesteGridPane extends GridPane{
	
	public TesteGridPane() {
		
		Caixa c1 = new Caixa().comTexto("1");
		Caixa c2 = new Caixa().comTexto("2");
		Caixa c3 = new Caixa().comTexto("3");
		Caixa c4 = new Caixa().comTexto("4");
		Caixa c5 = new Caixa().comTexto("5");
		Caixa c6 = new Caixa().comTexto("6");
		
		setGridLinesVisible(true);//permite enxergar as divisões do grid
		
		getColumnConstraints().addAll(cc(), cc(), fcc(), cc(), cc());
		//cada vez que o metodo cc() é chamado, uma nova coluna é criada,
		//portando estamos definindo 5 colunas com as caracteristicas definidas dentro do método cc
		
		getRowConstraints().addAll(rc(), rc(), frc() , rc(), rc());//criando cinco linhas 
		
		//criando espaçoes entre os elementos
		setVgap(10);
		setHgap(10);
		
//		add(c1, 0, 0);//inserindo caixa 1 na linha 0 coluna 0, ocupando apenas um espaço
		add(c1, 0, 0, 2, 2);//inserindo caixa 1 na linha 0 coluna 0, ocupando duas colunas e duas linhas
		
		add(c2, 1, 1, 2, 2);//adicionando caixa 2 na posição 1, 1. Isso cria uma sobreposição
		
		add(c3, 4, 2, 1, 3);//criando caixa na posição 4, 2 , para ocupar uma coluna e 3 linhas
		
		add(c4, 3 ,1);//adicionando c4 na posição 3, 1 com o tamanho padrão
		
		add(c5, 0 ,4);
		
		add(c6, 3, 3);
		
	}
	
	//metodos para setar propriedade de colunas e linhas
	private ColumnConstraints cc() {
		ColumnConstraints cc = new ColumnConstraints();
		cc.setPercentWidth(20);//cada coluna vai ocupar 20% da tela
		cc.setFillWidth(true);//"preencher a largura"
		return cc;
	}
	
	//column constraint com valor fixo
	private ColumnConstraints fcc() {
		ColumnConstraints cc = new ColumnConstraints();
		//utilizar o mesmo valor de minimo e de maximo para que o elemento não aumente nem diminua de tamanho
		setMinWidth(50);
		setMaxWidth(50);
		cc.setFillWidth(true);
		return cc;
	}
	
	
	private RowConstraints rc() {
		RowConstraints rc = new RowConstraints();
		rc.setPercentHeight(20);
		rc.setFillHeight(true);
		return rc;
	}

	//row constraint com valor fixo
	private RowConstraints frc() {
		RowConstraints rc = new RowConstraints();
		rc.setMinHeight(50);
		rc.setMaxHeight(50);
		rc.setFillHeight(true);
		return rc;
	}

}
