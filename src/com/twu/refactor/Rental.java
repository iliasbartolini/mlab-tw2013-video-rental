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
		return movie.getAmount(daysRented);
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