package com.fdmgroup.BookStore;

import java.util.ArrayList;
import java.util.HashMap;

public class CheckOut {

	public double caluat_totoal_price(Bascket bascket) {
		int number_of_books = 0;
		// add to get the total price of all books
		double price = 0;
		HashMap<Book, Integer> listOfBookInBacsket = bascket.getBookInBacsket();
		for (Book i : listOfBookInBacsket.keySet()) {

			price += i.getPrice() * listOfBookInBacsket.get(i);
			number_of_books += listOfBookInBacsket.get(i);

		}

		// list of all disconts
		int mutileple_buy_discount_pressent_disscont = 0;
		int are_all_book_diffent_pressent_disscont = 0;
		double total_discont_present = 0;
		double mutile_buy_money_off = two_of_the_same_book(bascket);

		// set the discon for buying mutiple book

		mutileple_buy_discount_pressent_disscont = mutileple_buy_discount(number_of_books);

		// incress the disscount if all the book are diffent
		if (are_all_book_diffent(bascket)) {
			are_all_book_diffent_pressent_disscont = 5;
		}

		total_discont_present = mutileple_buy_discount_pressent_disscont + are_all_book_diffent_pressent_disscont;

		double discount_off = (price / 100) * total_discont_present;

		discount_off += mutile_buy_money_off;

		price = price - discount_off;

		return price;
	}

	public double two_of_the_same_book(Bascket bascket) {
		HashMap<Book, Integer> book_in_basket = bascket.getBookInBacsket();

		double money_off = 0;
		for (Book i : book_in_basket.keySet()) {
			double number_of_copys = book_in_basket.get(i);
			double prices = i.getPrice();

			money_off += prices * Math.floor(number_of_copys / 2);
		}

		return money_off;

	}

	public int mutileple_buy_discount(int number_of_books) {

		int discount = 0;

		// caulate the total discont amount in presnt
		int there_present_discount_off_aount = number_of_books % 3;
		int thre_prestne_dis = (number_of_books - there_present_discount_off_aount) / 3;

		// add the 10% discont
		discount = thre_prestne_dis;
		if (number_of_books > 9) {
			discount += 10;
		}
		return discount;
	}

	public boolean are_all_book_diffent(Bascket bascket) {
		HashMap<Book, Integer> book_in_basket = bascket.getBookInBacsket();

		if (book_in_basket.size() == 1) {
			return false;
		}
		int count = 0;
		for (Book i : book_in_basket.keySet()) {
			count += 1;

			if (book_in_basket.get(i) > 1) {

				return false;
			}
		}
		// TODO Auto-generated method stub
		return true;
	}

}
