/*



package com.javatpoint;

import com.mycompany.bookstore.service.BookService;
import com.mycompany.bookstore.model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;

import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.View;
import org.springframework.web.servlet.view.RedirectView;
@Controller

public class HelloWorldController { 

@Autowired 
private BookService  bookService;

        @RequestMapping(value = "/book", method = RequestMethod.GET)  
public String getBookList(ModelMap model) {  
model.addAttribute("bookList", bookService.listBook());  
return "output";  
 String returned will be resolved into output.jsp by view resolver  
}  

@RequestMapping(value = "/book/save", method = RequestMethod.POST)  
public View createBook(@ModelAttribute Book book, ModelMap model) { 

bookService.addBook(book); 

return new RedirectView("/BookStore/book"); 
control goes to getBookList() which is mapped to /book  
}
}*/



















package com.piyuri.bookstore;  
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.View;
import org.springframework.web.servlet.view.RedirectView;  
@Controller  
public class BookController {  
	@Autowired 
	private BookService  bookService;
	@RequestMapping(value = "/book", method = RequestMethod.GET)   
	public String getBookList(ModelMap model) { 
		System.out.println("hi 123");
		model.addAttribute("bookList", bookService.listBook()); 
		model.addAttribute("message", "hi in bookstore"); 
		return "output";  /* String returned will be resolved into output.jsp by view resolver */ 
		}  
	/*@RequestMapping(value = "/book/save", method = RequestMethod.POST)
	public View addBook(@ModelAttribute Book book,ModelMap map)
	{
		
		bookService.addBook(book);
		return new RedirectView("/BookStore/book");
				}*/
	
	
	@RequestMapping(value = "/book/delete", method = RequestMethod.GET)
	public View deleteBook(@ModelAttribute Book book,ModelMap map)
	{	bookService.deleteBook(book);
		return new RedirectView("/Book_Store/book"); 
	}
	
	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public View addBook(@ModelAttribute Book book,ModelMap map)
	{
		System.out.println("In add book method");
		
		bookService.addBook2(book);
		return new RedirectView("/Book_Store/book");
	
	}

	
	
	
	
	
	
}  