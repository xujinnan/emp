package org.xjn.employ.dao.impl;

import java.sql.SQLException;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.springframework.orm.hibernate3.HibernateCallback;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.xjn.employ.dao.IJobDao;
import org.xjn.employ.entity.Job;

public class JobDaoImpl extends HibernateDaoSupport implements IJobDao{

	public void applyJob(final int userId, final int jobId) throws Exception {
		getHibernateTemplate().execute(new HibernateCallback() {
			public Object doInHibernate(Session session) throws HibernateException,
					SQLException {
				String sql = "insert into job_app(user, job) values(:user,:job)";
				session.createSQLQuery(sql).setInteger("user", userId).setInteger("job", jobId).executeUpdate();
				return null;
			}
		});
	}

	public void deleteJobById(final int jobId) throws Exception {
		getHibernateTemplate().execute(new HibernateCallback() {
			public Object doInHibernate(Session session) throws HibernateException,
					SQLException {
				String sql = "delete from job where job_id=:jid";
				session.createSQLQuery(sql).setInteger("jid", jobId).executeUpdate();
				return null;
			}
		});
	}

	@SuppressWarnings("unchecked")
	public List<Job> findAllAppliedJobs(final int userId) throws Exception {
		return getHibernateTemplate().executeFind(new HibernateCallback() {
			public Object doInHibernate(Session session) throws HibernateException,
					SQLException {
				String hql = "select u.appliedJobs from User as u where u.userId=:uid";
				return session.createQuery(hql).setInteger("uid", userId).list();
			}
		});
	}

	public Job findJobById(int jobId) throws Exception {
		getHibernateTemplate().execute(new HibernateCallback() {
			public Object doInHibernate(Session session) throws HibernateException,
					SQLException {
				// TODO Auto-generated method stub
				return null;
			}
		});
		return null;
	}

	public List<Job> findJobsByCompanyId(int companyId) throws Exception {
		getHibernateTemplate().execute(new HibernateCallback() {
			public Object doInHibernate(Session session) throws HibernateException,
					SQLException {
				// TODO Auto-generated method stub
				return null;
			}
		});
		return null;
	}

	public List<Job> findJobsByCompanyName(String companyName) throws Exception {
		getHibernateTemplate().execute(new HibernateCallback() {
			public Object doInHibernate(Session session) throws HibernateException,
					SQLException {
				// TODO Auto-generated method stub
				return null;
			}
		});
		return null;
	}

	public List<Job> findJobsByKeyWord(String keyWord) throws Exception {
		getHibernateTemplate().execute(new HibernateCallback() {
			public Object doInHibernate(Session session) throws HibernateException,
					SQLException {
				// TODO Auto-generated method stub
				return null;
			}
		});
		return null;
	}

	public List<Job> findJobsByName(String jobName) throws Exception {
		getHibernateTemplate().execute(new HibernateCallback() {
			public Object doInHibernate(Session session) throws HibernateException,
					SQLException {
				// TODO Auto-generated method stub
				return null;
			}
		});
		return null;
	}

	public void saveJob(Job job) throws Exception {
		// TODO Auto-generated method stub
		
	}

	public void updateJob(Job job) throws Exception {
		// TODO Auto-generated method stub
		
	}
	
}
