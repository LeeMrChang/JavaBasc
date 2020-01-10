package com.lee.dao;

import com.lee.domain.User;
import com.lee.uitls.JDBCUtil;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 * @ClassName:UserDao
 * @Author：Mr.lee
 * @DATE：2019/12/27
 * @TIME： 16:09
 * @Description: TODO
 */
public class UserDao {

    private JdbcTemplate template = new JdbcTemplate(JDBCUtil.getDataSource());
    /**
     * 登录校验方法JDBCUtil
     */
    public User login(User user) {
        String sql = "select * from user where username=? and password = ?";
        try {
            User user1 = template.queryForObject(sql, new BeanPropertyRowMapper<>(User.class),
                    user.getUsername(), user.getPassword());
            return user1;
        } catch (DataAccessException e) {
            e.printStackTrace();
            return null;
        }
    }
}
