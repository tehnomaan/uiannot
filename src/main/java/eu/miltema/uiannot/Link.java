package eu.miltema.uiannot;

import java.lang.annotation.*;

/**
 * Makes the field appear as a hyperlink in HTML.
 * Field value will be used as link label.
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface Link {
	/**
	 * @return label key in labels file
	 */
	String labelKey() default "";

	/**
	 * @return the field holding the label for this link
	 */
	String labelField() default "";

	/**
	 * @return parameters to add to hyperlink
	 */
	String[] parameters() default {};
}
