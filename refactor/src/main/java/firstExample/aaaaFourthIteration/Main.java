package src.main.java.firstExample.aaaaFourthIteration;

public class Main {

    public static void main(String[] args) {
        // Create some movies
        Movie movie1 = new Movie("The Matrix", Movie.REGULAR);
        Movie movie2 = new Movie("Frozen", Movie.CHILDRENS);
        Movie movie3 = new Movie("Avengers: Endgame", Movie.NEW_RELEASE);

        // Create rentals
        Rental rental1 = new Rental(movie1, 3);  // 3 days REGULAR
        Rental rental2 = new Rental(movie2, 4);  // 4 days CHILDREN'S
        Rental rental3 = new Rental(movie3, 2);  // 2 days NEW RELEASE

        // Create customer
        Customer customer = new Customer("John Doe");

        // Add rentals to customer
        customer.addRental(rental1);
        customer.addRental(rental2);
        customer.addRental(rental3);

        // Print statement
        System.out.println("\naaaaFourthIteration:: Customer Statement:: "+customer.statement());
    }
}