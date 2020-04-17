/*
 *Modify the following assignment that you have previously completed to apply Java GUI
 *features. Everything should be the same except that your main() program should
 *implement Java GUI to get input from the user to enter objects Services and Supplies into
 *ArrayList Account. 
 * Name :- Punit Patel 
 * Course: CPSC 24500
 */ 

public class Supplies extends Account {
	
	private int numberOfItems;
    private double pricePerItem;

    public Supplies(int id, int numberOfItems, double pricePerItem) {
        super(id);
        this.numberOfItems = numberOfItems;
        this.pricePerItem = pricePerItem;
    }

    public Supplies(int id) {
        super(id);
        numberOfItems = 0;
        pricePerItem = 0;
    }

    public double getPricePerItem() {
        return pricePerItem;
    }

    public int getNumberOfItems() {
        return numberOfItems;
    }

    public void setNumberOfItems(int numberOfItems) {
        this.numberOfItems = numberOfItems;
    }

    public void setPricePerItem(double pricePerItem) {
        this.pricePerItem = pricePerItem;
    }

    public double calculateSales() {
        return getNumberOfItems() * getPricePerItem();
    }

    //The toString() method should be overridden to provide a readable string representation of each object.
    @Override
    public String toString() {
        return super.toString() + " \nPrice/item: $" + getPricePerItem() + ", " +
                "\nItems sold: " + getNumberOfItems() + " \nTotal Sales: $" + calculateSales();
    }

}
