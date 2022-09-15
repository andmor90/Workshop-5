package pl.coderslab.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import pl.coderslab.model.Author;
import pl.coderslab.model.Book;
import pl.coderslab.service.JpaBookService;

import java.util.List;

@Controller
@RequestMapping("/admin/books")
public class ManageBookController {

    private final JpaBookService jpaBookService;


    public ManageBookController(JpaBookService jpaBookService) {
        this.jpaBookService = jpaBookService;
    }

    @ModelAttribute("authors")
    public List<Author> authors(){
        return jpaBookService.findAllAuthors();
    }

    @GetMapping("/all")
    public String showPosts(Model model) {
        List<Book> books = jpaBookService.getBooks();
        model.addAttribute("books", books);
        return "book";
    }

    @GetMapping("/add")
    public String addBook(Model model){
        model.addAttribute("book", new Book());
        return "bookAdd";
    }

    @PostMapping("/add")
    public String handleAddBook(Book book, Model model){
        jpaBookService.saveBook(book);
        return "redirect:/admin/books/all";
    }

    @GetMapping("/edit/{id}")
    public String editBook(@PathVariable long id, Model model){
        model.addAttribute("book", jpaBookService.findBookById(id));
        return "bookEdit";
    }

    @RequestMapping("/delete/{id}")
    public String deleteBook(@PathVariable long id){
        jpaBookService.deleteBook(id);
        return "redirect:/admin/books/all";
    }

    @RequestMapping("/show/{id}")
    public String showBook(@PathVariable long id, Model model){
        model.addAttribute("book", jpaBookService.findBookById(id));
        return "bookShow";
    }
}

