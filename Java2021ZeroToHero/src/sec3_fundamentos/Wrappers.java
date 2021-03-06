package sec3_fundamentos;

public class Wrappers {

	public static void main(String[] args) {
		//tudo em java é objeto, exceto os tipos primitivos
		
		//Wrappers são a versão objeto dos tipos primitovos 
		
		
		Byte b = 1; //wrapper to tipo primitivo "byte"
		Short s = 100; //wrapper to tipo primitivo "short"
		Integer i = Integer.parseInt("1000"); //wrapper to tipo primitivo "int"
		Long l = 100000L; //wrapper to tipo primitivo "long"
		
		System.out.println(b.byteValue());
		System.out.println(s.toString());
		System.out.println(i);
		System.out.println(l/3.0);
		
		Boolean bo = Boolean.parseBoolean("true");
		System.out.println(bo);
		System.out.println(bo.toString().toUpperCase());
	}

}
