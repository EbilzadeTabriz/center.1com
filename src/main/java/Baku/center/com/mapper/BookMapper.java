package Baku.center.com.mapper;

import Baku.center.com.dto.BookDto;
import Baku.center.com.entity.Book;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface BookMapper {
    BookDto toBookDto(Book book);
    Book toBook(BookDto bookDto);

}
