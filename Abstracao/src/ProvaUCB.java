public class ProvaUCB extends ProvaUniversidade {

    public ProvaUCB(double notaAV1, double notaAV2) {
        super(notaAV1, notaAV2);
    }

    // Método para verificar se o aluno foi aprovado na UCB
    public String aprovado() {
        if(calcularMedia() >= 7.00){
            return "Aluno(a) aprovado(a). Média: " + calcularMedia();
        } else {
            return "Aluno(a) reprovado(a). Média: " + calcularMedia();
        }
    }
}
