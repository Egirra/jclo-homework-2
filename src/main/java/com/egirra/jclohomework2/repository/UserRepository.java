package com.egirra.jclohomework2.repository;

import com.egirra.jclohomework2.model.Authorities;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

@Repository
public class UserRepository {
    private final String NAME_USER = "user";
    private final String PASSWORD_USER = "1234";
    public List<Authorities> getUserAuthorities(String user, String password) {
        if (user.isEmpty() || password.isEmpty()) {
            return Collections.emptyList();
        }
        if (user.equals(NAME_USER) && password.equals(PASSWORD_USER)) {
            List<Authorities> authorities = new ArrayList<>();
            authorities.add(Authorities.DELETE);
            authorities.add(Authorities.READ);
            authorities.add(Authorities.WRITE);
            return authorities;
        }
        return null;
    }
}