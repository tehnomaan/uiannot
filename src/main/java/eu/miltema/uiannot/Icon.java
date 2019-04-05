package eu.miltema.uiannot;

import java.lang.annotation.*;

/**
 * Adds an icon to current element/widget. The interpretation of icon value() depends on implementing library.
 * For example, the icon can be a JPEG image, a CSS class or one of these:
 * 
 * See also:
 * 1) http://fontawesome.io/icons
 * 2) http://www.webhostinghub.com/glyphs/#howToUse
 * 3) https://material.io/icons
 * 4) Use http://fontello.com, to make custom font+CSS from SVG-files; Get SVG-files from https://www.flaticon.com
 * @author Margus
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface Icon {
	
	public enum Position {LEADING, TRAILING, DEFAULT}

	/**
	 * HTML rendering depends on implementing library. For example, it can be one of these:
	 * 1) for font-awesome, "fa fa-filter"; complete list is available at http://fontawesome.io/icons
	 * 2) for webhostinghub, "icon-filter"; complete list is available at http://www.webhostinghub.com/glyphs
	 * Properties value and fromField are mutually exclusive.
	 * @return icon identifier
	 */
	public String value() default "";

	/**
	 * Icon is dynamic and its value is read from another field (not from annotation value=...).
	 * Properties value and fromField are mutually exclusive.
	 * @return field name for icon identifier
	 */
	public String fromField() default "";

	/**
	 * @return leading=icon appears before element, trailing=icon appears after element
	 */
	public Position pos() default Position.DEFAULT;

	/**
	 * @return extra CSS for the icon
	 */
	public String cssClass() default "";
}
