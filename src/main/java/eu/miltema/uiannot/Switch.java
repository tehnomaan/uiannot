package eu.miltema.uiannot;

import java.lang.annotation.*;

/**
 * Render this boolean field as switch-button
 * @author Margus
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface Switch {

}
