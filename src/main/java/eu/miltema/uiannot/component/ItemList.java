package eu.miltema.uiannot.component;

import java.lang.annotation.*;

/**
 * This field must have a collection type and is displayed as item list.
 * Items in collection must be either custom types or RecordsGroup-s.
 * Custom types can be annotated with @Flex, in order to make use of flexbox behaviour
 * @author Margus
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.FIELD, ElementType.TYPE})
public @interface ItemList {

	/**
	 * @return icon identifier for missing records. The default is "fas fa-exclamation-circle fa-4x"
	 */
	String missingIconId() default "fas fa-exclamation-circle fa-4x mr-2";
}
