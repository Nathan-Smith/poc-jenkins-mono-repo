package bdd.stepdefinitions

import bdd.addition.Calculator
import bdd.addition.EnterOnTheKeypad
import bdd.navigation.NavigateTo
import io.cucumber.java.en.Given
import io.cucumber.java.en.Then
import io.cucumber.java.en.When
import net.serenitybdd.screenplay.Actor
import net.serenitybdd.screenplay.ensure.that

class AdditionStepDefinitions {
  @Given("{actor} is doing math")
  fun `doing math`(actor: Actor) {
    actor.wasAbleTo(NavigateTo.theCalculatorPage)
  }

  @When("{actor} enters 2 on the keypad")
  fun `enters 2`(actor: Actor) {
    actor.attemptsTo(
      EnterOnTheKeypad.the2Button
    )
  }

  @Then("{actor} should see {string} appear as the result")
  fun `should see result of`(actor: Actor, result: String) {
    actor.attemptsTo(
      that(Calculator.RESULT).hasText(result)
    )
  }

  @When("{actor} enters add on the keypad")
  fun `enters add`(actor: Actor) {
    actor.attemptsTo(
      EnterOnTheKeypad.theAddButton
    )
  }

  @When("{actor} enters 4 on the keypad")
  fun `enters 4`(actor: Actor) {
    actor.attemptsTo(
      EnterOnTheKeypad.the4Button
    )
  }
}