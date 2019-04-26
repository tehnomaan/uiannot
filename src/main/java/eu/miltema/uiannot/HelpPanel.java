package eu.miltema.uiannot;

import java.lang.annotation.*;

/**
 * Adds a help panel to the component
 * @author Margus
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface HelpPanel {
	public enum HelpPos {TOP, RIGHT, BOTTOM, LEFT}

	/**
	 * @return help panel position relative to main content area
	 */
	HelpPos value() default HelpPos.RIGHT;

	public enum Bp {XS, SM, MD, LG}

	/**
	 * @return screen size, from which help panel is visible
	 */
	Bp visibleBp() default Bp.MD;
}