package eu.miltema.uiannot;

import java.lang.annotation.*;

/**
 * This field is displayed as image
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface Image {
	public enum Style {CIRCLE, SQUARE, ORIGINAL, DEFAULT};
	public Style value() default Style.DEFAULT;
}
