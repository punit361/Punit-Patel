/*
 *Modify the following assignment that you have previously completed to apply Java GUI
 *features. Everything should be the same except that your main() program should
 *implement Java GUI to get input from the user to enter objects Services and Supplies into
 *ArrayList Account. 
 * Name :- Punit Patel 
 * Course: CPSC 24500
 */ 


public class Services extends Account {
	 private int numberOfHours;
	    private double ratePerHour;

	    public Services(int id, int numberOfHours, double ratePerHour) {
	        super(id);
	        this.numberOfHours = numberOfHours;
	        this.ratePerHour = ratePerHour;
	    }

	    public Services(int id) {
	        super(id);
	        numberOfHours = 0;
	        ratePerHour = 0;
	    }

	    public double getRatePerHour() {
	        return ratePerHour;
	    }

	    public int getNumberOfHours() {
	        return numberOfHours;
	    }

	    public void setNumberOfHours(int numberOfHours) {
	        this.numberOfHours = numberOfHours;
	    }

	    public void setRatePerHour(double ratePerHour) {
	        this.ratePerHour = ratePerHour;
	    }

	    public double calculateSales() {
	        return getNumberOfHours() * getRatePerHour();
	    }

	   
	    @Override
	    public String toString() {
	        return super.toString()+" \nRate/hour: $"+getRatePerHour()+" \nHours worked: "+
	                getNumberOfHours()+" \nTotal Income: $"+calculateSales();
	    }

}
