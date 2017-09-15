package com.sougata.librarymsspringbootapp.service;

import com.sougata.librarymsspringbootapp.domain.User;

public interface UserService {
    Iterable<User> list();
    User save(User user);
    void delete(long id);
    User update(User user);
}
