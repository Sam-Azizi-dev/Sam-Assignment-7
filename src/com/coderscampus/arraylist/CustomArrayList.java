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
		items = Arrays.copyOf(items, items.length + 1);
		int i = size - 1;
		while (i >= index) {
			items[i + 1] = items[i];
			i--;
		}
		items[index] = item;
		size++;

		return true;
	}

	@Override
	public T remove(int index) throws IndexOutOfBoundsException {
		if (index < 0 || index > items.length) {
			throw new IndexOutOfBoundsException("Index is out of bounds!");
		}
		int i=index;
		while (i < items.length-1) {
			items[i] = items[i+1];
			i++;
		}
		items = Arrays.copyOf(items, items.length - 1);
		size--;
		return null;
	}

}
