package co.com.choucair.reto.utest.task;

import co.com.choucair.reto.utest.userinterface.UtestData;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class Fill3 implements Task {
    public static Fill3 form3() {
        return Tasks.instrumented(Fill3.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(UtestData.OPCION_COMPUTER),
                Click.on(UtestData.YOUR_COMPUTER),
                Click.on(UtestData.OPCION_VERSION),
                Click.on(UtestData.VERSION),
                Click.on(UtestData.OPCION_LENGUAGE),
                Click.on(UtestData.LENGUAGE),
                Click.on(UtestData.OPCION_MOVIL),
                Click.on(UtestData.YOUR_MOBILE_DEVICE),
                Click.on(UtestData.OPCION_MODEL),
                Click.on(UtestData.MODEL),
                Click.on(UtestData.OPCION_OPERATING_SYSTEM),
                Click.on(UtestData.OPERATING_SYSTEM),
                Click.on(UtestData.NEXT_LAST_STEP)
        );
    }
}
