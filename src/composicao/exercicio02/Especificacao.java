package composicao.exercicio02;

public class Especificacao {

    private String nomeMarca;
    private String modelo;
    private int potência;
    private String descricao;

    public Especificacao(String nomeMarca, String modelo, int potencia, String descricao) {
        this.nomeMarca = nomeMarca;
        this.modelo = modelo;
        this.potência = potencia;
        this.descricao = descricao;
    }

    public String getNomeMarca() {
        return nomeMarca;
    }

    public void setNomeMarca(String nomeMarca) {
        this.nomeMarca = nomeMarca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getPotencia() {
        return potência;
    }

    public void setPotência(int potencia) {
        this.potência = potencia;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
