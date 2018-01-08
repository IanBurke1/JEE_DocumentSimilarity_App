package ie.gmit.sw;

/*
 * This interface will act as a bridge between the servlet and db4o
 */

public interface DocumentService {
	
	/*
	 * Methods to be invoked..
	 */
	
	//CompareDoc used to compare documents
	public void compareDoc();
	//saveDoc used to save the uploaded doc to db4o
	public void saveDoc();
	

}
