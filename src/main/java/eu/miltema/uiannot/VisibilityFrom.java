package eu.miltema.uiannot;

import java.lang.annotation.*;

/**
 * Makes the widget conditionally visible
 * @author Margus Selge
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface VisibilityFrom {
	/**
	 * @return name of a boolean field
	 */
	String value();
}
