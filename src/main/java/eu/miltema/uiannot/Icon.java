package eu.miltema.uiannot;

import java.lang.annotation.*;

/**
 * Render this field as icon
 * @author Margus
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.FIELD, ElementType.METHOD})
public @interface Icon {

	public enum Mode {
		/**
		 * This String-field is displayed as an icon; icon identifier is fetched from field value (not from annotation attribute id)
		 */
		STANDALONE,

		/**
		 * Icon is displayed left of current element's label; 'id' identifies icon image and style
		 */
		LEFTSIDE,

		/**
		 * Icon is displayed right of current element's label; 'id' identifies icon image and style
		 */
		RIGHTSIDE
	}

	/**
	 * @return how this icon is rendered
	 */
	Mode mode() default Mode.STANDALONE;

	/**
	 * @return icon identifier. For example, Font-awesome icons are identified like this: "fas fa-camera fa-8x fa-fw"
	 */
	String id() default "";
}
