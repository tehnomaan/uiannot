package eu.miltema.uiannot.form;

import java.lang.annotation.*;

/**
 * A @LabelFor-field holds a dynamic label for a form field or for a hyperlink.
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface LabelFor {

	/**
	 * @return field name, this label applies to
	 */
	public String value();

}
