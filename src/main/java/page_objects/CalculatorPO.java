package page_objects;

import org.uitnet.testing.smartfwk.ui.core.commons.LocateBy;
import org.uitnet.testing.smartfwk.ui.core.config.PlatformType;
import org.uitnet.testing.smartfwk.ui.standard.domobj.ButtonSD;
import org.uitnet.testing.smartfwk.ui.standard.domobj.LabelSD;

/**
 * 
 * @author Ajita Krishna
 *
 */
public interface CalculatorPO {
	ButtonSD Button_MoreOptions = new ButtonSD("More Options")
			.addPlatformLocatorForNativeApp(PlatformType.android_mobile, LocateBy.AccessibilityId, "More options");
	
	ButtonSD Button_0 = new ButtonSD("0")
			.addPlatformLocatorForNativeApp(PlatformType.android_mobile, LocateBy.Id, "com.android.calculator2:id/digit_0");
	ButtonSD Button_1 = new ButtonSD("1")
			.addPlatformLocatorForNativeApp(PlatformType.android_mobile, LocateBy.Id, "com.android.calculator2:id/digit_1");
	ButtonSD Button_2 = new ButtonSD("2")
			.addPlatformLocatorForNativeApp(PlatformType.android_mobile, LocateBy.Id, "com.android.calculator2:id/digit_2");
	ButtonSD Button_3 = new ButtonSD("3")
			.addPlatformLocatorForNativeApp(PlatformType.android_mobile, LocateBy.Id, "com.android.calculator2:id/digit_3");
	ButtonSD Button_4 = new ButtonSD("4")
			.addPlatformLocatorForNativeApp(PlatformType.android_mobile, LocateBy.Id, "com.android.calculator2:id/digit_4");
	ButtonSD Button_5 = new ButtonSD("5")
			.addPlatformLocatorForNativeApp(PlatformType.android_mobile, LocateBy.Id, "com.android.calculator2:id/digit_5");
	ButtonSD Button_6 = new ButtonSD("6")
			.addPlatformLocatorForNativeApp(PlatformType.android_mobile, LocateBy.Id, "com.android.calculator2:id/digit_6");
	ButtonSD Button_7 = new ButtonSD("7")
			.addPlatformLocatorForNativeApp(PlatformType.android_mobile, LocateBy.Id, "com.android.calculator2:id/digit_7");
	ButtonSD Button_8 = new ButtonSD("8")
			.addPlatformLocatorForNativeApp(PlatformType.android_mobile, LocateBy.Id, "com.android.calculator2:id/digit_8");
	ButtonSD Button_9 = new ButtonSD("9")
			.addPlatformLocatorForNativeApp(PlatformType.android_mobile, LocateBy.Id, "com.android.calculator2:id/digit_9");
	
	ButtonSD Button_Plus = new ButtonSD("+")
			.addPlatformLocatorForNativeApp(PlatformType.android_mobile, LocateBy.AccessibilityId, "plus");
	ButtonSD Button_Minus = new ButtonSD("-")
			.addPlatformLocatorForNativeApp(PlatformType.android_mobile, LocateBy.AccessibilityId, "minus");
	ButtonSD Button_Multiply = new ButtonSD("*")
			.addPlatformLocatorForNativeApp(PlatformType.android_mobile, LocateBy.AccessibilityId, "multiply");
	ButtonSD Button_Divide = new ButtonSD("/")
			.addPlatformLocatorForNativeApp(PlatformType.android_mobile, LocateBy.AccessibilityId, "divide");
	ButtonSD Button_Delete = new ButtonSD("DEL")
			.addPlatformLocatorForNativeApp(PlatformType.android_mobile, LocateBy.AccessibilityId, "delete");
	ButtonSD Button_Clear = new ButtonSD("CLR")
			.addPlatformLocatorForNativeApp(PlatformType.android_mobile, LocateBy.AccessibilityId, "clear");
	ButtonSD Button_Equals = new ButtonSD("=")
			.addPlatformLocatorForNativeApp(PlatformType.android_mobile, LocateBy.Xpath, "//android.widget.Button[@content-desc=\"equals\"]");
	
	LabelSD Textbox_CalculatorResults = new LabelSD("Calculator Results")
			.addPlatformLocatorForNativeApp(PlatformType.android_mobile, LocateBy.Id, "com.android.calculator2:id/result");
	
	
}
