package org.xjn.employ.dao;

import java.sql.SQLException;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.springframework.orm.hibernate3.HibernateCallback;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.xjn.employ.entity.TestUser;

public class UserDemo extends HibernateDaoSupport{
	
	public TestUser findUser(){
		return (TestUser) this.getHibernateTemplate().execute(new HibernateCallback() {
			public Object doInHibernate(Session session) throws HibernateException,
					SQLException {
				return session.get(TestUser.class, 1);
			}
		});
	}
}
