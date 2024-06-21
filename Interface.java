public class Interface {

  public void printLine() {
    System.out.println("||::==----------------------------------------------------------==::||");
  }

  public void printDot() {
    System.out.println("||..................................................................||");
  }

  public void printSpace() {
    System.out.println(" ");
  }

  public void out() {
    printDot();
    System.out.println("||                       VOCE SAIU DO PROGRAMA                      ||");
    printDot();
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
    printDot();
    System.out.println("||                         [  2  ] SAIR                             ||");
    printLine();
  }

  public void lineQuestion() {
    printSpace();
    System.out.println("|| PERGUNTA DIVONICA                                                ||\n");
  }

}