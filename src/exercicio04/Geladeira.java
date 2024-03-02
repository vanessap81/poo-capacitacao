package exercicio04;

public class Geladeira implements Eletrodomestico{

    private boolean status;

    Geladeira(boolean status){
        this.status = status;
    }

    @Override
    public void ligar() {
        setStatus(true);
    }

    @Override
    public void desligar() {
        setStatus(false);
    }

    @Override
    public void verificarStatus() {
        System.out.println("Status da Geladeira: " + isStatus());
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
