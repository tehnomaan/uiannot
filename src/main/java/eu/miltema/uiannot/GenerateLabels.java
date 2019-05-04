package eu.miltema.uiannot;

import java.lang.annotation.*;

/**
 * Generate a label for each enum constant into labels file.
 * NB! This annotation only works on enum fields (not enum declarations or any other type of fields)
 * @author Margus
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.FIELD})
public @interface GenerateLabels {

}
