package Baku.center.com.dto;

import jakarta.validation.constraints.*;

public record UserDto(
        @NotEmpty(message = "should not be empty")
        @NotNull(message = "should not be null")
        String fullname,
        @NotEmpty(message = "should not be empty")
        @NotNull(message = "should not be null")
        @NotBlank(message = "should not be blank in the email content")
        @Email(message = "should contain capital ")
        String email,
        @NotEmpty(message = "should not be empty")
        @NotNull(message = "should not be null")
        @Size(message = "letter,number,special characters should be contained", min = 8, max = 16)
        String password) {
}
