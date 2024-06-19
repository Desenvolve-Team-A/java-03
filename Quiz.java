public class Quiz {



    public void começarQuiz() {
        int totalPontos = 0;
        int respostasCorretas = 0;

        //loop para iterar sobre as perguntas selecionadas e as suas opções


        //condicional para pegar o peso das questões e somar
        if (resposta == respostaCerta) {
            int pontos = perguntaAtual.peso;
            totalPontos += pontos;
            respostasCorretas++;
            System.out.println("Acertou! Você ganhou " + pontos + " pontos.\n");
        } else {
            System.out.println("Você errou!.\n");
        }
        scanner.close();
    }
}
