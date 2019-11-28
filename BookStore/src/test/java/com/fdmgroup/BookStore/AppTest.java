package com.fdmgroup.BookStoreTTD;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.HashMap;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class AppTest {

	private Bascket bascket;

	@BeforeEach
	public void intint() {
		bascket = new Bascket();
	}

	@Test
	public void seeIfBacketIsEmputy() {

		HashMap<Book, Integer> listOfBookInBacsket = bascket.getBookInBacsket();
		int real_val = listOfBookInBacsket.size();
		int expct = 0;
		assertEquals(real_val, expct);

	}

	@Test
	public void seeIfBacketHas1() {
		Book book = new Book(5.5);
		bascket.addBooks(book);
		HashMap<Book, Integer> listOfBookInBacsket = bascket.getBookInBacsket();
		int real_val = listOfBookInBacsket.size();
		int expct = 1;
		assertEquals(expct, real_val);

	}

	@Test
	public void seeIfBackethas2() {
		Book book = new Book(5.5);
		bascket.addBooks(book);
		bascket.addBooks(book);
		HashMap<Book, Integer> listOfBookInBacsket = bascket.getBookInBacsket();
		int count = 0;
		for (Book i : listOfBookInBacsket.keySet()) {
			count += listOfBookInBacsket.get(i);
		}
		int real_val = listOfBookInBacsket.size();
		int expct = 2;
		assertEquals(expct, count);

	}

}
