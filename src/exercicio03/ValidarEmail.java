package exercicio03;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidarEmail implements Validavel {

    private String email;
    private boolean isValid;

    @Override
    public boolean validarDados(String email) {
        if (email != null && !email.isEmpty()) {
            String regex = "^[\\w\\.-]+@([\\w\\-]+\\.)+[A-Z]{2,4}$";
            Pattern padrao = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
            Matcher matcher = padrao.matcher(email);
            if (matcher.matches()) {
                isValid = true;
            }
        }
        return isValid;
    }
}

//validação de e-mail com regex não é 100% seguro, pois não é totalmente compliant com a especificação (RFC).
// Podem ocorrer falsos positivos e falsos negativos
// Outras opções: JavaMail API