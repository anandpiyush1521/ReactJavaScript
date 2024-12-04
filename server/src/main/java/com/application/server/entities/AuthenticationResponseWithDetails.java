package com.application.server.entities;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AuthenticationResponseWithDetails {
    private final String jwt;
    private final User user;

    public AuthenticationResponseWithDetails(String jwt, User user) {
        this.jwt = jwt;
        this.user = user;
    }

}
