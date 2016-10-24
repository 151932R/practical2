package demo;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by chitboon on 10/23/15.
 */
public class BookDBAO {
    // get book details given the bookId
    // this method is dummy for now
    public BookDetails getBookDetails(String bookId) {
        // return dummy book for testing now
        return createDummyBook(bookId);
    }

    // convenient method to create a dummy book detail
    // this method is meant for testing
    private BookDetails createDummyBook(String bookId) {
        BookDetails details = new BookDetails();
        details.setBookId(bookId);
        details.setDescription("Web components for developers talks about how web components can transfor the way you develop application for the web");
        details.setFirstName("Java");
        details.setSurname("Expert");
        details.setInventory(5);
        details.setOnSale(false);
        details.setPrice(5.9f);
        details.setTitle("Web components for developers");
        details.setYear(2015);
        return details;
    }

    /*private BookDetails createBook(String bookId) {
        BookDetails details = new BookDetails();
        details.setBookId(bookID.getBookId());
        details.setDescription(details);
        details.setFirstName(allBookDetails.get(i).getFirstName());
        details.setSurname(allBookDetails.get(i).getSurname());
        details.setInventory(allBookDetails.get(i).getInventory());
        details.setOnSale(allBookDetails.get(i).isOnSale());
        details.setPrice(allBookDetails.get(i).getPrice());
        details.setTitle(allBookDetails.get(i).getTitle());
        details.setYear(allBookDetails.get(i).getYear());
        return details;
    }*/

    public ArrayList<BookDetails> getAllBooks() {
        ArrayList<BookDetails> allBookDetails = new ArrayList<BookDetails>();
        ArrayList<BookDetails> allBookDetailsBefore = new ArrayList<BookDetails>();
        //allBookDetailsBefore.add(new BookDetails())
        for (int i = 0; i < 7; i++) {
            allBookDetails.add(createDummyBook("7"));
        }

        return allBookDetails;
    }

    /*public List<BookDetails> getAllBooks(){
        ArrayList<BookDetails> list = new ArrayList<BookDetails>();
        for (int i = 0; i < 5; i++){
            BookDetails book = new BookDetails();
            book.setBookId("" + i);
            book.setDescription("Book Description " + i);
            book.setFirstName("First Name" + i);
            book.setSurname("Expert");
            book.setInventory(i);
            book.setOnSale(true);
            book.setPrice(1.0f + i);
            book.setTitle("Book Title: " + 1);
            book.setYear(2014+i);
            list.add(book);
        }
        return list;
    }*/
}