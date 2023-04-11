package hellocucumber;

import io.cucumber.java.en.*;

import org.junit.jupiter.api.Assertions.*;

public class StepDefinitions {

    @Given("an example scenario")
    public void anExampleScenario() {
        System.out.println("petitchat");
    }

    @When("all step definitions are implemented")
    public void allStepDefinitionsAreImplemented() {
        System.out.println("petitchat");
    }

    @Then("the scenario passes")
    public void theScenarioPasses() {
        System.out.println("petitchat");
    }

    @Given("an example scenario 2")
    public void anExampleScenario2() {
        System.out.println("petitchien");
    }

    @When("all step definitions are implemented 2")
    public void allStepDefinitionsAreImplemented2() {
        System.out.println("petitchien");
    }

    @Then("the scenario passes 2")
    public void theScenarioPasses2() {
        System.out.println("petitchien");
    }

}
