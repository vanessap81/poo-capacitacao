package exercicio04;

public class Televisao implements Eletrodomestico{

    private boolean status;

    Televisao(boolean estaLigada) {
        this.status = estaLigada;
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
        System.out.println("Status da Televisão: " + isStatus());
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public boolean isStatus() {
        return status;
    }
}
