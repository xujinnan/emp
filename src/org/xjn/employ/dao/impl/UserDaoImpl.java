package org.xjn.employ.dao.impl;

import java.sql.SQLException;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.springframework.orm.hibernate3.HibernateCallback;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.xjn.employ.dao.IUserDao;
import org.xjn.employ.entity.Job;
import org.xjn.employ.entity.Resume;
import org.xjn.employ.entity.User;

public class UserDaoImpl extends HibernateDaoSupport implements IUserDao{

	@SuppressWarnings("unchecked")
	public List<Job> findAllAppliedJobs(final int userId) throws Exception{
		return this.getHibernateTemplate().executeFind(new HibernateCallback() {
			public Object doInHibernate(Session session) throws HibernateException,
					SQLException {
				String hql = "select u.appliedJobs from User as u where u.userId=:uid";
				return session.createQuery(hql).setInteger("uid", userId).list();
			}
		});
	}

	@SuppressWarnings("unchecked")
	public List<Resume> findAllResume(final int userId) throws Exception {
		return this.getHibernateTemplate().executeFind(new HibernateCallback() {
			public Object doInHibernate(Session session) throws HibernateException,
					SQLException {
				String hql = "from Resume as r where r.user.userId=:uid";
				return session.createQuery(hql).setInteger("uid", userId).list();
			}
		});
	}

	public User findUser(int userId) throws Exception {
		return (User)this.getHibernateTemplate().get("User", userId);
	}

	public void saveUser(User user) throws Exception {
		getHibernateTemplate().save(user);
	}

	public void updateUser(User user) throws Exception {
		getHibernateTemplate().update(user);
	}

}
