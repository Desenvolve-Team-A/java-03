import java.util.Arrays;
import java.util.List;

public class QuestionRepository {
  public static List<Question> getQuestions() {
    return Arrays.asList(
        new Question("Qual a capital da França?", new String[] { "Paris", "Londres", "Roma", "Berlim" }, 0),
        new Question("Quem pintou a Mona Lisa?",
            new String[] { "Michelangelo", "Leonardo da Vinci", "Raphael", "Donatello" }, 1),
        new Question("Qual é o maior planeta do nosso sistema solar?",
            new String[] { "Terra", "Marte", "Júpiter", "Saturno" }, 2),
        new Question("Em que ano o homem pisou na Lua pela primeira vez?",
            new String[] { "1965", "1969", "1971", "1975" }, 1),
        new Question("Quem escreveu 'Dom Casmurro'?",
            new String[] { "Machado de Assis", "José de Alencar", "Graciliano Ramos", "Jorge Amado" }, 0),
        new Question("Qual é a fórmula química da água?", new String[] { "H2O", "CO2", "O2", "H2SO4" }, 0),
        new Question("Quantos estados tem o Brasil?", new String[] { "24", "25", "26", "27" }, 2),
        new Question("Quem descobriu o Brasil?",
            new String[] { "Pedro Álvares Cabral", "Cristóvão Colombo", "Américo Vespúcio", "Vasco da Gama" }, 0),
        new Question("Qual é o menor país do mundo?", new String[] { "Mônaco", "Vaticano", "Malta", "San Marino" }, 1),
        new Question("Qual é a moeda do Japão?", new String[] { "Yuan", "Won", "Iene", "Dólar" }, 2),
        new Question("Qual é o símbolo químico do ouro?", new String[] { "Au", "Ag", "O", "G" }, 0),
        new Question("Qual é a língua oficial do Brasil?",
            new String[] { "Inglês", "Português", "Espanhol", "Francês" }, 1),
        new Question("Quantos continentes existem no mundo?", new String[] { "5", "6", "7", "8" }, 2),
        new Question("Qual é o maior oceano do mundo?", new String[] { "Atlântico", "Pacífico", "Índico", "Ártico" },
            1),
        new Question("Quem é o autor de 'Harry Potter'?",
            new String[] { "J.R.R. Tolkien", "George R.R. Martin", "J.K. Rowling", "Stephen King" }, 2),
        new Question("Qual é a montanha mais alta do mundo?",
            new String[] { "K2", "Everest", "Kangchenjunga", "Lhotse" }, 1),
        new Question("Qual é o rio mais longo do mundo?", new String[] { "Nilo", "Amazonas", "Yangtze", "Mississippi" },
            1),
        new Question("Quem pintou o teto da Capela Sistina?",
            new String[] { "Raphael", "Donatello", "Leonardo da Vinci", "Michelangelo" }, 3),
        new Question("Qual é o maior mamífero do mundo?",
            new String[] { "Elefante", "Baleia Azul", "Rinoceronte", "Hipopótamo" }, 1),
        new Question("Quem foi o primeiro presidente do Brasil?",
            new String[] { "Getúlio Vargas", "Juscelino Kubitschek", "Deodoro da Fonseca", "Marechal Floriano" }, 2));
  }
}