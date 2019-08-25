package cn.zju.test;

import cn.zju.dao.impl.UserDaoMysqlImpl;
import cn.zju.dao.impl.UserDaoOracleImpl;
import cn.zju.service.UserService;
import cn.zju.service.impl.UserServiceImpl;

/**
 * @Author:Hchien Ying
 * @date:2019/8/23
 * @description:
 */
public class Test {
    public static void main(String[] args) {
        UserServiceImpl userService = new UserServiceImpl();
        userService.setUserDao(new UserDaoMysqlImpl());
        userService.getUser();
        System.out.println("-----------------");
        userService.setUserDao(new UserDaoOracleImpl());
        userService.getUser();
    }
}
