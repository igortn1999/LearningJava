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
}