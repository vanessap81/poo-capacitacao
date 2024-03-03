package composicao.exercicio03;

public class Main {

    public static void main(String[] args) {

        Pessoa pessoa = new Pessoa("Ana Rosa", "23/01/2001", "Ana Maria Cruz", "José Augusto Cruz");
        Documento documento = new Documento("RG", "140569", "SSP/BA");
        Endereco residencia = new Endereco("Brasil", "Bahia", "Salvador", "Brotas", "Rua do cemitério", 63, "Ao lado do cemitério");
        Cliente cliente = new Cliente(pessoa, documento, residencia, "71 999890000", "Estudante", 750.8);

        Banco banco = new Banco(267, "Bradesco", "60.746.948/0001-12");
        Agencia agencia = new Agencia(1456, "Nome aleatório", "Rua dos Perdizes, 14");


        Conta novaConta = new Conta(banco, agencia, cliente, 1345, 750.8);

        novaConta.getCliente().setTelefoneDeContato("71 99899 0007");
        System.out.println(novaConta.getCliente().getTelefoneDeContato());

        System.out.println(novaConta.getAgencia().getNumeroDaAgencia());

        System.out.println(residencia.getRua());





    }
}
