package com.fpt.booking.domain.payload.response;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserResponse {

    private Long id;

    private String name;

    private String email;

    private Boolean isLocked;

    private Boolean isActive;

    private String address;

    private String phone;

    private String imageUrl;

}
// tao cac bien de nhan gia tri tu client
// xuat duoi dang file json
