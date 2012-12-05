package org.xjn.employ.dao.impl;

import java.sql.SQLException;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.springframework.orm.hibernate3.HibernateCallback;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.xjn.employ.dao.IResumeDao;
import org.xjn.employ.entity.Resume;

public class ResumeDaoImpl extends HibernateDaoSupport implements IResumeDao {

	public void deleteResume(final int resumeId)  throws Exception{
		getHibernateTemplate().execute(new HibernateCallback() {
			public Object doInHibernate(Session session) throws HibernateException,
					SQLException {
				String sql = "delete from resume where resume_id=?";
				session.createSQLQuery(sql).setInteger(1, resumeId).executeUpdate();
				return null;
			}
		});
	}

	public void saveResume(Resume resume) {
		this.getHibernateTemplate().save(resume);
	}

	public void updateResume(Resume resume) {
		getHibernateTemplate().update(resume);
	}

}
