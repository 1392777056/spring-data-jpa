package com.taobao.dao;


import com.taobao.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
 * Create with www.dezhe.com
 *
 * @Author 德哲
 * @Date 2018/8/16 9:28
 */
public interface CustomerDao extends JpaRepository<Customer,Long> {



}
