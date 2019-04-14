package eu.miltema.uiannot;

import java.lang.annotation.*;

/**
 * This field is not rendered as an HTML widget. The field only exists in model.
 * @author Margus Selge
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface Hidden {
}
