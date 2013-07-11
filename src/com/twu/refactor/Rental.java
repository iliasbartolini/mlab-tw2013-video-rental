package com.twu.refactor;

public class Rental {

    private Movie movie;

    private int daysRented;

    public Rental(Movie movie, int daysRented) {
        this.movie = movie;
        this.daysRented = daysRented;
    }

    public Movie getMovie() {
        return movie;
    }

	public double calculateAmount() {
		double thisAmount = 0;
		switch (movie.getPriceCode()) {
		case Movie.REGULAR:
			thisAmount += 2;
			if (daysRented > 2)
				thisAmount += (daysRented - 2) * 1.5;
			break;
		case Movie.NEW_RELEASE:
			thisAmount += daysRented * 3;
			break;
		case Movie.CHILDRENS:
			thisAmount += 1.5;
			if (daysRented > 3)
				thisAmount += (daysRented - 3) * 1.5;
			break;
	
		}
		return thisAmount;
	}

	public String getTitle() {
		return movie.getTitle();
	}

	public int calculatePoints() {
		return isATwoDaysBonusRental() ? 2 : 1;
	}

	private boolean isATwoDaysBonusRental() {
		return movie.isNewRelease() && daysRented > 1;
	}
	public String print() {
		return "\t" + getTitle() + "\t" + calculateAmount() + "\n";
	}


}