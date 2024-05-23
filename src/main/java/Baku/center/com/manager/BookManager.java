package Baku.center.com.manager;

import Baku.center.com.dto.BookDto;
import Baku.center.com.entity.Book;
import Baku.center.com.mapper.BookMapper;
import Baku.center.com.repository.BookRepository;
import Baku.center.com.service.BookService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class BookManager implements BookService {
    private final BookRepository repository;
    private final BookMapper mapper;

    @Override
    public List<BookDto> getAll() {
        List<Book> books = repository.findAll();
        return books.stream().map(mapper::toBookDto).toList();
    }

    @Override
    public List<BookDto> getByAuthor(String bookAuthor) {
        List<Book> books = repository.findByAuthor(bookAuthor);
        List<BookDto> bookDtos = books.stream().map(mapper::toBookDto).
                toList();
        return bookDtos;

    }

    @Override
    public List<BookDto> getByPublishYear(LocalDate publishYear) {
        List<Book> books = repository.findByPublishYear(publishYear);
        List<BookDto> bookDtos = books.stream().map(mapper::toBookDto).toList();
        return bookDtos;
    }

    @Override
    public List<BookDto> getByBookType(String bookType) {
        List<Book> books = repository.findByBookType(bookType);
        List<BookDto> bookDtos = books.stream().map(mapper::toBookDto).toList();
        return bookDtos;
    }

    @Override
    public List<BookDto> getByAuthorAndBookType(String bookAuthor, String bookType) {
        List<Book> books = repository.findByAuthorAndBookType(bookAuthor, bookType);
        List<BookDto> bookDtos = books.stream().map(mapper::toBookDto).toList();
        return bookDtos;
    }

    @Override
    public BookDto getByAuthorAndBookTypeAndBookName(String bookAuthor, String bookType, String bookName) {
        Book books = repository.findByAuthorAndBookTypeAndBookName(bookAuthor, bookType, bookName);
        return mapper.toBookDto(books);
    }

    @Override
    public BookDto getByBookName(String bookName) {
        Book books = repository.findByBookName(bookName);
        return mapper.toBookDto(books);
    }

    @Override
    public BookDto getById(Long bookId) {
        Book books = repository.findById(bookId).get();
        return mapper.toBookDto(books);
    }

    @Override
    public void deleteById(Long bookId) {
        repository.deleteById(bookId);

    }

    @Override
    public void deleteAllBookAuthor(String bookAuthor) {
        repository.deleteAllByBookAuthor(bookAuthor);

    }

    @Override
    public void addBook(BookDto bookDto) {
        Book book = mapper.toBook(bookDto);
        repository.save(book);

    }

    @Override
    public void updateBook(Long bookId, BookDto bookDto) {
        Optional<Book> books = repository.findById(bookId);
        if (books.isPresent()) {
            Book existing = books.get();
            existing.setBookDescription(bookDto.bookDescription());
            existing.setBookType(bookDto.bookType());
            existing.setBookName(bookDto.bookName());
            existing.setBookAuthor(bookDto.bookAuthor());
            repository.save(existing);
        }

    }
}
