package cn.zju.dao.impl;

import cn.zju.dao.UserDao;

/**
 * @Author:Hchien Ying
 * @date:2019/8/23
 * @description:
 */
public class UserDaoOracleImpl implements UserDao {
    @Override
    public void getUser() {
        System.out.println("oracle获取用户数据");
    }
}
