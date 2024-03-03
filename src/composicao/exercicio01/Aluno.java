package composicao.exercicio01;

public class Aluno {

    private Pessoa pessoa;
    private String matricula;
    private int serieEscolar;

    public Aluno(Pessoa pessoa, String matricula, int serieEscolar) {
        this.pessoa = pessoa;
        this.matricula = matricula;
        this.serieEscolar = serieEscolar;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public int getSerieEscolar() {
        return serieEscolar;
    }

    public void setSerieEscolar(int serieEscolar) {
        this.serieEscolar = serieEscolar;
    }
}
