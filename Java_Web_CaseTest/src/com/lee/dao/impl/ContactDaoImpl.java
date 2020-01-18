package com.lee.dao.impl;

import com.lee.dao.ContactDao;
import com.lee.domain.Contact;
import com.lee.utils.JDBCUtil;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

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
    public int findByContactCount(Map<String, String[]> condition) {
        String sql = "select count(*) from contact where 1=1 ";
        //用来拼接动态sql
        StringBuffer sb = new StringBuffer(sql);
        //定义参数的list
        List<Object> params = new ArrayList<>();
        Set<String> set = condition.keySet();
        for (String key : set) {
            //排除分页查询的条件
            if("currentPage".equals(key) || "pageSize".equals(key)){
                    continue;
            }

            //获取到每个查询条件的name属性
            String value = condition.get(key)[0];
            if(value!=null && !"".equals(value)){
                sb.append(" and "+key+" like ?");
                params.add("%"+value+"%");
            }
        }
        System.out.println(sb.toString());
        System.out.println(params);
        return jdbcTemplate.queryForObject(sb.toString(),Integer.class,params.toArray());
    }

    @Override
    public List<Contact> findByContactPage(int start, int size, Map<String, String[]> condition) {
        String sql = "select * from contact where 1=1 ";
        StringBuffer sb = new StringBuffer(sql);
        Set<String> set = condition.keySet();
        List<Object> params = new ArrayList<>();
        for (String key : set) {
            if("currentPage".equals(key) || "pageSize".equals(key)){
                continue;
            }
            //获取到每个查询条件的name属性
            String value = condition.get(key)[0];
            if(value!=null && !"".equals(value)){
                sb.append(" and "+key+" like ?");
                params.add("%"+value+"%");
            }
        }
        //拼接分页查询
        sb.append(" limit ?,? ");
        params.add(start);
        params.add(size);
        sql = sb.toString();
        System.out.println(sql);

        return jdbcTemplate.query(sql,new BeanPropertyRowMapper<Contact>(Contact.class),params.toArray());
    }
}
