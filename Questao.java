public class Questao {

    private String pergunta;
    private String[] respostas;
    private int respostaCerta;

    public Questao(String pergunta, String[] respostas, int respostaCerta) {
        this.pergunta = pergunta;
        this.respostas = respostas;
        this.respostaCerta = respostaCerta;
    }

    public String getPergunta() {
        return pergunta;
    }

    public void setPergunta(String pergunta) {
        this.pergunta = pergunta;
    }

    public String[] getRespostas() {
        return respostas;
    }

    public void setRespostas(String[] respostas) {
        this.respostas = respostas;
    }

    public int getRespostaCerta() {
        return respostaCerta;
    }

    public void setRespostaCerta(int respostaCerta) {
        this.respostaCerta = respostaCerta;
    }

}
