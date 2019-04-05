package eu.miltema.uiannot;

import java.lang.annotation.*;

/**
 * This element has a special CSS-class
 * @author Margus
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface CssClass {
	/**
	 * @return CSS class/classes to add to this element
	 */
	String value() default "";

	/**
	 * @return field name, which provides the CSS classes to add to this element
	 */
	String fromField() default "";
}
