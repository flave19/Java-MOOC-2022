
public class Apartment {

    private int rooms;
    private int squares;
    private int pricePerSquare;

    public Apartment(int rooms, int squares, int pricePerSquare) {
        this.rooms = rooms;
        this.squares = squares;
        this.pricePerSquare = pricePerSquare;
    }

    public boolean largerThan(Apartment compared) {
        if (compared.squares > this.squares) {
            return false;
        } else {
            return true;
        }
    }

    public int priceDifference(Apartment compared) {
        int comparedPrice = compared.squares * compared.pricePerSquare;
        int currentPrice = this.squares * this.pricePerSquare;
        int difference = comparedPrice - currentPrice;

        if (difference < 0) {
            return difference * -1;
        } else {
            return difference;
        }
    }

    public boolean moreExpensiveThan(Apartment compared) {
        if (compared.pricePerSquare > this.pricePerSquare) {
            return false;
        } else {
            return true;
        }
    }

}
