module app.financeiro {
	
	requires java.base;//unico módulo que já vem importado por padrão (não confundir módulo com pacote)
	requires app.calculo;//agora está definido que este modulo necessita de outro módulo chamado app.calculo
	
	
}