package com.JDKproxy;

public interface User {
    /**
     * 登录
     * @param username 用户名
     * @param pwd 密码
     * @return
     */
    public boolean login(String username, String pwd);

    /**
     * 退出
     */
    public void logout(String username);
}
