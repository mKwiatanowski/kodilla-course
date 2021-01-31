package om.kodilla.patterns.library;

import com.kodilla.patterns.library.Book;
import com.kodilla.patterns.library.Library;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

public class LibraryTestSuite {

    @Test
    void testGetBooks(){
        //Given
        Library library = new Library("New Library");
        Book book1 = new Book("Tittle 1", "Thomas", LocalDate.of(2020, 11,5));
        Book book2 = new Book("Tittle 2", "Robert", LocalDate.of(1955, 2,25));
        Book book3 = new Book("Tittle 3", "Kate", LocalDate.of(2001, 6,30));
        Book book4 = new Book("Tittle 4", "Matt", LocalDate.of(2015, 1,7));
        Book book5 = new Book("Tittle 5", "Logan", LocalDate.of(2000, 9,11));

        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        library.addBook(book4);
        library.addBook(book5);

        //making a shallow copy of object library
        Library cloneLibrary = null;
        try {
            cloneLibrary = library.shallowCopy();
            cloneLibrary.setName("Library shallow copy");
        } catch (CloneNotSupportedException e){
            System.out.println(e);
        }

        //making a deep copy of object library
        Library deepCloneLibrary = null;
        try {
            deepCloneLibrary = library.deepCopy();
            deepCloneLibrary.setName("Library deep copy");
        } catch (CloneNotSupportedException e){
            System.out.println(e);
        }

        //When
        library.removeBook(book4);

        //Then
        System.out.println(library);
        System.out.println(cloneLibrary);
        System.out.println(deepCloneLibrary);
        assertEquals(4, library.getBooks().size());
        assertEquals(4, cloneLibrary.getBooks().size());
        assertEquals(5, deepCloneLibrary.getBooks().size());
        assertEquals(cloneLibrary.getBooks(), library.getBooks());
        assertNotEquals(deepCloneLibrary.getBooks(), library.getBooks());

    }
}
