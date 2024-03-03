package composicao.exercicio01;

public class Professor {

    private Pessoa pessoa;
    private String formacaoAcademica;
    private String periodoDeTrabalho;
    private double salario;

    public Professor(Pessoa pessoa, String formacaoAcademica, String periodoDeTrabalho, double salario) {
        this.pessoa = pessoa;
        this.formacaoAcademica = formacaoAcademica;
        this.periodoDeTrabalho = periodoDeTrabalho;
        this.salario = salario;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public String getFormacaoAcademica() {
        return formacaoAcademica;
    }

    public void setFormacaoAcademica(String formacaoAcademica) {
        this.formacaoAcademica = formacaoAcademica;
    }

    public String getPeriodoDeTrabalho() {
        return periodoDeTrabalho;
    }

    public void setPeriodoDeTrabalho(String periodoDeTrabalho) {
        this.periodoDeTrabalho = periodoDeTrabalho;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
