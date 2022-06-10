package co.com.choucair.reto.utest.task;

import co.com.choucair.reto.utest.model.FormDataUtest;
import co.com.choucair.reto.utest.userinterface.UtestData;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import java.util.List;

public class Fill implements Task {

    List<FormDataUtest> formDataUtests;

    public Fill(List<FormDataUtest> formDataUtests) {
        this.formDataUtests = formDataUtests;
    }

    public static Fill form(List<FormDataUtest> formDataUtests) {
        return Tasks.instrumented(Fill.class,formDataUtests);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(formDataUtests.get(0).getFisrtName()).into(UtestData.FIRST_NAME),
                Enter.theValue(formDataUtests.get(0).getLastName()).into(UtestData.LAST_NAME),
                Enter.theValue(formDataUtests.get(0).getEmailAddress()).into(UtestData.EMAIL_ADDRESS),
                Click.on(UtestData.OPCION_MONTH),
                Click.on(UtestData.MONTH),
                Click.on(UtestData.OPCION_DAY),
                Click.on(UtestData.DAY),
                Click.on(UtestData.OPCION_YEAR),
                Click.on(UtestData.YEAR),
                Click.on(UtestData.NEXT_LOCATION)
        );
    }
}
