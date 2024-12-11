package com.example.dbtestprj.service.implementation;

import com.example.dbtestprj.model.User;

public interface UserServiceInterface {
    User getUser(final Long userId) throws Exception;
    void saveUser(final User user);
}
