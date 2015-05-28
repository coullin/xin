/**
 * 
 */
package com.xin.dao;

import org.springframework.stereotype.Repository;

import com.xin.model.User;
import com.xin.orm.hibernate.HibernateDao;

/**
 * @author zhouxin
 *
 */
@Repository
@SuppressWarnings("unchecked")
public class UserDaoImpl extends HibernateDao<User, Long> implements UserDao {

}
