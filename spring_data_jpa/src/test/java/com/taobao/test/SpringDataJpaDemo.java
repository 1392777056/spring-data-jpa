package com.taobao.test;

import com.taobao.entity.Customer;
import com.taobao.service.CustomerService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.persistence.criteria.*;

/**
 * Create with www.dezhe.com
 *
 * @Author 德哲
 * @Date 2018/8/16 10:15
 */

/**
 *  使用specification 完成查询条件  应该也要实现 里面有好多查询条件
 *
 *  构造分页参数
 * Pageable : 接口
 * PageRequest 实现了 Pageable 接口，调用构造方法的形式构造
 * 第一个参数：页码（从 0 开始）
 * 第二个参数：每页查询条数，封装为 Spring Data Jpa 内部的 page bean
 * 此重载的 findAll 方法为分页方法需要两个参数
 * 第一个参数：查询条件 Specification
 * 第二个参数：分页参数
 *
 * //Join 代表链接查询，通过 root 对象获取
 //创建的过程中，第一个参数为关联对象的属性名称，第二个参数为连接查询的方式（left，
 inner， right）
 //JoinType.LEFT : 左外连接,JoinType.INNER：内连接,JoinType.RIGHT：右外连接
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:spring-data-jpa.xml")
public class SpringDataJpaDemo {

    @Autowired
    private CustomerService customerService;

    @Test
    public void sava() {

        Customer customer = new Customer();

        customer.setCustName("张三金牌店");

        customerService.save(customer);

       /* Specification<Customer> specification = new Specification<Customer>() {
            public Predicate toPredicate(Root<Customer> root, CriteriaQuery<?> criteriaQuery, CriteriaBuilder criteriaBuilder) {

                Join 代表链接查询，通过 root 对象获取
//创建的过程中，第一个参数为关联对象的属性名称，第二个参数为连接查询的方式（left，
                inner， right）
//JoinType.LEFT : 左外连接,JoinType.INNER：内连接,JoinType.RIGHT：右外连接*//*
                root.join("custmer", JoinType.INNER);

                return null;
            }
        };*/
    }

}
