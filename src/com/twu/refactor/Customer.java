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
		double totalAmount = 0;
		int frequentRenterPoints = 0;

		String textResult = printHeader();

		for (Rental rental : rentalList) {
			totalAmount += rental.calculateAmount();
			frequentRenterPoints += rental.calculatePoints();

			textResult += rental.print();
		}

		textResult += printFooter(totalAmount, frequentRenterPoints);
		return textResult;
	}

	private String printFooter(double totalAmount, int frequentRenterPoints) {
		return  "Amount owed is " + totalAmount + "\n" +
				"You earned " + frequentRenterPoints + " frequent renter points";
	}

	private String printHeader() {
		return "Rental Record for " + name + "\n";
	}

}
