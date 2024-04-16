package librarymanagementapp;

import java.util.HashMap;
import java.util.Map;

public class BookCatalog {
    private Map<Integer, Book> books;

    public BookCatalog(Map<Integer, Book> books) {
        this.books = new HashMap<>(books);
    }
    public void addBook(Book book) {
        books.put(book.getCatalogNumber(), book);
    }
    public boolean removeBook(int catalogNumber) {
        if (books.containsKey(catalogNumber)) {
            books.remove(catalogNumber);
            return true;
        }
        return false;
    }
    public Map<Integer, Book> findBook(String searchQuery, String type) {

    }
    public void sortBooks(String sortBy) {

    }
    public void printCatalog() {
        books.values().forEach(System.out::println);
    }
}
