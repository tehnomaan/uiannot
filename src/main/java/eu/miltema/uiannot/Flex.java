package eu.miltema.uiannot;

import java.lang.annotation.*;

/**
 * Declares that this item has special behaviour in parent flexbox container.
 * This annotation only has effect in @ItemList.
 * @author Margus
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface Flex {

	public enum Size {
		/**
		 * This element horizontally fills the available space in parent flexbox container
		 */
		GROW,

		/**
		 * This element has equal with with all @FILL elements in parent flexbox container
		 */
		FILL,

		/**
		 * This element is horizontally as small as possible, using word wrap
		 */
		SHRINK,

		/**
		 * This element in parent flexbox container has no particular flex-style
		 */
		DEFAULT
	}

	/**
	 * @return sizing behaviour of this element
	 */
	Size size() default Size.GROW;

	/**
	 * @return number of items in current flex element
	 */
	int lines() default 1;
}
