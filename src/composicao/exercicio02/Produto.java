package composicao.exercicio02;

public class Produto {

    private String nomeProduto;
    private double valorProduto;
    private int codigoProduto;

    public Produto(String nomeProduto, double valorProduto, int codigoProduto) {
        this.nomeProduto = nomeProduto;
        this.valorProduto = valorProduto;
        this.codigoProduto = codigoProduto;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public double getValorProduto() {
        return valorProduto;
    }

    public int getCodigoProduto() {
        return codigoProduto;
    }

    public void setValorProduto(double valorProduto) {
        this.valorProduto = valorProduto;
    }

}
