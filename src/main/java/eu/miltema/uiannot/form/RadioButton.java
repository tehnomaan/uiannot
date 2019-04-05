package eu.miltema.uiannot.form;

import java.lang.annotation.*;

/**
 * This String-field must be displayed as a radio-button
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface RadioButton {
	/**
	 * @return comma-separated options (label keys), for example "1:Tallinn,2:Riga,3:Chicago"
	 */
	public String options();
}
