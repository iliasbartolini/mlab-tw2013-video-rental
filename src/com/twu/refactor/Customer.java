package com.twu.refactor;

import java.util.ArrayList;
import java.util.Iterator;

public class Customer {

	private String name;
	private ArrayList<Rental> rentalList = new ArrayList<Rental>();

	public Customer(String name) {
		this.name = name;
	}

	public void addRental(Rental arg) {
		rentalList.add(arg);
	}

	public String statement() {
		String textResult = printHeader();
		for (Rental rental : rentalList) {
			textResult += rental.print();
		}
		textResult += printFooter();
		return textResult;
	}

	private int totalFrequentPoints() {
		int frequentRenterPoints = 0;
		for (Rental rental : rentalList) {
			frequentRenterPoints += rental.calculatePoints();
		}
		return frequentRenterPoints;
	}

	private double totalRentalsAmount() {
		double totalAmount = 0;
		for (Rental rental : rentalList) {
			totalAmount += rental.calculateAmount();
		}
		return totalAmount;
	}

	private String printFooter() {
		return  "Amount owed is " + totalRentalsAmount() + "\n" +
				"You earned " + totalFrequentPoints() + " frequent renter points";
	}

	private String printHeader() {
		return "Rental Record for " + name + "\n";
	}

}
