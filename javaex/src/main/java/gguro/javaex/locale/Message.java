package gguro.javaex.locale;

import java.util.ListResourceBundle;

public final class Message extends ListResourceBundle {
	public final Object[][] getContents() {
		return fContents;
	}

	/**
	 * These constants are used by the caller to identify what text is needed;
	 * which version of the text is actually returned is determined by the
	 * ResourceBundle mechanism.
	 *
	 * Using variable names which reflect the content clarifies the intent of
	 * the code in the user of this class.
	 */
	public static final String Hello = "Hello";
	public static final String PleaseSelectAction = "PleaseSelectAction";

	/**
	 * Language names presented as a list of choices to the user are special,
	 * since they are always presented in the native language. Thus, this
	 * default bundle defines the unique representations of all language names,
	 * and no other bundle provides a translation for them.
	 */
	public static final String English = "English";
	public static final String French = "Francais";

	// PRIVATE
	private static final Object[][] fContents = { { Message.Hello, "Hello" },
			{ Message.PleaseSelectAction, "Please select an action" }, { Message.English, "English" }, // never
																									// defined
																									// elsewhere
			{ Message.French, "Francais" }, // never defined elsewhere
	};

}
