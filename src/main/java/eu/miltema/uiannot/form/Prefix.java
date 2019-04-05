package eu.miltema.uiannot.form;

import java.lang.annotation.*;

/**
 * Adds a visual prefix to a field (input field, table cell, list item element etc)-
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface Prefix {
	/**
	 * @return attribute name, which holds the dynamic label for this prefix
	 */
	String fromField() default "";

	/**
	 * @return default static label
	 */
	String value() default "???";

	/**
	 * This prefix is rendered as icon. Rendering is implementation specific
	 * @return icon identifier
	 */
	String icon() default "";
}
