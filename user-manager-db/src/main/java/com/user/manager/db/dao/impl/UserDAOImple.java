package com.user.manager.db.dao.impl;

import com.user.manager.db.dao.IUserDAO;
import com.user.manager.db.model.User;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * Created by yushi on 9/4/14.
 */
@Repository
public class UserDAOImple implements IUserDAO {
    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public User findUserById(long id) {
        return (User)sessionFactory.getCurrentSession().get(User.class,id);
    }

    @Override
    public void insertUser(User user) {
        sessionFactory.getCurrentSession().persist(user);
    }

    @Override
    public void updateUser(User user) {
        sessionFactory.getCurrentSession().update(user);
    }

    @Override
    public void deleteUser(User user) {
        sessionFactory.getCurrentSession().delete(user);
    }
}
