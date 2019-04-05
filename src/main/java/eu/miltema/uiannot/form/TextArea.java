package eu.miltema.uiannot.form;

import java.lang.annotation.*;

/**
 * The field is displayed as a textarea on a form
 *
 * @author Margus Selge
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface TextArea {

}
