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
	public List<Job> findAllApplicantsOfOneJob(final int jobId) throws Exception {
		return getHibernateTemplate().executeFind(new HibernateCallback() {
			public Object doInHibernate(Session session) throws HibernateException,
					SQLException {
				String hql = "select j.applicants from Job as j where j.jobId=:uid";
				return session.createQuery(hql).setInteger("uid", jobId).list();
			}
		});
	}

	public Job findJobById(int jobId) throws Exception {
		return (Job) getHibernateTemplate().get(Job.class, jobId);
	}

	@SuppressWarnings("unchecked")
	public List<Job> findJobsByCompanyId(final int companyId) throws Exception {
		return this.getHibernateTemplate().executeFind(new HibernateCallback() {
			public Object doInHibernate(Session session) throws HibernateException,
					SQLException {
				String hql = "select c.companyJobs from Company as c where c.companyId=:cid";
				return session.createQuery(hql).setInteger("cid", companyId).list();
			}
		});
	}

	@SuppressWarnings("unchecked")
	public List<Job> findJobsByCompanyName(final String companyName) throws Exception {
		return getHibernateTemplate().executeFind(new HibernateCallback() {
			public Object doInHibernate(Session session) throws HibernateException,
					SQLException {
				String hql = "select c.companyJobs from Company as c where c.name like '%:name%'";
				return session.createQuery(hql).setString("name", companyName).list();
			}
		});
	}

	@SuppressWarnings("unchecked")
	public List<Job> findJobsByKeyWord(final String keyWord) throws Exception {
		return getHibernateTemplate().executeFind(new HibernateCallback() {
			public Object doInHibernate(Session session) throws HibernateException,SQLException {
				String hql = "from Job as j where j.name like :key or j.describ like :key";
				return session.createQuery(hql).setString("key", "%"+keyWord+"%").list();
			}
		});
	}

	@SuppressWarnings("unchecked")
	public List<Job> findJobsByName(final String jobName) throws Exception {
		return getHibernateTemplate().executeFind(new HibernateCallback() {
			public Object doInHibernate(Session session) throws HibernateException,
					SQLException {
				String hql = "from Job as j where j.name like :key";
				return session.createQuery(hql).setString("key", "%"+jobName+"%").list();
			}
		});
	}

	public void saveJob(Job job) throws Exception {
		getHibernateTemplate().save(job);
	}

	public void updateJob(Job job) throws Exception {
		getHibernateTemplate().update(job);
	}
	
}
