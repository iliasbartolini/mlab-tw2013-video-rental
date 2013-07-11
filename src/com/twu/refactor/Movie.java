package com.twu.refactor;

public class Movie {
	public static final PriceCode CHILDRENS = new ChildrensPriceCode();
	public static final PriceCode REGULAR = new RegularPriceCode();
	public static final PriceCode NEW_RELEASE = new NewReleasePriceCode();

	private String title;
	private PriceCode priceCode;

	public Movie(String title, PriceCode priceCode) {
		this.title = title;
		this.priceCode = priceCode;
	}

	public PriceCode getPriceCode() {
		return priceCode;
	}

	public void setPriceCode(PriceCode arg) {
    	priceCode = arg;
	}

	public String getTitle () {
		return title;
	}

	boolean isNewRelease() {
		return priceCode == Movie.NEW_RELEASE;
	}

	public double getAmount(int daysRented){
		return priceCode.getAmount(daysRented);
	};
}

