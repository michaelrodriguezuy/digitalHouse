package com.dh.payment_service.model;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {

    private Long id;


    private String username;


    private String password;


    private String email;


}
