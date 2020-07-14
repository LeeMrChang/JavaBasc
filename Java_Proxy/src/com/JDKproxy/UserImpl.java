package com.JDKproxy;

public class UserImpl implements User {
    @Override
    public boolean login(String username, String pwd) {
        // 简化问题，直接登录成功
        System.out.println(username+" 登录成功.");
        return true;
    }

    @Override
    public void logout(String username) {
        System.out.println(username+" 登录失败.");
    }
}
