package eu.miltema.uiannot;

import java.lang.annotation.*;

/**
 * Makes the field appear as a hyperlink in HTML.
 * By default, field value represents link target and field name represents label key
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface Link {

	/**
	 * LABEL: field value represents link label<br>
	 * HREF: field value represents target href<br>
	 * IGNORE_VALUE: field value is not used for the link
	 */
	public enum ValueIs {LABEL, HREF, IGNORE_VALUE};

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
