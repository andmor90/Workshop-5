package pl.coderslab.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import pl.coderslab.model.Author;
import pl.coderslab.service.JpaBookService;

public class AuthorConverter implements Converter<String, Author> {

    private JpaBookService jpaBookService;

    @Override
    public Author convert(String id) {
        return jpaBookService.findAuthorById(Long.parseLong(id));
    }

    @Autowired
    public void setAuthorService(JpaBookService jpaBookService){
        this.jpaBookService = jpaBookService;
    }
}
