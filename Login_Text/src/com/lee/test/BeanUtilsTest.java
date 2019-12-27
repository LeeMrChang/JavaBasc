package com.lee.test;

import com.lee.domain.User;
import org.apache.commons.beanutils.BeanUtils;

import java.lang.reflect.InvocationTargetException;

/**
 * @ClassName:BeanUtilsTest
 * @Author：Mr.lee
 * @DATE：2019/12/27
 * @TIME： 17:18
 * @Description: TODO
 */
public class BeanUtilsTest {
    public static void main(String[] args) {

        User user = new User();

        try {
            BeanUtils.setProperty(user,"username","liuqianfdong");
            String username = BeanUtils.getProperty(user, "username");
            System.out.println(username);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
    }
}
