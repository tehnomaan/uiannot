package eu.miltema.uiannot;

import java.lang.annotation.*;

/**
 * Adds a subtitle before current element
 * A title can be declared for levels h1-h6, default is h1.
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface Subtitle {
	public enum Level {H1, H2, H3, H4, H5, H6};

	/**
	 * @return label key in labels file
	 */
	String value() default "";

	/**
	 * This is a dynamic label and its value is fetched from another field
	 * @return field name holding subtitle label
	 */
	String valueFrom() default "";

	Level level() default Level.H2;
}
