package stepdefs.features.ui.home;

import org.testng.Assert;
import org.uitnet.testing.smartfwk.ui.core.DefaultAppConnector;
import org.uitnet.testing.smartfwk.ui.core.SmartAppConnector;
import org.uitnet.testing.smartfwk.ui.core.appdriver.SmartAppDriver;
import org.uitnet.testing.smartfwk.ui.core.objects.validator.mechanisms.TextMatchMechanism;

import global.AppConstants;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page_objects.CalculatorPO;

/**
 * 
 * @author Ajita Krishna
 *
 */
public class CalculatorStepDefs {
	private DefaultAppConnector appConnector;
	private Scenario runningScenario;
	private SmartAppDriver appDriver;

	/**
	 * Constructor
	 */
	public CalculatorStepDefs() {
		appConnector = SmartAppConnector.connect(AppConstants.APP_NAME);		
	}

	@Before
	public void beforeScenario(Scenario scenario) {
		runningScenario = scenario;
		appConnector.captureScreenshot(runningScenario, "scenario-started");
	}

	@After
	public void afterScenario(Scenario scenario) {
		appConnector.captureScreenshot(scenario, "scenario-" + scenario.getStatus());
	}
	
	@Given("Calculator is already opened.")
	public void calculator_is_already_opened() {
		appDriver = appConnector.setActiveUserProfileName("StandardUserProfile");
	}
	
	@When("User clicks on {int} {string} {int} = buttons.")
	public void user_clicks_on_operator_buttons(Integer num1, String operator, Integer num2) {
		String num1Str = "" + num1;
		String num2Str = "" + num2;
		for(int i = 0; i < num1Str.length(); i++) {
			clickDigitButton(num1Str.charAt(i));
		}
		
		clickOperatorButton(operator);
		
		for(int i = 0; i < num2Str.length(); i++) {
			clickDigitButton(num2Str.charAt(i));
		}
		
		CalculatorPO.Button_Equals.getValidator(appDriver, null).click(1);
	}
	@Then("The {int} is displayed on result textbox.")
	public void the_is_displayed_on_result_textbox(Integer result) {
		CalculatorPO.Textbox_CalculatorResults.getValidator(appDriver, null)
			.validateValue("" + result, TextMatchMechanism.containsExpectedValue, 1);
		CalculatorPO.Button_Clear.getValidator(appDriver, null).click(1);
	}
	
	private void clickDigitButton(char digit) {
		switch(digit) {
		case '0':
			CalculatorPO.Button_0.getValidator(appDriver, null).click(1);
			break;
		case '1':
			CalculatorPO.Button_1.getValidator(appDriver, null).click(1);
			break;
		case '2':
			CalculatorPO.Button_2.getValidator(appDriver, null).click(1);
			break;
		case '3':
			CalculatorPO.Button_3.getValidator(appDriver, null).click(1);
			break;
		case '4':
			CalculatorPO.Button_4.getValidator(appDriver, null).click(1);
			break;
		case '5':
			CalculatorPO.Button_5.getValidator(appDriver, null).click(1);
			break;
		case '6':
			CalculatorPO.Button_6.getValidator(appDriver, null).click(1);
			break;
		case '7':
			CalculatorPO.Button_7.getValidator(appDriver, null).click(1);
			break;
		case '8':
			CalculatorPO.Button_8.getValidator(appDriver, null).click(1);
			break;
		case '9':
			CalculatorPO.Button_9.getValidator(appDriver, null).click(1);
			break;
		default:
			Assert.fail("Invalid numeric digit '" + digit + "'.");
		}
	}
	
	private void clickOperatorButton(String operator) {
		switch(operator) {
		case "+":
			CalculatorPO.Button_Plus.getValidator(appDriver, null).click(1);
			break;
		case "-":
			CalculatorPO.Button_Minus.getValidator(appDriver, null).click(1);
			break;
		case "*":
			CalculatorPO.Button_Multiply.getValidator(appDriver, null).click(1);
			break;
		case "/":
			CalculatorPO.Button_Divide.getValidator(appDriver, null).click(1);
			break;
		default:
			Assert.fail("Operator '" + operator + "' is not supported.");	
		}
	}
}
