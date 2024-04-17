package CucumberDemo;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FindingTheLuckyNumber {

    private int randomNumber;
    private String answer;
    private static final int LUCKY_NUMBER = 3;

    @Given("a random number is generated {int}")
    public void generatingARandomNumber(int randomNumber) {
        this.randomNumber = randomNumber;
    }

    @When("I check if the generated number is the lucky number")
    public void iAskWeitherIFindTheLuckyNumber() {
        answer = (randomNumber == LUCKY_NUMBER) ? "Win" : "Lose";
    }

    @Then("I should be told {string}")
    public void iShouldBeTold(String expectedAnswer) {
        assertEquals(expectedAnswer, answer);
    }
}
