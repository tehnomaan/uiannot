package eu.miltema.uiannot;

import java.lang.annotation.*;

/**
 * This field represents numeric monetary value.
 * If the field type is integer, it is assumed to have a 100x scaler. For example integer value 1234 indicates €12.34 or $12.34
 * @author Margus
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface Money {

}
