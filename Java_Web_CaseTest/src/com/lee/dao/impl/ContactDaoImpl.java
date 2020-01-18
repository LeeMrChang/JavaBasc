package com.lee.dao.impl;

import com.lee.dao.ContactDao;
import com.lee.domain.Contact;
import com.lee.utils.JDBCUtil;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import java.util.List;

/**
 * @ClassName:ContactDaoImpl
 * @Author：Mr.lee
 * @DATE：2020/01/10
 * @TIME： 10:29
 * @Description: TODO
 */
public class ContactDaoImpl implements ContactDao {

    private JdbcTemplate jdbcTemplate = new JdbcTemplate(JDBCUtil.getDataSource());

    @Override
    public Contact findLogin(Contact contact) {
        String sql = "select * from contact where username=? and password = ?";

        try {
            Contact query = jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper<>(Contact.class),
                    contact.getUsername(), contact.getPassword());
            return query;
        } catch (DataAccessException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public boolean add(Contact contact) {
        String sql = "insert into contact (id,username,sex,age,address,qq,email,password) values (null,?,?,?,?,?,?,null)";
        int count = jdbcTemplate.update(sql, contact.getUsername(), contact.getSex(), contact.getAge(),
                contact.getAddress(), contact.getQq(), contact.getEmail());
        if (count > 0) {
            return true;
        }
        return false;
    }

    @Override
    public List<Contact> findAll() {
        String sql = "select * from contact";
        List<Contact> contacts = null;
        try {
            contacts = jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(Contact.class));
            return contacts;
        } catch (DataAccessException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public boolean delete(int id) {
        String sql = "delete from contact where id=?";
        int isDelete = jdbcTemplate.update(sql, id);
        if (isDelete > 0) {
            return true;
        }
        return false;
    }


    @Override
    public Contact findContact(int id) {
        String sql = "select * from contact where id=?";
        try {
            Contact contact = jdbcTemplate.queryForObject(
                    sql, new BeanPropertyRowMapper<>(Contact.class), id);
            return contact;
        } catch (DataAccessException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public boolean updateContact(Contact contact) {
        String sql = "update contact set username=?,sex=?,age=?,address=?,qq=?,email=? where id=?";

       int count = jdbcTemplate.update(sql,contact.getUsername(),contact.getSex(),contact.getAge(),
               contact.getAddress(),contact.getQq(),contact.getEmail(),contact.getId());
       if(count>0){
           return true;
       }
       return false;
    }

    @Override
    public int findByContactCount() {
        String sql = "select count(*) from contact";
        return jdbcTemplate.queryForObject(sql,Integer.class);
    }

    @Override
    public List<Contact> findByContactPage(int start, int size) {
        String sql = "select * from contact limit ?,?";
        return jdbcTemplate.query(sql,new BeanPropertyRowMapper<Contact>(Contact.class),start,size);
    }
}
