package eu.miltema.uiannot.form;

import java.lang.annotation.*;

/**
 * This field is displayed as a dropdown and must have a type Collection&lt;Option&gt; or similar.
 * @author margus
 */
@Retention(RetentionPolicy.RUNTIME)
public @interface Dropdown {

	/**
	 * @return default options to be inserted into labels file.
	 * The format of options should be "1:Paris;2:London;3:Tallinn"
	 */
	String defaultOptions() default "";

	/**
	 * @return true, if the 1st element in the array should be empty
	 */
	boolean hasEmptyOption() default true;
}
