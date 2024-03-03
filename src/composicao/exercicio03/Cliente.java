package composicao.exercicio03;

public class Cliente {

//    experimentei usar final para dados do banco
//    observar a implicação dessa marcação nos setters

    private String telefoneDeContato;
    private String profissao;
    private double rendaMensal;
    private Pessoa pessoa;
    private Documento documento;
    private Endereco endereco;


    public Cliente(Pessoa pessoa, Documento documento, Endereco endereco, String telefoneDeContato, String profissao, double rendaMensal) {
        this.pessoa = pessoa;
        this.documento = documento;
        this.endereco = endereco;
        this.telefoneDeContato = telefoneDeContato;
        this.profissao = profissao;
        this.rendaMensal = rendaMensal;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public Documento getDocumento() {
        return documento;
    }

    public void setDocumento(Documento documento) {
        this.documento = documento;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public String getTelefoneDeContato() {
        return telefoneDeContato;
    }

    public void setTelefoneDeContato(String telefoneDeContato) {
        this.telefoneDeContato = telefoneDeContato;
    }

    public String getProfissao() {
        return profissao;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }

    public double getRendaMensal() {
        return rendaMensal;
    }

    public void setRendaMensal(double rendaMensal) {
        this.rendaMensal = rendaMensal;
    }
}
