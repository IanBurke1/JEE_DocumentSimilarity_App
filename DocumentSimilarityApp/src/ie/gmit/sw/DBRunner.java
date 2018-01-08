package ie.gmit.sw;

import java.util.ArrayList;

import java.util.List;

import com.db4o.Db4o;
import com.db4o.Db4oEmbedded;
import com.db4o.ObjectContainer;
import com.db4o.ObjectSet;
import com.db4o.config.EmbeddedConfiguration;
import com.db4o.ta.TransparentActivationSupport;
import com.db4o.ta.TransparentPersistenceSupport;

import xtea_db4o.XTEA;
import xtea_db4o.XTeaEncryptionStorage;

/*
 * DBRunner class is where the DB4O is established and configured.
 */

public class DBRunner implements DocumentService{
	//Variables
	private ObjectContainer db = null;
	private List<Shingle> docs = new ArrayList<Shingle>();
	
	//Constructor
	public DBRunner(){
		
		//init(); //Populate the database
		
		EmbeddedConfiguration config = Db4oEmbedded.newConfiguration();
		config.common().add(new TransparentActivationSupport());
		config.common().add(new TransparentPersistenceSupport());
		config.common().updateDepth(7);
		
		//Use the XTea library to add encryption. The basic Db4O container only has a Caesar cypher 
		config.file().storage(new XTeaEncryptionStorage("password", XTEA.ITERATIONS64));
		
		//Open a local database. Use Db4o.openServer(config, server, port) for full client / server
		db = Db4oEmbedded.openFile(config, "docs.data");
		
		compareDoc();
		saveDoc();
		
		
	}
	
	
	private void showAllShingles(){
		//An ObjectSet is a specialised List for storing results
		ObjectSet<Shingle> shingles = db.query(Shingle.class);
		for (Shingle shingle  : shingles){
			//out.print("[Shingle] " + shingle.getShingleStr() + "\t ***Database ObjID: " + db.ext().getID(shingle));
			
			
			db.commit();
		}
	}
	
	
	public static void main(String[] args) {
		new DBRunner();
	}

	@Override
	public void compareDoc() {
		//Jaccard..
		
	}

	@Override
	public void saveDoc() {
		for (Shingle s: docs){
			db.store(s); //Adds Shingle to db
		}
		db.commit(); //Commits the tx
		//db.rollback(); //Rolls back the tx
		
	}
	

}
