package composicao.exercicio02;

public class Main {
    public static void main(String[] args) {

        Produto produto = new Produto("Liquidificador turbo", 109.9, 3456);
        Especificacao especificacaoLiquidificador = new Especificacao("Turbo Juice", "Red", 220, "Novo");

        Eletrodomestico liquidificador = new Eletrodomestico(produto, especificacaoLiquidificador, false);

        System.out.println(liquidificador.getProduto().getValorProduto());
        System.out.println(liquidificador.getEspecificacao().getPotencia());

    }
}
