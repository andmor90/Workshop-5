package pl.coderslab.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import pl.coderslab.model.Author;
import pl.coderslab.model.Book;

import javax.transaction.Transactional;
import java.util.List;

@Transactional
@Repository
public interface AuthorRepository extends JpaRepository<Author, Long> {

    @Query(value = "select * from author", nativeQuery = true)
    List<Author> findAllAuthors();

    @Query
    Author findAuthorById(Long id);

}


