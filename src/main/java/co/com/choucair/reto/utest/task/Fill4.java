package co.com.choucair.reto.utest.task;

import co.com.choucair.reto.utest.model.FormDataUtest;
import co.com.choucair.reto.utest.userinterface.UtestData;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import java.util.List;

public class Fill4 implements Task {

    List<FormDataUtest> formDataUtests;

    public Fill4(List<FormDataUtest> formDataUtests) {
        this.formDataUtests = formDataUtests;
    }

    public static Fill4 form4(List<FormDataUtest> formDataUtests) {
        return Tasks.instrumented(Fill4.class,formDataUtests);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(formDataUtests.get(0).getPassword()).into(UtestData.PASSWORD),
                Enter.theValue(formDataUtests.get(0).getConfirmPassword()).into(UtestData.CONFIRM_PASSWORD),
                Click.on(UtestData.CHECK_TERM_USE),
                Click.on(UtestData.CHECK_PRIVACY_SECURITY),
                Click.on(UtestData.BOTON_COMPLETE_SETUP)
        );
    }
}
