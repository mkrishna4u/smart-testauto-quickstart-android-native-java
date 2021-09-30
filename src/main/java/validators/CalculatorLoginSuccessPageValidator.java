package validators;

import org.uitnet.testing.smartfwk.ui.core.appdriver.SmartAppDriver;
import org.uitnet.testing.smartfwk.ui.core.objects.logon.LoginSuccessPageValidator;

import page_objects.CalculatorPO;

/**
 * 
 * @author Ajita Krishna
 *
 */
public class CalculatorLoginSuccessPageValidator extends LoginSuccessPageValidator {

	public CalculatorLoginSuccessPageValidator() {
		super(null, null);
	}

	@Override
	public void setInitParams(SmartAppDriver appDriver) {
		this.appDriver = appDriver;

	}

	@Override
	protected void tryLogout(String activeUserProfileName) {
		// nothing needed
	}

	@Override
	protected void validateInfo(String activeUserProfileName) {
		CalculatorPO.Button_MoreOptions.getValidator(appDriver, null).validateVisible(5);
	}

	@Override
	protected boolean checkLoginSuccessPageVisible(String activeUserProfileName) {
		return CalculatorPO.Button_MoreOptions.getValidator(appDriver, null).isVisible(2);
	}
}
