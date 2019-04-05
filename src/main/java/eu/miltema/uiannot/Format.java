package eu.miltema.uiannot;

import java.lang.annotation.*;

/**
 * Defines field format in browser
 * Choose one of the predefined formats or define Your own
 * @author margus
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface Format {
	public static final String DECIMALS0 = "fmt.decimals0";
	public static final String DECIMALS1 = "fmt.decimals1";
	public static final String DECIMALS2 = "fmt.decimals2";

	/**
	 * @return format string key in labels file
	 */
	public String value() default "";
}
