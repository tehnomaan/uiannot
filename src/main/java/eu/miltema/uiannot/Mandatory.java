package eu.miltema.uiannot;

import java.lang.annotation.*;

/**
 * Makes this field entry mandatory. Fields without this annotation are expected to be optional
 * @author Margus Selge
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface Mandatory {
}
