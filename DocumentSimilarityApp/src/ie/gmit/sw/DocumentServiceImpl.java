package ie.gmit.sw;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class DocumentServiceImpl implements DocumentService {

	@Override
	public void compareDoc() {
		/*
		 * Get doc from db and compare shingles
		 */
		DBRunner db = new DBRunner();
		db.compareDoc();
		
	}
	
	//save uploaded doc to db4o
	@Override
	public void saveDoc() {
		
		ArrayList<String> doc = new ArrayList<String>();
		
		DBRunner db = new DBRunner();
		db.saveDoc();
		
		
		
		
	}
	
	

}
