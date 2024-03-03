package composicao.exercicio03;

public class Banco {

//    experimentei usar final para dados do banco
//    analisar essa possibilidade

    private final int numeroDoBanco;
    private final String nomeDoBanco;
    private final String cnpj;

    public Banco(int numeroDoBanco, String nomeDoBanco, String cnpj) {
        this.numeroDoBanco = numeroDoBanco;
        this.nomeDoBanco = nomeDoBanco;
        this.cnpj = cnpj;
    }

    public int getNumeroDoBanco() {
        return numeroDoBanco;
    }

    public String getNomeDoBanco() {
        return nomeDoBanco;
    }

    public String getCnpj() {
        return cnpj;
    }


}
