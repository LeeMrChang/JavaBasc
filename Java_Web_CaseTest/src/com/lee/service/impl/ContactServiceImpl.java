package com.lee.service.impl;

import com.lee.dao.ContactDao;
import com.lee.dao.impl.ContactDaoImpl;
import com.lee.domain.Contact;
import com.lee.domain.PageBean;
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

    @Override
    public void deleteUids(String[] uids) {
        if(uids!=null && uids.length>0){
            for (String s : uids) {
                contactDao.delete(Integer.parseInt(s));
            }
        }
    }

    /**
     * 分页查询
     * @param currentPage
     * @param pageSize
     * @return
     */
    @Override
    public PageBean<Contact> findByPageContact(String currentPage, String pageSize) {
        int parseInt = Integer.parseInt(currentPage);
        int size = Integer.parseInt(pageSize);
        if(parseInt<=0){
            parseInt = 1;
        }
        PageBean<Contact> pageBean = new PageBean<>();
        //1、查询总记录数
        int count = contactDao.findByContactCount();
        pageBean.setTotalCount(count);
        //2、设置参数,当前页码，每页显示条数
        pageBean.setCurrentPage(parseInt);
        pageBean.setPageSize(size);
        //3、查询每页要展示的数据
        int start = (parseInt-1)*size;
        List<Contact> list = contactDao.findByContactPage(start,size);
        pageBean.setBean(list);
        //4、总页码=总记录数/每页展示条数
        int pa = (count % size) == 0 ? count/size : (count/size)+1;
        pageBean.setTotalPage(pa);
        return pageBean;
    }
}
