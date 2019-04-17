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
	public static final String DECIMALS0 = "format.decimals0";
	public static final String DECIMALS1 = "format.decimals1";
	public static final String DECIMALS2 = "format.decimals2";
	public static final String DECIMALS3 = "format.decimals3";
	public static final String DECIMALS4 = "format.decimals4";

	/**
	 * @return format string key in labels file
	 */
	public String value();
}
