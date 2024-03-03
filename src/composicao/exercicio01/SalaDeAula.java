package composicao.exercicio01;

public class SalaDeAula {

    private Professor professor;
    private Aluno aluno;

    SalaDeAula(Professor professor, Aluno aluno){
        this.professor = professor;
        this.aluno = aluno;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }
}
