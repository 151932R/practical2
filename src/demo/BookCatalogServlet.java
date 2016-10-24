package demo;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

/**
 * Created by chitboon on 10/23/15.
 */
@WebServlet(name = "BookCatalogServlet", urlPatterns = "/bookcatalog")
public class BookCatalogServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        out.println("<html>" + "<head><title>Duke's Bookstore</title></head>" +
                "<body  bgcolor=\"#ffffff\">" + "<center>" +
                "<hr> <br> &nbsp;" + "<h1>" +
                "<font size=\"+3\" color=\"#CC0066\">Duke's </font> <img src=\"" +
                "./duke.books.gif\" alt=\"Duke holding books\"\">" +
                "<font size=\"+3\" color=\"black\">Bookstore</font>" + "</h1>" +
                "</center>" + "<br> &nbsp; <hr> <br> ");

        String bookId = request.getParameter("bookId");

        out.println("<table><tr>Hi</tr></table>");


            BookDBAO db = new BookDBAO();
            ArrayList<BookDetails> dbso = db.getAllBooks();

            //Print out the information obtained
            out.println("<table border=0>");
            for(BookDetails bd : dbso){
                out.println("<tr>" +
                        "<td>" + bd.getTitle() + "</br>  by " + bd.getFirstName() + " " + bd.getSurname() + "</td>" +
                        "<td> $" + bd.getPrice() + "</td>" + "<td>" +
                        "<td> Add to Cart </td>" +
                        "</tr>");
            }
            out.println("</table>");

        out.println("</body></html>");
    }
}