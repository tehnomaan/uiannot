package eu.miltema.uiannot.component;

import java.lang.annotation.*;

/**
 * This field is displayed as a table. The field must have collection type.
 * Each element in that collection is displayed as a row in the table.
 * @author Margus
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.FIELD, ElementType.TYPE})
public @interface Table {
	public enum Style {COLUMN_HEADERS, ROW_HEADERS, NO_HEADERS, BOTH_HEADERS, DEFAULT}

	/**
	 * @return table style. Header labels are composed from collection item field names
	 */
	Style value() default Style.DEFAULT;
}
