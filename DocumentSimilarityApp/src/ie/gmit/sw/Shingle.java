package ie.gmit.sw;

import java.util.ArrayList;

/*
 * Bean class for Shingle
 */

public class Shingle {
	private int id; //document id
	private ArrayList<String> shingles = new ArrayList<String>(); //list of words
	
	// Constructor
	public Shingle(int id, ArrayList<String> shingles) {
		super();
		this.id = id;
		this.shingles = shingles;
	}
	
	// Getters and Setters
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public ArrayList<String> getShingles() {
		return shingles;
	}

	public void setShingles(ArrayList<String> shingles) {
		this.shingles = shingles;
	}

}
