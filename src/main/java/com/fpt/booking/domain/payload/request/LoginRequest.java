package com.fpt.booking.domain.payload.request;

import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class LoginRequest {
    @NotBlank
    private String phone;

    @NotBlank
    private String password;
    // tao 2 bien phone va password de nhan gia tri tu client
    //requiment cua client la phai co phone va password de login
}