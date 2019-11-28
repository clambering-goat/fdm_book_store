package com.fdmgroup.BookStoreTTD;

import java.util.ArrayList;
import java.util.HashMap;
 
public class Bascket {


	//private ArrayList<Book> listOfBookInBacsket=new ArrayList<Book>();
	
	private HashMap<Book,Integer> listOfBookInBacsket=new HashMap<Book,Integer>();
	


	public HashMap<Book, Integer> getBookInBacsket() {
		return listOfBookInBacsket;
	}

	public void addBooks(Book book) {
		if(listOfBookInBacsket.containsKey(book)) {
			int number_of_copys=this.listOfBookInBacsket.get(book);
			number_of_copys+=1;
			listOfBookInBacsket.put(book,number_of_copys);
		}
		else {
		this.listOfBookInBacsket.put(book,1);
	}
	}



}
