module app.financeiro {
	
	//caso o modulo seja declarado como "open module", ele permitirá que o java reflection seja utilizado
	//isso significa que dados provados de uma classe podem ser mudados a partir do java reflection
	
	//também é possivel abrir pacotes individuais
	//exemplo:
	//opens br.com.cod3r.app.financeiro;
	
	requires java.base;//unico módulo que já vem importado por padrão (não confundir módulo com pacote)
//	requires app.calculo;//agora está definido que este modulo necessita de outro módulo chamado app.calculo
	
	//não precisa existir essa dependencia para app-calculo,
	//pois isso será um dependencia direta da implementação da Calculadora
	
	requires app.api;
	uses br.com.cod3r.app.Calculadora;//especifica o serviço que será usado
	//ao adicionar o uses,não há mais dependencia da implementação em sí
	
}