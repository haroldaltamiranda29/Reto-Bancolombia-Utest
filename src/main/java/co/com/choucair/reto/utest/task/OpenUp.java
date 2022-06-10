package co.com.choucair.reto.utest.task;

import co.com.choucair.reto.utest.userinterface.UtestData;
import co.com.choucair.reto.utest.userinterface.UtestPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Open;

public class OpenUp implements Task {

    private UtestPage utestPage;
    public static OpenUp thePage() {
        return Tasks.instrumented(OpenUp.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Open.browserOn(utestPage),
                Click.on(UtestData.BOTON_JOIN_TODAY)
        );

    }
}
