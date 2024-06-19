public class Interface{
	
	public void printLinha() {
		System.out.println("||::==----------------------------------------------------------==::||");
	}
	
	public void printPontilhado() {
		System.out.println("||..................................................................||");
	}
	
	public void menu() {
		System.out.println("||::==----------------------------------------------------------==::||");
		System.out.println("||::  		                                                  ::||");
		System.out.println("||  		=========  ==     ==  ========  ========            ||");
		System.out.println("||  		||     ||  ||     ||     ||          ||             ||");
		System.out.println("||  		||     ||  ||     ||     ||        ||               ||");
		System.out.println("||  		||   __||  ||     ||     ||      ||                 ||");
		System.out.println("||  		=====||==  =========  ========  ========            ||");
		System.out.println("||::  		                                                  ::||");
		System.out.println("||::==----------------------------------------------------------==::||");
		System.out.println("||                         [  1  ] JOGAR                            ||");
		printPontilhado();
		System.out.println("||                         [  2  ] SAIR                             ||");
		printLinha(); 
		System.out.println("|| DIGITE SUA OPCAO                                                 ||");
	}
	
	public void Pergunta() {
		System.out.println("|| PERGUNTA DIVÔNICA                                                ||");
	}

}