package pl.coderslab.repository;

import org.springframework.context.annotation.Primary;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import pl.coderslab.model.Book;

import javax.transaction.Transactional;
import java.util.List;

@Transactional
@Repository
public interface BookRepository extends JpaRepository<Book, Long> {

    @Query(value = "select * from books", nativeQuery = true)
    List<Book> findAllBooks();

    @Query
    Book findBookById(long id);

}


