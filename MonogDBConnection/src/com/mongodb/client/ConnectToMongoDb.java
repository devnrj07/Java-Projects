package com.mongodb.client;

import java.util.Scanner;

import org.bson.Document;

import com.mongodb.BasicDBObject;
import com.mongodb.DBCollection;
import com.mongodb.MongoClient;
import com.mongodb.MongoCredential;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;

public class ConnectToMongoDb {

	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MongoClient mongo = new MongoClient( "localhost" , 27017 ); 
	    
	      /*MongoCredential credential; 
	      credential = MongoCredential.createCredential("sampleUser", "myDb", "password".toCharArray());*/ 
	      System.out.println("Connected to the database successfully");  
	      
	      MongoDatabase database = mongo.getDatabase("myDb"); 
	      //System.out.println("Credentials ::"+ credential);    
	      
	    //Creating a collection 
	     // database.createCollection("sampleCollection"); 
	      System.out.println("Collection created successfully"); 
	      
	      MongoCollection<Document> collection = database.getCollection("myCollection"); 
	      System.out.println("Collection myCollection selected successfully"); 
	       Scanner Sc = new Scanner(System.in);
	      
	       System.out.println("Enter the Title");
	      String title=Sc.next();
	      System.out.println("Enter the Id");
	      int id =Sc.nextInt();
	      System.out.println("Enter the Likes");
	      
	      int likes =Sc.nextInt();
	      System.out.println("Enter the Title By");
	      String by =Sc.next();
	      
	      
	      Document document = new Document("title", title) 
	    	      .append("id", id)
	    	      
	    	      .append("likes", likes) 
	    	       
	    	      .append("by", by);  
	    	      collection.insertOne(document); 
	    	      System.out.println("Document inserted successfully");    
	    	      
	    	  //    System.out.println("Document " + document);
	
	    	    /**  FindIterable<Document> moniterator = collection.find();
	    	      
	    	      MongoCursor<Document> it = moniterator.iterator();
	    	      String json=null;
	    	      while(it.hasNext()) {
	    	    	Document d=  it.next();
	    	    	//d.parse();
	    	    	System.out.println(d);
	    	      }**/
	    	      
	    	      updateDocument(collection);
	    	      removeAllDocuments(collection);
	    	      
	} 
	
	
	public static void removeAllDocuments(MongoCollection<Document> collection) {
		((Document) collection).remove(new BasicDBObject());
	}
	
	public static void updateDocument(MongoCollection<Document> collection) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Id to be updated");
		int id = sc.nextInt();
		System.out.println("Enter the New Title :");
		String title = sc.next();
		System.out.println("Enter the Likes");
		int likes = sc.nextInt();
		
		
		
	
		
		
		BasicDBObject newDocument = new BasicDBObject();
		newDocument.append("$set", new BasicDBObject().append("title", title));
		newDocument.append("$set", new BasicDBObject().append("likes", likes));
		
				
		BasicDBObject searchQuery = new BasicDBObject().append("id", id);

		collection.updateMany(searchQuery, newDocument);
		
		
	}
}


