package composicao.exercicio03;

public class Agencia {

    private int numeroDaAgencia;
    private String  nomeDaAgencia;
    private String endereco;

    public Agencia(int numeroDaAgencia, String nomeDaAgencia, String endereco) {
        this.numeroDaAgencia = numeroDaAgencia;
        this.nomeDaAgencia = nomeDaAgencia;
        this.endereco = endereco;
    }

    public int getNumeroDaAgencia() {
        return numeroDaAgencia;
    }

    public void setNumeroDaAgencia(int numeroDaAgencia) {
        this.numeroDaAgencia = numeroDaAgencia;
    }

    public String getNomeDaAgencia() {
        return nomeDaAgencia;
    }

    public void setNomeDaAgencia(String nomeDaAgencia) {
        this.nomeDaAgencia = nomeDaAgencia;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
}
