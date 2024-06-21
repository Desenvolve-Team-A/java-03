import java.util.List;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Interface ui = new Interface();
    Scanner scanner = new Scanner(System.in);

    while (true) {
      ui.menu();
      boolean validate = false;

      while (!validate) {
        System.out.print("|| DIGITE SUA OPCAO: \n");
        if (scanner.hasNextInt()) {
          int option = scanner.nextInt();
          if (option == 1 || option == 2) {
            validate = true;
            if (option == 1) {
              List<Question> listQuestions = QuestionRepository.getQuestions();
              Quiz quiz = new Quiz(listQuestions, ui);
              quiz.start();
            } else if (option == 2) {
              ui.printSpace();
              ui.out();
              ui.printSpace();
              System.exit(0);
            }
          } else {
            System.out.println("\nOpcao invalida. Tente novamente.");
          }
        } else {
          System.out.println("\nOpcao invalida. Tente novamente.");
          scanner.next();
        }
      }
    }
  }
}