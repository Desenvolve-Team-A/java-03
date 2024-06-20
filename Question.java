public class Question {
  private String questions;
  private String[] answers;
  private int rightAnswer;

  public Question(String questions, String[] answers, int rightAnswer) {
    this.questions = questions;
    this.answers = answers;
    this.rightAnswer = rightAnswer;
  }

  public String getQuestion() {
    return questions;
  }

  public String[] getAnswer() {
    return answers;
  }

  public boolean checkAnswer(int answers) {
    return answers == rightAnswer;
  }
}