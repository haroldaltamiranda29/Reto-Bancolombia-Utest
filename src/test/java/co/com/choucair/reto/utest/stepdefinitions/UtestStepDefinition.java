package co.com.choucair.reto.utest.stepdefinitions;

import co.com.choucair.reto.utest.model.FormDataUtest;
import co.com.choucair.reto.utest.question.Verify;
import co.com.choucair.reto.utest.task.*;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;

public class UtestStepDefinition {

    @Before
    public void setStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^I am on the utest page and I click on the Join Today button$")
    public void iAmOnTheUtestPageAndIClickOnTheJoinTodayButton() {
        OnStage.theActorCalled("Harold").wasAbleTo(OpenUp.thePage());

    }


    @When("^Complete the registration forms with my data$")
    public void completeTheRegistrationFormsWithMyData(List<FormDataUtest> formDataUtests) {
        OnStage.theActorInTheSpotlight().attemptsTo(Fill.form(formDataUtests), Fill2.form2(formDataUtests), Fill3.form3(), Fill4.form4(formDataUtests), Login.thePage(formDataUtests));

    }

    @Then("^I verify that when entering with the new user I get a button with the following message \"([^\"]*)\"$")
    public void iVerifyThatWhenEnteringWithTheNewUserIGetAButtonWithTheFollowingMessage(String mensaje, List<FormDataUtest> formDataUtests) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Verify.message(mensaje)));

    }

}
