package eu.miltema.uiannot;

import java.lang.annotation.*;

/**
 * Makes the field appear as a hyperlink in HTML.
 * By default, field value represents link target and field name represents label key
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface Link {

	public enum ValueIs {
		/**
		 * Field value represents link label
		 */
		LABEL,

		/**
		 * Field value represents target href
		 */
		HREF,

		/**
		 * Field value is not used for the link
		 */
		IGNORE_VALUE
	};

	/**
	 * @return the meaning of field value
	 */
	ValueIs valueIs() default ValueIs.HREF;

	/**
	 * @return field name holding the target href for the link; this is useful, when the field represents a badge or icon
	 */
	String hrefFrom() default "";

	/**
	 * @return field name holding the label for this link; this is useful when label is not derived from field name
	 */
	String labelFrom() default "";

	/**
	 * @return parameters to add to hyperlink
	 */
	String[] parameters() default {};
}
