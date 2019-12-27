package com.lee.test;

import com.lee.dao.UserDao;
import com.lee.domain.User;
import org.junit.Test;

/**
 * @ClassName:LoginText
 * @Author：Mr.lee
 * @DATE：2019/12/27
 * @TIME： 16:13
 * @Description: TODO
 */
public class LoginText {

    @Test
    public void loginText(){
        User user = new User();
        user.setUsername("zhangsan");
        user.setPassword("123");

        UserDao dao = new UserDao();
        User user1 = dao.login(user);
        System.out.println(user1);
    }
}
