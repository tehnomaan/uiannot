package eu.miltema.uiannot.component;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Declares that the field represents a navi-bar (horizontal links).
 * The type of a navi-bar must be a custom class, with @Link-s in it (other elements are permitted as well)
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface Navbar {
	boolean alignLeft() default false;
}
