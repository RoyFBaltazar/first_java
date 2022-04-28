public class hello {
    public static void main(String[] args) {
        int songsA = 19;
        int songsB = 9;
        int albumLengthA = 41;
        int albumLengthB = 53;
        boolean sameNumberOfSongs = songsA == songsB;
        boolean differentLength = albumLengthA != albumLengthB;h

        System.out.println("hello world" + differentLength + sameNumberOfSongs);
    }
}
public class Store {
    // instance fields
    String productType;
    double price;


    // constructor method
    public Store(String product, double initialPrice) {
        productType = product;
        price = initialPrice;
    }

    // increase price method
    public void increasePrice(double priceToAdd){
        double newPrice = price + priceToAdd;
        price = newPrice;

    }

    // main method
    public static void main(String[] args) {
        Store lemonadeStand = new Store("Lemonade", 3.75);
        lemonadeStand.increasePrice(1.5);
        System.out.println(lemonadeStand.price);

    }