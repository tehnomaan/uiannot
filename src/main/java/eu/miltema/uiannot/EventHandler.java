package eu.miltema.uiannot;

import java.lang.annotation.*;

/**
 * Declares that this method handles events from an element associated with a field.
 * By default, the handler activates on change (input, textarea, select) or on click (textual elements in tables, itemlists).
 * EventHandler is always declared at component-level (and never at record-level) -
 * this is because any updates should occur at component-level
 * @author Margus
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface EventHandler {

	public enum Ev {CLICK, CHANGE, HOVER, DEFAULT}

	/**
	 * @return field name
	 */
	String field();

	/**
	 * @return event name, when this handler applies
	 */
	Ev on() default Ev.DEFAULT;
}
