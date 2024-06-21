import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.InputMismatchException;

public class Quiz {
  private List<Question> questions;
  private int score;
  private int correct;
  private Interface ui;

  public Quiz(List<Question> questions, Interface ui) {
    this.questions = new ArrayList<>(questions);
    this.score = 0;
    this.correct = 0;
    this.ui = ui;
  }

  public void start() {
    Scanner scanner = new Scanner(System.in);
    Collections.shuffle(questions);

    int numberQuestions = Math.min(questions.size(), 5);
    List<Question> selectedQuestions = questions.subList(0, numberQuestions);

    for (int i = 0; i < selectedQuestions.size(); i++) {
      Question ask = selectedQuestions.get(i);
      ui.lineQuestion();
      System.out.println((i + 1) + "- " + ask.getQuestion() + " Pontuacao: " + score);

      String[] answers = ask.getAnswer();
      for (int j = 0; j < answers.length; j++) {
        System.out.println((j + 1) + ": " + answers[j]);
      }

      int thisAnswer = -1;
      boolean checkAnswer = false;

      while (!checkAnswer) {
        System.out.print("Sua resposta (1-4): ");
        if (scanner.hasNextInt()) {
          thisAnswer = scanner.nextInt() - 1; // Menos 1 porque o array começa em 0;
          if (thisAnswer < 0 || thisAnswer > 3) {
            System.out.println("Resposta invalida. Por favor, digite um numero entre 1 e 4.");
          } else {
            checkAnswer = true;
          }
        } else {
          System.out.println("Resposta invalida. Por favor, digite um numero entre 1 e 4.");
          scanner.next();
        }
      }

      if (ask.checkAnswer(thisAnswer)) {
        System.out.println("Acertou! Voce ganhou " + score + " pontos.");
        correct++;
        score += (i + 1);
      } else {
        System.out.println("Você errou!");
      }
    }

    ui.printDot();
    System.out.println("|| Voce acertou " + correct + " perguntas.");
    System.out.println("|| Sua pontuacao final é de: " + score);
    ui.printDot();
    ui.printSpace();

  }
}