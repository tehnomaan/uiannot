package eu.miltema.uiannot;

import java.lang.annotation.*;

/**
 * Hides associated HTML widget
 * @author Margus Selge
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface Hidden {
}
