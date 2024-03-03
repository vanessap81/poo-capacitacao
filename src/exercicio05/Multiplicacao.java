package exercicio05;

public class Multiplicacao implements OperacaoMatematica {

    private double valor1;
    private double valor2;

    Multiplicacao(double valor1, double valor2){
        this.valor1 = valor1;
        this.valor2 = valor2;

    }


    @Override
    public double realizarCalculo() {
        return valor1 * valor2;
    }
}
