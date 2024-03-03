package exercicio05;

public class Main {
    public static void main(String[] args) {

        Soma soma = new Soma(7, 5.2);
        System.out.println(soma.realizarCalculo());

        Subtracao subtracao = new Subtracao(22, 14);
        System.out.println(subtracao.realizarCalculo());

        Multiplicacao multiplicar = new Multiplicacao(12, 47);
        System.out.println(multiplicar.realizarCalculo());

        Divisao dividir = new Divisao(265, 15);
        System.out.println(dividir.realizarCalculo());
    }
}
