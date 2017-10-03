package com.sougata.librarymsspringbootapp.service;


import com.sougata.librarymsspringbootapp.domain.User;
import com.sougata.librarymsspringbootapp.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{
    @Autowired
    private UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {

        this.userRepository = userRepository;
    }

    @Override
    public Iterable<User> list() {
        return userRepository.findAll();
    }

    @Override
    public User save(User user) {
        return userRepository.save(user);
    }

    @Override
    public void delete(long id) {
        userRepository.delete(id);
    }

    @Override
    public User update(long id, User user) {

        User user1 = userRepository.getById(id);
        user.setId(user1.getId());

        return userRepository.save(user);
    }

    @Override
    public User getByName(String name) {
        return userRepository.getByName(name);
    }
}
