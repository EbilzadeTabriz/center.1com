package Baku.center.com.dto;

import jakarta.persistence.Column;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;

public record BookDto(
        @NotEmpty(message = "should not be empty")
        @NotNull(message = "should not be null")
        String bookName,
        @NotEmpty(message = "should not be empty")
        @NotNull(message = "should not be null")
        String bookType,
        @NotEmpty(message = "should not be empty")
        @NotNull(message = "should not be null")
        String bookDescription,
        @NotEmpty(message = "should not be empty")
        @NotNull(message = "should not be null")
        String bookAuthor

) {
}
