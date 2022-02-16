package myApp;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public enum BookDAO {
	
    instance;
    
    private Map<Integer, Book> booksMap = new HashMap<Integer, Book>();
    
	private BookDAO() {
        Book book = new Book();
        book.setId(1);
        book.setTitle("AGOT");
        book.setAuthor("George R Martin");
        book.setYear("1999");
        booksMap.put(1, book);
        
        Book book1 = new Book();
        book.setId(2);
        book.setTitle("ACOK");
        book.setAuthor("George R Martin");
        book.setYear("2001");
        booksMap.put(2, book1);
    }
	
	public List<Book> getBooks() {
        List<Book> books = new ArrayList<Book>();
        books.addAll(booksMap.values());
        return books;
    }
    
    public Book getBook(int id) {
        return booksMap.get(id);
    }
}
