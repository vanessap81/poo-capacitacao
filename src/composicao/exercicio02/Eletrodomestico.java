package composicao.exercicio02;

public class Eletrodomestico {
    private Produto produto;
    private Especificacao especificacao;
    private boolean estaLigado;

    Eletrodomestico(Produto produto, Especificacao especificacao, boolean estaLigado) {
        this.produto = produto;
        this. especificacao = especificacao;
        this.estaLigado = estaLigado;
    }

    public Produto getProduto() {
        return produto;
    }

    public Especificacao getEspecificacao() {
        return especificacao;
    }

    public void setEstaLigado(boolean estaLigado){
        this.estaLigado = estaLigado;
    }

    public boolean getEstaLigado(){
        return estaLigado;
    }

    public void ligar() {
        setEstaLigado(true);
    }

    public void desligar(){
        setEstaLigado(false);
    }

}
