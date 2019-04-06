package eu.miltema.uiannot.component;

import java.lang.annotation.*;

/**
 * Declares that the subsequent fields from this field on, will be placed on a form.
 * Using @Form annotation is optional, since it is implied when no other component-level annotation applies
 * @author Margus
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.FIELD, ElementType.TYPE})
public @interface Form {

}
