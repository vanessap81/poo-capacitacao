package exercicio03;

public class Main {
    public static void main(String[] args) {

        String email = "vanessaemail.com";

        ValidarEmail validar = new ValidarEmail();

        if(validar.validarDados(email))
            System.out.println("Email válido");
        else
            System.out.println("Email inválido");

    }
}
