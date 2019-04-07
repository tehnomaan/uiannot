package eu.miltema.uiannot;

import java.util.*;

/**
 * This class is used to declare @ItemList or @Table, which includes grouping, for example:
 * 
 * @ItemList
 * Collection<RecordGroup<MyRecord>> groups;
 */
public class RecordsGroup<R> implements Comparable<RecordsGroup<R>> {
	public String title;
	public List<R> records;

	public RecordsGroup() {
	}

	public RecordsGroup(String title, List<R> records) {
		this.title = title;
		this.records = records;
	}
	
	public RecordsGroup(String title, List<R> records, Comparator<R> comparator) {
		this.title = title;
		this.records = records;
		this.records.sort(comparator);
	}

	@Override
	public int compareTo(RecordsGroup<R> r) {
		return title.compareToIgnoreCase(r.title);
	}
}
