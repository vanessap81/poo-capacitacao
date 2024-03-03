package exercicio06;

public class ContaPoupanca implements TransacaoBancaria {

    private double saldo;

    ContaPoupanca(){

    };

    public void render(double juros){
        saldo += (saldo * juros);
    }

    @Override
    public void depositar(double valor) {
        saldo =+ valor;
    }

    @Override
    public void sacar(double valor) {
        if (saldo < valor)
            System.out.println("Saldo indisponível");
         else
            saldo -= valor;

    }

    @Override
    public double getSaldo() {
        return saldo;
    }
}
