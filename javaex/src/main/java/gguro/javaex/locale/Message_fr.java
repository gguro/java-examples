package gguro.javaex.locale;

import java.util.ListResourceBundle;

public class Message_fr extends ListResourceBundle {

	public final Object[][] getContents() {
		return fContents;
	}

	// No constants are defined here

	// PRIVATE
	private static final Object[][] fContents = { { Message.Hello, "Bonjour" },
			{ Message.PleaseSelectAction, "Veuillez choisir une action" } };
}
