package src.main.java.aaaaaFifthIteration;

class Rental {
    private Movie _movie;
    private int _daysRented;

    public Rental(Movie movie, int daysRented) {
        _movie = movie;
        _daysRented = daysRented;
    }

    public int getDaysRented() {
        return _daysRented;
    }

    public Movie getMovie() {
        return _movie;
    }

    //// Moved Method from Customer
    double getCharge() {
        ////getCharge should move onto movie, as it is a bad idea to do a switch based on an attribute of another object.
        return _movie.getCharge(_daysRented);
    }

    //// Moved Method from SecondIteration
    int getFrequentRenterPoints() {
        //// same as above moved to Movie, as it belongs there
        return _movie.getFrequentRenterPoints(_daysRented);
    }
}