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

	/**
	 * GROW: this element horizontally fills the available space in parent flexbox container<br>
	 * FILL: this element has equal with with all @FILL elements in parent flexbox container<br>
	 * SHRINK: this element is horizontally as small as possible, using word wrap<br>
	 * DEFAULT: this element in parent flexbox container has no particular flex-style
	 */
	public enum Size {GROW, FILL, SHRINK, DEFAULT}

	/**
	 * @return sizing behaviour of this element
	 */
	Size size() default Size.GROW;

	/**
	 * @return number of items in current flex element
	 */
	int lines() default 1;
}
