package co.com.choucair.reto.utest.question;

import co.com.choucair.reto.utest.userinterface.UtestData;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class Verify implements Question<Boolean> {
    private String mensaje;

    public Verify(String mensaje) {
        this.mensaje = mensaje;
    }

    public static Verify message(String mensaje) {
        return new Verify(mensaje);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        boolean result;
        String texto = Text.of(UtestData.MENSAJE).viewedBy(actor).asString();
        if (texto.equals(mensaje)){
            result = true;
        }else {
            result = false;
        }
        return null;
    }
}
