package exercicio04;

public class Main {
    public static void main(String[] args) {

        Geladeira minhaGeladeira = new Geladeira(false);

        minhaGeladeira.verificarStatus();
        minhaGeladeira.ligar();
        minhaGeladeira.verificarStatus();
        minhaGeladeira.desligar();
        minhaGeladeira.verificarStatus();

        Televisao minhaTv = new Televisao(false);
        minhaTv.verificarStatus();

        minhaTv.ligar();
        minhaTv.verificarStatus();

        minhaTv.desligar();
        minhaTv.verificarStatus();

        Lampada minhaLampada = new Lampada();
        minhaLampada.verificarStatus();

        minhaLampada.ligar();
        minhaLampada.verificarStatus();

        minhaLampada.desligar();
        minhaLampada.verificarStatus();

    }
}
