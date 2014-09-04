package com.user.manager.db.dao;

import com.user.manager.db.model.User;

/**
 * Created by yushi on 9/4/14.
 */
public interface IUserDAO {
    User findUserById(long id);

    void insertUser(User user);

    void updateUser(User user);

    void deleteUser(User user);
}
