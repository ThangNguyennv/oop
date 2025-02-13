package exam.midterm.test6.iterator;

import java.util.ArrayList;

public class MyListIterator implements Iterator {
	private ArrayList<String> items;
	private int position;
 
	public MyListIterator(ArrayList<String> items) {
		this.items = items;
		this.position = 0;
	}
 
	public String next() {
		/* TODO */
		return items.get(position++);
	}
 
	public boolean hasNext() {
		/* TODO */
		return position < items.size();
	}
}
