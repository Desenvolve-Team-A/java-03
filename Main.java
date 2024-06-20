import java.util.List;
import java.util.Scanner;
import java.util.InputMismatchException;

public class Main {
  public static void main(String[] args) {
    Interface ui = new Interface();
    Scanner scanner = new Scanner(System.in);

    while (true) {
      ui.menu();
      int option = -1;
      boolean validate = false;

      while (!validate) {
        try {
          System.out.print("|| DIGITE SUA OPCAO: ");
          option = scanner.nextInt();
          if (option == 1 || option == 2) {
            validate = true;
          } else {
            System.out.println("Opção inválida. Tente novamente.");
          }
        } catch (InputMismatchException e) {
          System.out.println("Entrada inválida. Por favor, digite um número.");
          scanner.next();
        }
      }

      if (option == 1) {
        List<Question> listQuestions = QuestionRepository.getQuestions();

        Quiz quiz = new Quiz(listQuestions, ui);
        quiz.iniciar();
      } else if (option == 2) {
        ui.printSpace();
        ui.out();
        ui.printSpace();
        break;
      }
    }
  }
}