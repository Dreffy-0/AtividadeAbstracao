public class Main {
    public static void main(String[] args) {
        // Criando um objeto do tipo ProvaUCB
        ProvaUCB alunoUCB = new ProvaUCB(8.0, 7.0);
        System.out.println("Aluno UCB: " + alunoUCB.aprovado());

        // Criando um objeto do tipo ProvaFafifo
        ProvaFafifo alunoFafifo = new ProvaFafifo(5.5, 6.5);
        System.out.println("Aluno Fafifo: " + alunoFafifo.aprovado());
    }
}
