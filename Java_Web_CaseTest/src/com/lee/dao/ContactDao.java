package com.lee.dao;

import com.lee.domain.Contact;

import java.util.List;

/**
 * @ClassName:ContactDao
 * @Author：Mr.lee
 * @DATE：2020/01/10
 * @TIME： 10:29
 * @Description: TODO
 */
public interface ContactDao {
    Contact findLogin(Contact contact);

    boolean add(Contact contact);

    List<Contact> findAll();

    boolean delete(int id);

    Contact findContact(int id);

    boolean updateContact(Contact contact);
}
