package cse360assign2;

public class AddingMachine {

	private int total;
	private String history;
	
	public AddingMachine () {
		total = 0;  // not needed - included for clarity
		history = "0"; //hold the history of transactions
	}
	
	public int getTotal() { //gets total 
	    return total;
	}

	public void add(int value) { //adds values together
	    total += value;
	    history += " + " + value;
	}

	public void subtract(int value) { //subtracts values together
	    total -= value;
	    history += " - " + value;
	}

	public String getHistory() { //gets history of transactions that occurred 
	    return history;
	}
		
	public String toString () { //prints out values
		return "";
	}

	public void clear() { //clears out adding machine
	
	}
}