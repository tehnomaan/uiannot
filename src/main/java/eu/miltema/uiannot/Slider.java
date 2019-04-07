package eu.miltema.uiannot;

import java.lang.annotation.*;

/**
 * This numeric field is rendered as slider. An array field is rendered as multiple slider buttons in slider widget
 * @author Margus
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.FIELD, ElementType.TYPE})
public @interface Slider {

	/**
	 * @return minimum value
	 */
	double min() default 0;

	/**
	 * @return maximum value
	 */
	double max() default 100;

	/**
	 * @return slider movement step
	 */
	double step() default 1;

	/**
	 * @return name of the numeric field holding minimum value
	 */
	String minFrom() default "";

	/**
	 * @return name of the numeric field holding maximum value
	 */
	String maxFrom() default "";

	/**
	 * @return name of the numeric field holding step value
	 */
	String stepFrom() default "";
}
