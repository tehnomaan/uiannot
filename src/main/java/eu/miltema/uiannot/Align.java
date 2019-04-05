package eu.miltema.uiannot;

import java.lang.annotation.*;

/**
 * Aligns this element to the right
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface Align {

	public enum Dir {TOP, BOTTOM, LEFT, RIGHT, VCENTER, HCENTER, NO, SO, SW, NW, DEFAULT}

	/**
	 * @return alignment
	 */
	public Dir value() default Dir.DEFAULT;
}
