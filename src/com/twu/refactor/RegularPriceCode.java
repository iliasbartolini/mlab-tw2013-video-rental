package com.twu.refactor;

public class RegularPriceCode extends PriceCode {

	public double getAmount(int daysRented) {
		double thisAmount = 2;
		if (daysRented > 2)
			thisAmount += (daysRented - 2) * 1.5;
		return thisAmount;
	}

}
