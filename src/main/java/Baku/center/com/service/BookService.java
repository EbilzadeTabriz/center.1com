package Baku.center.com.service;

import Baku.center.com.dto.BookDto;
import Baku.center.com.entity.Book;

import java.time.LocalDate;
import java.util.List;


public interface BookService {

    List<BookDto> getAll();

    List<BookDto> getByAuthor(String bookAuthor);
    List<BookDto> getByPublishYear(LocalDate publishYear);
    List<BookDto> getByBookType(String bookType);
    List<BookDto> getByAuthorAndBookType(String bookAuthor,String bookType);
    BookDto getByAuthorAndBookTypeAndBookName(String bookAuthor,String bookType,String bookName);

    BookDto getByBookName(String bookName);
    BookDto getById(Long bookId);
    void deleteById(Long bookId);
    void deleteAllBookAuthor(String bookAuthor);
    void addBook(BookDto bookDto);
    void updateBook(Long bookId,BookDto bookDto);

}
