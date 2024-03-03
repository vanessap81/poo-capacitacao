package composicao.exercicio01;

public class Main {
    public static void main(String[] args) {

        Pessoa pessoa1 = new Pessoa("Claudio", 27, 1.89, 99);
        Pessoa crianca = new Pessoa("Enzo", 6, 1.02, 32);

        Professor novoProf = new Professor(pessoa1, "mestrado", "manhã", 5.600);
        Aluno novoAluno = new Aluno(crianca, "123456", 2);

        SalaDeAula sala12 = new SalaDeAula(novoProf, novoAluno);

        System.out.println(sala12.getProfessor().getFormacaoAcademica());

    }
}
