package exercicio04;

public class Lampada implements Eletrodomestico{

    private boolean status;


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
        System.out.println("Status da Lampada: " + isStatus());
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
