package com.coderscampus.arraylist;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CustomArrayListTest {

	CustomList<Object> newList = new CustomArrayList<>();
	int i;
	@Test
	void testAddT() {
		for (i = 0; i < 50; i++) {
			newList.add("item: " + i);
		}
		for (i = 0; i < newList.getSize(); i++) {
			assertNotNull(newList.get(i));
		}
	}

	@Test
	void testGetSize() {
		assertEquals(i, newList.getSize());

	}

	@Test
	 void testGet() {
		 newList.get(i);
	 }
	
	 @Test
	 void testAddIntT() {
		 System.out.println(newList.toString());
	  newList.add(5, "newitem"+1);
	  System.out.println(newList.toString());
	  assertEquals("newitem"+1, newList.get(5));
	 }
	
	 @Test
	 void testRemove() {
		 System.out.println(newList.toString());
		 for (i = 0; i < 15; i++) {
				newList.add("item: " + i);
			}
	     System.out.println(newList.toString());
		  newList.remove(5);
		  newList.remove(7);
		  newList.remove(9);
		  
		  System.out.println(newList.toString());
		  assertEquals(null, newList.get(5));
	 }

}
