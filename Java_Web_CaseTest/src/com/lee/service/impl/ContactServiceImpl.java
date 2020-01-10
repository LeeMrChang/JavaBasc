package com.lee.service.impl;

import com.lee.dao.ContactDao;
import com.lee.dao.impl.ContactDaoImpl;
import com.lee.domain.Contact;
import com.lee.service.ContactService;

import java.util.List;

/**
 * @ClassName:ContactServiceImpl
 * @Author：Mr.lee
 * @DATE：2020/01/10
 * @TIME： 10:17
 * @Description: TODO
 */
public class ContactServiceImpl implements ContactService {

    private ContactDao contactDao = new ContactDaoImpl();

    @Override
    public Contact findLogin(Contact contact) {
        return contactDao.findLogin(contact);
    }

    @Override
    public boolean addContact(Contact contact) {
        return contactDao.add(contact);
    }

    @Override
    public List<Contact> findAll() {
        return contactDao.findAll();
    }

    @Override
    public boolean delete(String id) {
        return contactDao.delete(Integer.parseInt(id));
    }


    @Override
    public Contact findContact(String id) {
        return contactDao.findContact(Integer.parseInt(id));
    }

    @Override
    public boolean updateContact(Contact contact) {
        return contactDao.updateContact(contact);
    }
}
