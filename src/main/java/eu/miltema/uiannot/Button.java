package eu.miltema.uiannot;

import java.lang.annotation.*;

/**
 * This method is displayed as a button. Button click is handled by this very same method
 * @author Margus
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface Button {
}
