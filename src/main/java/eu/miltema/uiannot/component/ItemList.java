package eu.miltema.uiannot.component;

import java.lang.annotation.*;

/**
 * This field must have a collection type and is displayed as item list.
 * Each fields of collection item must have @ItemPos-annotation
 * @author Margus
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface ItemList {

}
