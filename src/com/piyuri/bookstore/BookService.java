package com.piyuri.bookstore;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class BookService { 
	@Autowired
	private MongoTemplate mongoTemplate;

	public static final String COLLECTION_NAME = "book"; //--------1)

	/*public void addBook(Book book) {
		if (!mongoTemplate.collectionExists(Book.class)) {  //---------2)
mongoTemplate.createCollection(Book.class);
}    
		System.out.println("In insert");
		System.out.println("In service layer");

		System.out.println("In insert");
		mongoTemplate.insert(book, COLLECTION_NAME);
		System.out.println("inserted");//------3)
	}
*/


	public void addBook2(Book book)
	{
		/*if(!mongoTemplate.collectionExists(Book.class))
		{
			 	
		}*/
		System.out.println(UUID.randomUUID());
		
		book.setId(UUID.randomUUID().toString());
		mongoTemplate.insert(book,COLLECTION_NAME);
	}

	public List<Book> listBook() {
		return mongoTemplate.findAll(Book.class, COLLECTION_NAME);
	}

	public void deleteBook(Book book) {
		// TODO Auto-generated method stub
		System.out.println("delete method service");
		mongoTemplate.remove(book, COLLECTION_NAME);
	}

}