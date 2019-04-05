package eu.miltema.uiannot;

import java.lang.annotation.*;

/**
 * This field (java type Badge.Style) is displayed as a badge.
 * @author Margus
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface Badge {
	public enum Style {SUCCESS, INFO, WARNING, ERROR, DISABLED, PRIMARY, SECONDARY, DEFAULT};
}
