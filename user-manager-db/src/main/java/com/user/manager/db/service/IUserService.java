package com.user.manager.db.service;

import com.user.manager.db.model.User;

/**
 * Created by yushi on 9/4/14.
 */
public interface IUserService {
    User findUserById(long id);

    void insertUser(User user);

    void updateUser(User user);

    void deleteUser(User user);
}
