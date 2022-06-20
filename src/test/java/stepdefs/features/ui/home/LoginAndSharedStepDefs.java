package stepdefs.features.ui.home;

import org.uitnet.testing.smartfwk.ui.core.SmartCucumberUiScenarioContext;

import global.AppConstants;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;

/**
 * This class contains the login steps and the shared steps that can be used in
 * all the scenarios defined in cucumber feature file.
 * 
 * @author Ajita Krishna
 *
 */
public class LoginAndSharedStepDefs {
	private SmartCucumberUiScenarioContext scenarioContext;

	public LoginAndSharedStepDefs(SmartCucumberUiScenarioContext scenarioContext) {
		this.scenarioContext = scenarioContext;
	}

	@Before
	public void beforeScenario(Scenario scenario) {
		scenarioContext.setScenario(scenario);
		scenarioContext.captureScreenshot();
	}

	@After
	public void afterScenario(Scenario scenario) {
		scenarioContext.captureScreenshot();
		scenarioContext.close();
	}

	@Given("Calculator is already opened.")
	public void calculator_is_already_opened() {
		scenarioContext.setActiveUserProfile(AppConstants.APP_NAME, "StandardUserProfile");
	}
}
