package Baku.center.com.repository;

import Baku.center.com.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {
    List<Book> findByAuthor(String bookAuthor);
    List<Book> findByPublishYear(LocalDate publishYear);
    List<Book> findByBookType(String bookType);
    List<Book> findByAuthorAndBookType(String bookAuthor, String bookType);

    Book findByAuthorAndBookTypeAndBookName(String bookAuthor, String bookType, String bookName);

    Book findByBookName(String bookName);

    void deleteAllByBookAuthor(String bookAuthor);
}
