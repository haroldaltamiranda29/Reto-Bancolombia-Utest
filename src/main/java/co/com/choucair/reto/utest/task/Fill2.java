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

public class Fill2 implements Task {

    List<FormDataUtest> formDataUtests;

    public Fill2(List<FormDataUtest> formDataUtests) {
        this.formDataUtests = formDataUtests;
    }

    public static Fill2 form2(List<FormDataUtest> formDataUtests) {
        return Tasks.instrumented(Fill2.class,formDataUtests);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(formDataUtests.get(0).getCity()).into(UtestData.CITY),
                Enter.theValue(formDataUtests.get(0).getPostalCode()).into(UtestData.POSTAL_CODE),
                Click.on(UtestData.OPCION_COUNRTY),
                Click.on(UtestData.COUNTRY),
                Click.on(UtestData.NEXT_DEVICES)
        );
    }
}
