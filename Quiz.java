import java.util.*;

public class Quiz {



    public void startQuiz() {
        Scanner scanner = new Scanner(System.in);
        int totalScore = 0;
        int numCorrectAnswers = 0;
        //int userAnswer;

        //loop para iterar sobre as perguntas selecionadas e as suas opções


        //condicional para pegar o peso das questões e somar
        if (userAnswer == currentQuestion.getCorrectOptionIndex() + 1) {
            int questionScore = currentQuestion.getWeight();
            totalScore += questionScore;
            numCorrectAnswers++;
            System.out.println("Acertou! Você ganhou " + questionScore + " pontos.\n");
        } else {
            System.out.println("Você errou!.\n");
        }

        scanner.close();
    }
}
