package hellocucumber;

import io.cucumber.java.en.*;

import org.junit.jupiter.api.Assertions.*;

public class StepDefinitions {

    @Given("an example {string}")
    public void anExampleScenario(String param1) {
        param1 = "<parametre1>";
        System.out.println("petitchat");
    }

    @When("all step definitions are {string}")
    public void allStepDefinitionsAreImplemented(String param2) {
        param2 = "<parametre2>";
        System.out.println("petitchat");
    }

    @Then("the scenario {string}")
    public void theScenarioPasses(String param3) {
        param3 = "<parametre2>";
        System.out.println("petitchat");
    }

}

 