package cn.zju.service.impl;

import cn.zju.dao.UserDao;
import cn.zju.dao.impl.UserDaoOracleImpl;
import cn.zju.service.UserService;

/**
 * @Author:Hchien Ying
 * @date:2019/8/23
 * @description:
 */
public class UserServiceImpl implements UserService {
    private UserDao userDao = null;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void getUser() {
        userDao.getUser();
    }
}
