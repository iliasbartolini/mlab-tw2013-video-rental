package com.twu.refactor;

public class NewReleasePriceCode  extends PriceCode {

	public double getAmount(int daysRented) {
		return daysRented * 3;
	}

}
