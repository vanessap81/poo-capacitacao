package composicao.exercicio03;

public class Conta {

    private Banco banco;
    private Agencia agencia;
    private Cliente cliente;
    private int numeroDaConta;
    private double SaldoDaConta;

    public Conta(Banco banco, Agencia agencia, Cliente cliente, int numeroDaConta, double saldoDaConta) {
        this.banco = banco;
        this.agencia = agencia;
        this.cliente = cliente;
        this.numeroDaConta = numeroDaConta;
        SaldoDaConta = saldoDaConta;
    }

    public Banco getBanco() {
        return banco;
    }

    public Agencia getAgencia() {
        return agencia;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public int getNumeroDaConta() {
        return numeroDaConta;
    }

    public double getSaldoDaConta() {
        return SaldoDaConta;
    }

    public void setBanco(Banco banco) {
        this.banco = banco;
    }

    public void setAgencia(Agencia agencia) {
        this.agencia = agencia;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
}
