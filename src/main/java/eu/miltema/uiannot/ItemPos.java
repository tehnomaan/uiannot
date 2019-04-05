package eu.miltema.uiannot;

import java.lang.annotation.*;

/**
 * Defines the positioning of this item in @ItemList row
 * @author Margus
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface ItemPos {
	public enum Pos {
		/**
		 * appears before list item main content area; multiple leading elements are permitted
		 */
		LEADING,
		/**
		 * appears on the 1st line in main content area; multiple line elements are permitted
		 */
		LINE1,
		/**
		 * appears on the 2nd line in main content area; multiple line elements are permitted
		 */
		LINE2,
		/**
		 * appears on the 3rd line in main content area; multiple line elements are permitted
		 */
		LINE3,
		/**
		 * appears after list item main content area; multiple trailing elements are permitted
		 */
		TRAILING,
	}

	public Pos value();

}
