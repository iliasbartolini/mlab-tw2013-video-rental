package com.twu.refactor;

public class ChildrensPriceCode extends PriceCode {

	public double getAmount(int daysRented) {
		double thisAmount = 1.5;
		if (daysRented > 3)
			thisAmount += (daysRented - 3) * 1.5;
		return thisAmount;
	}
}

