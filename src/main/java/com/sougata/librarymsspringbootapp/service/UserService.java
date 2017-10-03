package com.sougata.librarymsspringbootapp.service;

import com.sougata.librarymsspringbootapp.domain.User;

public interface UserService {
    Iterable<User> list();
    User save(User user);
    void delete(long id);
    User update(long id, User user);
    User getByName(String name);
}
