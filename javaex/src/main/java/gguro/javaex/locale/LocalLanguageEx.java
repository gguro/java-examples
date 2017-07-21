package gguro.javaex.locale;


import java.util.Locale;
import java.util.ResourceBundle;

import gguro.common.Testable;

public class LocalLanguageEx implements Testable {
	// PRIVATE
	private static String fBUNDLE_NAME = "Message";
	private static String fENGLISH = Message.English;
	private static String fFRENCH = Message.French;
	
	/**
	 * Default is English. Note that this default is perfectly suitable for any
	 * initial user selection of language, since the Strings representing the
	 * languages themselves have only one representation, which are defined in
	 * the default bundle.
	 */
	private ResourceBundle fText = ResourceBundle.getBundle(fBUNDLE_NAME, Locale.ENGLISH);
	
	
	
	public void test() {

		selectLanguage(fFRENCH);
		showDisplay();
		selectLanguage(fENGLISH);
		showDisplay();
	}

	/**
	 * The user's first action is to select a language.
	 */
	public void selectLanguage(String aLanguage) {
		if (aLanguage.equals(fENGLISH)) {
			fText = ResourceBundle.getBundle(fBUNDLE_NAME, Locale.ENGLISH);
		} else if (aLanguage.equals(fFRENCH)) {
			fText = ResourceBundle.getBundle(fBUNDLE_NAME, Locale.FRENCH);
		} else {
			throw new IllegalStateException("Unknown language");
		}
	}

	public void showDisplay() {
		// use the bundle to get the proper version of a string
		// note that the variable names - Text.Hello, etc - reflect the content,
		// so these method calls clearly indicate what is being displayed
		// to the user
		System.out.println(fText.getString(Message.Hello));
		System.out.println(fText.getString(Message.PleaseSelectAction));
	}

	

	
}
