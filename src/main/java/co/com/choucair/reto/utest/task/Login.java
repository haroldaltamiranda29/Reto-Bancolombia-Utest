package co.com.choucair.reto.utest.task;

import co.com.choucair.reto.utest.model.FormDataUtest;
import co.com.choucair.reto.utest.userinterface.UtestData;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import java.util.List;

public class Login implements Task {

    List<FormDataUtest> formDataUtests;

    public Login(List<FormDataUtest> formDataUtests) {
        this.formDataUtests = formDataUtests;
    }

    public static Login thePage(List<FormDataUtest> formDataUtests) {
        return Tasks.instrumented(Login.class,formDataUtests);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(UtestData.LOGIN),
                Enter.theValue(formDataUtests.get(0).getEmailAddress()).into(UtestData.USER),
                Enter.theValue(formDataUtests.get(0).getPassword()).into(UtestData.CAMPO_PASSWORD),
                Click.on(UtestData.BOTON_LOGIN)
        );

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
