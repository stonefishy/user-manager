package com.user.manager.db.service.impl;

import com.user.manager.db.dao.IUserDAO;
import com.user.manager.db.model.User;
import com.user.manager.db.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by yushi on 9/4/14.
 */
@Service
public class UserServiceImp implements IUserService {
    @Autowired
    private IUserDAO userDAO;

    @Override
    public User findUserById(long id) {
        return userDAO.findUserById(id);
    }

    @Override
    public void insertUser(User user) {
        userDAO.insertUser(user);
    }

    @Override
    public void updateUser(User user) {
        userDAO.updateUser(user);
    }

    @Override
    public void deleteUser(User user) {
        userDAO.deleteUser(user);
    }
}
