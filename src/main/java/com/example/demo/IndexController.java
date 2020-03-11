package com.example.demo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
public class IndexController {

    private BookRepository bookRepository;

    @Autowired
    public IndexController(BookRepository bookRep) {
        this.bookRepository = bookRep;
    }

    @RequestMapping({ "/", "" })
    public String allBooks(Model model) {
        List<Book> books = bookRepository.getBookList();
        model.addAttribute("books", books);
        return "booklist";
    }

    @RequestMapping(value = "/rediraddbook", method = RequestMethod.GET)
    public String redirAddBook() {
        return "addnewbook";
    }

    @RequestMapping(value = "/add-book", method = {RequestMethod.POST, RequestMethod.GET})
    public String addBook(@ModelAttribute Book book, Model model) {
        model.addAttribute("book", book);
        bookRepository.addBook(book);
        return "redirect:/";
    }
}


