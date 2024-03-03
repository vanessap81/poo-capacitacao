package exercicio06;

public class Main {

    public static void main(String[] args) {

        ContaCorrente minhaConta = new ContaCorrente();

        System.out.println(minhaConta.getSaldo());
        minhaConta.depositar(500.7);
        System.out.println(minhaConta.getSaldo());
        minhaConta.sacar(330.4);
        System.out.println(minhaConta.getSaldo());
        minhaConta.sacar(180);

        ContaPoupanca minhaReserva = new ContaPoupanca();

        System.out.println(minhaReserva.getSaldo());
        minhaReserva.depositar(300);
        System.out.println(minhaReserva.getSaldo());
        minhaReserva.sacar(350);

        minhaReserva.render(0.01);
        System.out.println(minhaReserva.getSaldo());
    }
}
