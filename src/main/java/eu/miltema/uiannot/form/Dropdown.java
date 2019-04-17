package eu.miltema.uiannot.form;

import java.lang.annotation.*;

/**
 * This field is displayed as a dropdown
 * @author margus
 */
@Retention(RetentionPolicy.RUNTIME)
public @interface Dropdown {

	/**
	 * @return field name with type type Collection&lt;Option&gt;, which provides options for this dropdown
	 */
	String optionsFrom() default "";
}
