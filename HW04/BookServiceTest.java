package HW04;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import seminars.forth.src.seminars.fourth.book.BookRepository;
import seminars.forth.src.seminars.fourth.book.BookService;

import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

public class BookServiceTest {
    private BookRepository mockRepository;
    BookService service;

    @BeforeEach
    void setUp(){
        mockRepository = Mockito.spy(BookRepository.class);
        service = new BookService(mockRepository);
    }

    @Test
    void findBookById() {

        service.findAllBooks();
        verify(mockRepository, times(1)).findAll();

    }

    @Test
    void findAllBooks() {

        service.findAllBooks();
        verify(mockRepository, times(1)).findAll();
    }
}
