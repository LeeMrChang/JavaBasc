package com.lee.service;

import com.lee.domain.Contact;

import java.util.List;

/**
 * @ClassName:ContactService
 * @Author：Mr.lee
 * @DATE：2020/01/10
 * @TIME： 10:16
 * @Description: TODO
 */
public interface ContactService {


    Contact findLogin(Contact contact);

    boolean addContact(Contact contact);

    List<Contact> findAll();

    boolean delete(String id);


    Contact findContact(String id);

    boolean updateContact(Contact contact);
}
