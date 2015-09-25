package trikita.anvil;

import java.util.Arrays;
import java.util.List;

public abstract class RenderableArrayAdapter<T> extends RenderableAdapter {
	private List<T> items;

	public RenderableArrayAdapter(T[] items) {
		this.items = Arrays.asList(items);
	}

	public RenderableArrayAdapter(List<T> items) {
		this.items = items;
	}

	public int getCount() {
		return items.size();
	}

	public T getItem(int pos) {
		return items.get(pos);
	}

	public void view(int pos) {
		view(pos, getItem(pos));
	}

	public abstract void view(int pos, T value);
}
