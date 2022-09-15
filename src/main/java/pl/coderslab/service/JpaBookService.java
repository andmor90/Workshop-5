package pl.coderslab.service;

import org.springframework.stereotype.Service;
import pl.coderslab.dao.AuthorDao;
import pl.coderslab.dao.BookDao;
import pl.coderslab.model.Author;
import pl.coderslab.model.Book;
import pl.coderslab.repository.AuthorRepository;
import pl.coderslab.repository.BookRepository;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class JpaBookService {

    private final BookRepository bookRepository;
    private final BookDao bookDao;

    private final AuthorDao authorDao;

    private final AuthorRepository authorRepository;

    public JpaBookService(BookRepository bookRepository, BookDao bookDao, AuthorDao authorDao, AuthorRepository authorRepository) {
        this.bookRepository = bookRepository;
        this.bookDao = bookDao;
        this.authorDao = authorDao;
        this.authorRepository = authorRepository;
    }

    public void saveBook(Book book){
        if(book.getId() != null){
            bookDao.updateBook(book);
        } else {
            bookDao.saveBook(book);
        }
    }

    public void saveAuthor(Author author){
        authorDao.saveAuthor(author);
    }

    public Author findAuthorById(Long id){
        return authorRepository.findAuthorById(id);
    }

    public List<Author> findAllAuthors(){
        return authorRepository.findAllAuthors();
    }
    public List<Book> getBooks() {
        return bookRepository.findAllBooks();
    }

    public Book findBookById(long id){
        return bookRepository.findBookById(id);
    }

    public void updateBook(Book book){
        bookDao.updateBook(book);
    }

    public void deleteBook(long id){
        Book book = findBookById(id);
        bookDao.delete(book);
    }




}

