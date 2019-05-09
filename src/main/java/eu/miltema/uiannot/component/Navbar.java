package eu.miltema.uiannot.component;

import java.lang.annotation.*;

/**
 * Declares that current String-field represents a navi-bar (horizontal links).
 * The field itself holds the parameters for the links: each link has the same parameters.
 * Navbar only makes sense on a form and is ignored inside other components
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.FIELD, ElementType.TYPE})
public @interface Navbar {
	Class<?>[] value();//target components
}
