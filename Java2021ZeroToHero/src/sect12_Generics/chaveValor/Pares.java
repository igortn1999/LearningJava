package sect12_Generics.chaveValor;

import java.util.LinkedHashSet;
import java.util.Optional;
import java.util.Set;

public class Pares<C extends Number, V>{
	
	final Set<Par<C, V>> itens = new LinkedHashSet<>();
	
	public void adicionar(C chave, V valor) {
		if(chave == null) return;
		//ao chamar return dentro de um metodo void, ele simplesmente sai do metodo;
		
		Par<C, V> novoPar = new Par<C, V>(chave, valor);
		
		if(itens.contains(novoPar)) {
			itens.remove(novoPar);
			//se já houver um par com a chave inserida, o valor será sobrescrevido no itens.add
		}
		
		itens.add(novoPar);
	}
	
	public V getValor(C chave){
		
		if(chave==null) return null;
		
		Optional<Par<C, V>> parOpcional = itens.stream()
											.filter(par -> chave.equals(par.getChave()))
											.findFirst();
		
		return parOpcional.isPresent()? parOpcional.get().getValor(): null;
	}

}
