package eu.miltema.uiannot;

import java.lang.annotation.*;

/**
 * This method is displayed as a button. Button click is handled by this very same method.
 * @author Margus
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface Button {
	public enum Importance {PRIMARY, SECONDARY, WARNING};
	Importance value() default Importance.PRIMARY;

	/**
	 * @return comma-separated list of parameter names. If omitted, GET and DELETE don't get any parameters, POST and PUT will get all parameters.
	 */
	public String parameters() default "";
}
