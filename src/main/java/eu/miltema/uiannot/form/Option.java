package eu.miltema.uiannot.form;

import java.io.Serializable;

/**
 * Represents a dropdown option
 * @author Margus
 */
public class Option implements Comparable<Option>, Serializable {

	public Object value;
	public String label;

	public Option() {
		
	}

	public Option(Object value, String label) {
		this.value = value;
		this.label = label;
	}

	@Override
	public int compareTo(Option o) {
		if (label == null)
			return -1;
		return label.compareToIgnoreCase(o.label);
	}
}
