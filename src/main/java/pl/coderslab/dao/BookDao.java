package pl.coderslab.dao;

import org.springframework.stereotype.Repository;
import pl.coderslab.model.Book;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

@Transactional
@Repository
public class BookDao {
    @PersistenceContext
    private EntityManager entityManager;

    public void saveBook(Book book){
        entityManager.persist(book);
    }

    public void updateBook(Book book){
        entityManager.merge(book);
    }


    public void delete(Book book){
        entityManager.remove(entityManager.contains(book) ?
                book : entityManager.merge(book));
    }
}
