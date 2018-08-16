package com.taobao.service.impl;

import com.taobao.dao.CustomerDao;
import com.taobao.entity.Customer;
import com.taobao.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Create with www.dezhe.com
 *
 * @Author 德哲
 * @Date 2018/8/16 10:11
 */
@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private CustomerDao customerDao;

    public void save(Customer customer) {
        customerDao.save(customer);
    }
}
