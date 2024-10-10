public class ProvaFafifo extends ProvaUniversidade {

    public ProvaFafifo(double notaAV1, double notaAV2) {
        super(notaAV1, notaAV2);
    }

    // Método para verificar se o aluno foi aprovado na Fafifo
    public String aprovado() {
        if(calcularMedia() >= 6.00){
            return "Aluno(a) aprovado(a). Média: " + calcularMedia();
        } else {
            return "Aluno(a) reprovado(a). Média: " + calcularMedia();
        }
    }
}
