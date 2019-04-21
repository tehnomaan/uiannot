package eu.miltema.uiannot;

import java.lang.annotation.*;

/**
 * Render this field as badge or with leftside/rightside add-on badge
 * @author Margus
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.FIELD, ElementType.METHOD})
public @interface Badge {

	public enum Mode {
		/**
		 * This field is the badge. Field value is rendered as badge label
		 */
		STANDALONE,

		/**
		 * Badge is displayed left of current element's label; 'labelFrom' indicates badge label source
		 */
		LEFTSIDE,

		/**
		 * Badge is displayed right of current element's label; 'labelFrom' indicates badge label source
		 */
		RIGHTSIDE
	}

	/**
	 * @return badge rendering mode
	 */
	public Mode mode() default Mode.STANDALONE;

	public enum Color {DEFAULT, PRIMARY, SECONDARY, SUCCESS, DANGER, WARNING, INFO, LIGHT, DARK}

	/**
	 * @return badge color
	 */
	public Color color() default Color.DEFAULT;

	public String labelFrom() default "";
}
