package Baku.center.com.dto;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public record OrderDto(
        @NotEmpty(message = "should not be empty")
        @NotNull(message = "should not be null")
        String fullnameOfBuyer,
        @NotEmpty(message = "should not be empty")
        @NotNull(message = "should not be null")
        String orderName,
        @NotEmpty(message = "should not be empty")
        @NotNull(message = "should not be null")
        String cartType,
        @NotNull(message = "should not be null")
        @Size(message = "Should contain only 16",max = 16)
        Character cardNumber,
        @NotNull(message = "should not be null")
        @Size(message = "should contain only 3",max = 3)
        Character securityCode
) {
}
