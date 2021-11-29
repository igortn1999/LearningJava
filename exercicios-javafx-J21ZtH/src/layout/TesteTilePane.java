package layout;

import java.util.ArrayList;
import java.util.List;

import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.layout.TilePane;

public class TesteTilePane extends TilePane{
	//cada elemento vai ocupar, por padrão, o mesmo espaço (tile), intependentemente do seu tamanho
	
	public TesteTilePane() {
		
		List<Quadrado> quadrados = new ArrayList<>();
		
		for(int i=1; i< 9;i++) {
			quadrados.add(new Quadrado(i * 10));
		}
		
		setPadding(new Insets(20, 10, 20, 10));//Segue o raciocinio dos paddings de CSS
		
		setVgap(10);
		setHgap(10);
		
		setOrientation(Orientation.VERTICAL);//Tiles serão adicionado verticalmente
		setTileAlignment(Pos.BOTTOM_RIGHT);//cada tile tem seu proprio alinhamento
		
		getChildren().addAll(quadrados);
		
	}

}
