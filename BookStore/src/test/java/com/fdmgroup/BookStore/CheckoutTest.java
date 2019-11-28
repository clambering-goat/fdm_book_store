package com.fdmgroup.BookStoreTTD;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.HashMap;

import javax.swing.text.StyledEditorKit.BoldAction;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test; 


public class CheckoutTest {
	
	private CheckOut checkout;
	
	private Bascket bascket;

	
	
	@BeforeEach
	public void intint() {
		bascket = new Bascket();
		checkout =new CheckOut();
	}
	
	@Test
	public void teastCalculatePrice() {
		double expct =0.0;
		double prive=checkout.caluat_totoal_price(bascket);
		assertEquals (prive,expct) ;
		
	}
	
	
	@Test
	public void teastCalculatePriceOfOneBook() {
		Book book =new Book(5.5);
		bascket.addBooks(book);
	
		double expct =5.5;
		double prive=checkout.caluat_totoal_price(bascket);

		assertEquals (expct,prive) ;
		
		
	}
	
	
	@Test
	public void teastdiscount () {
		double discount= checkout.mutileple_buy_discount(3);
	
		double expct =1;
		
		assertEquals (expct,discount) ;
		
	}
	
	
	
	@Test
	public void teastdiscount_7 () {
		double discount= checkout.mutileple_buy_discount(7);
	
		double expct =2;
		
		assertEquals (expct,discount) ;
		
	}
	
	
	@Test
	public void teastdiscount_10 () {
		double discount= checkout.mutileple_buy_discount(10);
	
		double expct =13;
		
		assertEquals (expct,discount) ;
		
	}
	
	@Test
	public void teastdiscount_25 () {
		double discount= checkout.mutileple_buy_discount(25);
	
		double expct =18;
		
		assertEquals (expct,discount) ;
		
	}
	
	
	
	@Test
	public void teastCalculatePriceOfTwo_same_Book() {
		Book book =new Book(5);
		bascket.addBooks(book);
		bascket.addBooks(book);
	
		double expct =5;
		double prive=checkout.caluat_totoal_price(bascket);
		assertEquals (expct,prive) ;
		
	}
	
	@Test
	public void teastCalculatePriceOfTwo_diffent_Book() {
		Book book =new Book(5);
		Book book_2 =new Book(5);
		bascket.addBooks(book);
		bascket.addBooks(book_2);
	
		double expct =9.5;
		double prive=checkout.caluat_totoal_price(bascket);
		assertEquals (expct,prive) ;
		
	}
	
	
	@Test
	public void teastCalculatePriceOf7Book() {
		Book book =new Book(5);

		bascket.addBooks(book);
		bascket.addBooks(book);
		bascket.addBooks(book);
		bascket.addBooks(book);
		bascket.addBooks(book);
		bascket.addBooks(book);
		bascket.addBooks(book);
		//35
		//
		
	
	
		double expct =19.3;
		double prive=checkout.caluat_totoal_price(bascket);
		assertEquals (expct,prive) ;
		
	}
	
	
	@Test
	public void teastCalculatePriceOf10Book() {
		Book book =new Book(5);
		bascket.addBooks(book);
		bascket.addBooks(book);
		bascket.addBooks(book);
		bascket.addBooks(book);
		bascket.addBooks(book);
		bascket.addBooks(book);
		bascket.addBooks(book);
		bascket.addBooks(book);
		bascket.addBooks(book);
		bascket.addBooks(book);
		
	
	
		double expct =18.5;
		double prive=checkout.caluat_totoal_price(bascket);
		assertEquals (expct,prive) ;
		
	}
	
	
	@Test
	public void is_not_unice () {
		Book book =new Book(5);
		bascket.addBooks(book);
		bascket.addBooks(book);
		
		boolean uni_books =checkout.are_all_book_diffent(bascket);
		boolean expct =false;
		
		assertEquals (expct,uni_books) ;
		
	}
	
	@Test
	public void is_unice () {
	
		Book book =new Book(5);
		Book book_2 =new Book(5);
		Book book_3 =new Book(5);
		bascket.addBooks(book);
		bascket.addBooks(book_2);
		bascket.addBooks(book_3);
		boolean uni_books =checkout.are_all_book_diffent(bascket);
		boolean expct =true;
		
		assertEquals (expct,uni_books) ;
		
	}
	
	
	@Test
	public void is_unice_price () {
		Book book =new Book(5);
		Book book_2 =new Book(5);
		bascket.addBooks(book);
		bascket.addBooks(book_2);

		double expct =9.5;
		double prive=checkout.caluat_totoal_price(bascket);
		assertEquals (expct,prive) ;
		
	}
	
	
	@Test
	public void same_not_book () {
		Book book =new Book(5);
		Book book_2 =new Book(5);
		bascket.addBooks(book);
		bascket.addBooks(book_2);

		double expct =9.5;
		double prive=checkout.caluat_totoal_price(bascket);
		assertEquals (expct,prive) ;
		
	}
	
	

	
	@Test
	public void same_6_book () {
		Book book =new Book(5);
		int count=0;
		HashMap<Book, Integer> listOfBookInBacsket = bascket.getBookInBacsket();


		bascket.addBooks(book);
		bascket.addBooks(book);

		bascket.addBooks(book);
		bascket.addBooks(book);

		bascket.addBooks(book);
		bascket.addBooks(book);
		for (Book i : listOfBookInBacsket.keySet()) {
			count=listOfBookInBacsket.get(i);
		}
		assertEquals (6,count) ;
		
	}
	
}
