package exercicio05;

public class Soma implements OperacaoMatematica {

    private double valor1;
    private double valor2;
    private double resultado;

    Soma(double valor1, double valor2){
        this.valor1 = valor1;
        this.valor2 = valor2;

    }

    @Override
    public double realizarCalculo() {
        resultado = valor1 + valor2;
        return resultado;
    }
}
