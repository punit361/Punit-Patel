/*
 *Modify the following assignment that you have previously completed to apply Java GUI
 *features. Everything should be the same except that your main() program should
 *implement Java GUI to get input from the user to enter objects Services and Supplies into
 *ArrayList Account. 
 * Name :- Punit Patel 
 * Course: CPSC 24500
 */ 


public abstract class Account {
	 private int accountId;

	    public Account(int id){
	        this.accountId=id;
	    }

	    public int getAccountId() {
	        return accountId;
	    }

	    public void setAccountId(int accountId) {
	        this.accountId = accountId;
	    }

	    //Consider having the calculateSales() as an abstract method for the Abstract Account class
	    public abstract double calculateSales();

	    @Override
	    public String toString() {
	        return "Account ID: "+getAccountId();
	    }

}
