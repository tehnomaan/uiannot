package eu.miltema.uiannot.form;

import java.lang.annotation.*;

/**
 * This is a time field with time picker attached
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface TimePicker {

	public enum Style {MANUAL_ENTRY_DISABLED, MANUAL_ENTRY_ENABLED, DEFAULT}

	Style value() default Style.DEFAULT;

}
