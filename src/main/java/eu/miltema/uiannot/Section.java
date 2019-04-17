package eu.miltema.uiannot;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface Section {
	public enum SType {FORM, LIST, NAVBAR, TABLE}

	/**
	 * @return section type
	 */
	SType type();

	/**
	 * @return indicates if this section has a title
	 */
	boolean hasTitle() default true;

	/**
	 * @return name of a boolean attribute, which defines the visibility of this section
	 */
	String visibleFrom() default "";
}
