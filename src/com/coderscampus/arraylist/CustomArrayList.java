package com.coderscampus.arraylist;

import java.util.Arrays;

public class CustomArrayList<T> implements CustomList<T> {
	Object[] items = new Object[10];
	int size = 0;
	@Override
	public boolean add(T item) {
		if (size == items.length) {
			items = Arrays.copyOf(items, items.length * 2);
		}
		items[size] = item;
		size++;

		return true;
	}

	@Override
	public int getSize() {
		return size;
	}

	@Override
	public T get(int index) {
		if ((0 > index) || (index < items.length)) {
			return (T) items[index];
		}
		return null;
	}

	@Override
	public String toString() {
		return "CustomArrayList [items=" + Arrays.toString(items) + "]";
	}

	@Override
	public boolean add(int index, T item) throws IndexOutOfBoundsException {
		
			if (index < 0 || index > items.length) {
		        throw new IndexOutOfBoundsException("Index is out of bounds!");
		    }
		    Object[] temporaryArray = new Object[items.length + 1];
		    for (int i = 0; i < index; i++) {
		        temporaryArray[i] = items[i];
		    }
		    temporaryArray[index] = item;
		    for (int i = index + 1; i < temporaryArray.length; i++) {
		        temporaryArray[i] = items[i - 1];
		    }
		    for (int i = 0; i < items.length; i++) {
		        items[i] = temporaryArray[i];
		    }

		return true;
	}

	@Override
	public T remove(int index) throws IndexOutOfBoundsException {
		if (index < 0 || index > items.length) {
			throw new IndexOutOfBoundsException("Index is out of bounds!");
		}
		Object[] temporaryArray = new Object[items.length];
		    for (int i = 0; i < index; i++) {
		        temporaryArray[i] = items[i];
		    }
		    for (int i = index + 1; i < temporaryArray.length; i++) {
		        temporaryArray[i] = items[i];
		    }
		    for (int i = 0; i < items.length; i++) {
		        items[i] = temporaryArray[i];
		    }
		return null;
	}

}
