import br.com.cod3r.app.calculo.CalculadoraImpl;

module app.calculo {
	exports br.com.cod3r.app.calculo;
	//informa que este pacote pode ser encontrado por outros pacotes
	//os sub-pacotes NÃO ESTÃO automaticamente incluidos
	
//	requires app.financeiro;
	//isso não será permitido de forma alguma, para que não seja criada uma dependencia ciclica
	
	
//	requires app.logging;
	requires transitive app.logging;//queremos que essa dependencia seja transitiva para quem irá usar o app-calculo
	//ou seja, queremos transmitir isso para o cliente, por exemplo
	//isso só é necessário porque colocamos na assinatira do método "getLogger" de Calculadora.java
	//algo que está presente em outro módulo
	
	//dependendecia transitiva é uma dependencia que será transmitida
	
	exports br.com.cod3r.app.calculo.interno to app.financeiro;
	//Com "exports to" é possivel determinar qual módulo pode receber outro determinado módulo
	
	requires app.api;//precisa implementar a interface calculadora
	//modulo da api requerido para ter acesso à interface
	
	//Além de requerer a API para usar a interface para implementar,
	//Dizemos que esse módulo prove uma implementação para essa interface "Calculadora", 
	//a partir da classe CalculadoraImpl
	provides br.com.cod3r.app.Calculadora with CalculadoraImpl;
	//isso significa que em app-financeiro, não precisa existir uma dependencia para app-calculo,
	//pois isso será um dependencia difreta da implementação
	
}