package eu.miltema.uiannot;

import java.lang.annotation.*;

/**
 * Makes current method an event handler for another field
 * @author Margus
 *
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface HandlerFor {
	public enum Event {CLICK, CHANGE, MOUSE_OVER, MOUSE_OUT, KEY_DOWN, LOAD}

	/**
	 * @return field name, for which this event handler is meant for
	 */
	public String field();

	/**
	 * @return ecmascript event name
	 */
	public Event event();

}
