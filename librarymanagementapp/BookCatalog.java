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
        Map<Integer, Book> result = new HashMap<>();

        // Search by exact match of the author's name
        if (type.equals("exact")) {
            for (Book book : books.values()) {
                if (book.getAuthor().equals(searchQuery)) {
                    result.put(book.getCatalogNumber(), book);
                }
            }
            // Search by partial match of the author's name
        } else if (type.equals("partial")) {
            for (Book book : books.values()) {
                if (book.getAuthor().contains(searchQuery)) {
                    result.put(book.getCatalogNumber(), book);
                }
            }
        } else {
            System.out.println("Invalid search type. Valid values are 'exact' or 'partial'.");
        }
        return result;
    }

    public void sortBooks(String sortBy) {

    }

    public void printCatalog() {
        books.values().forEach(System.out::println);
    }
}
