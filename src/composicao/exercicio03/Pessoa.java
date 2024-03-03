package composicao.exercicio03;

public class Pessoa {

    private final String nome;
    private final String dataDeNascimento;
    private final String nomeDaMae;
    private final String nomeDoPai;

    public Pessoa(String nome, String dataDeNascimento, String nomeDaMae, String nomeDoPai) {
        this.nome = nome;
        this.dataDeNascimento = dataDeNascimento;
        this.nomeDaMae = nomeDaMae;
        this.nomeDoPai = nomeDoPai;
    }

    public String getNome() {
        return nome;
    }

    public String getDataDeNascimento() {
        return dataDeNascimento;
    }

    public String getNomeDaMae() {
        return nomeDaMae;
    }

    public String getNomeDoPai() {
        return nomeDoPai;
    }
}
