package com.atguigu.spring.iocxml.auto.sevice;

import com.atguigu.spring.iocxml.auto.dao.UserDao;
import com.atguigu.spring.iocxml.auto.dao.UserDaoImpl;

public class UserServiceImpl implements UserService{
    private UserDao userDao;
    @Override
    public void addUserService() {
        System.out.println("userService方法被调用......");
        /*UserDaoImpl userDao = new UserDaoImpl();
        userDao.addUserDao();*/
        userDao.addUserDao();
    }

    public UserDao getUserDao() {
        return userDao;
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }
}
