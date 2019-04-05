package eu.miltema.uiannot.form;

import java.lang.annotation.*;

/**
 * This is a file upload field. A file can be anything (a picture, a file, movie, document etc).
 * File uploading can only be done on a form so this annotation is only permitted on a form field.
 *
 * @author margus
 *
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface FileUpload {

	public static final int DEFAULT_HEIGHT = 32;
	public static final int DEFAULT_FILESIZE = 100000;

	public static final String FILETYPES_ALL = "*";
	public static final String FILETYPES_IMAGES = ".jpeg,.jpg,.gif,.png,image/jpeg,image/gif,image/png";
	public static final String FILETYPES_DOCUMENTS = ".pdf,.doc,.docx,.xls,.xlsx,application/vnd.ms-excel,application/msword,application/pdf";

	/**
	 * @return height of thumbnail
	 */
	int thumbHeight() default DEFAULT_HEIGHT;

	/**
	 * @return comma-separated list of supported file types, for example: .jpg,.jpeg,.gif,.png. Return "*" when all file types are permitted.
	 *         Predefined constants FILETYPES_xyz can also be used.
	 */
	String fileTypes();

	/**
	 * @return file maximum size (in bytes)
	 */
	int maxSize() default DEFAULT_FILESIZE;
}
