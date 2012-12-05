package org.xjn.employ.dao.impl;

import java.sql.SQLException;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.springframework.orm.hibernate3.HibernateCallback;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.xjn.employ.dao.ICompanyDao;
import org.xjn.employ.entity.Company;
import org.xjn.employ.entity.Job;

public class CompanyDaoImpl extends HibernateDaoSupport implements ICompanyDao{

	@SuppressWarnings("unchecked")
	public List<Job> findAllJobs(final int companyId) {
		return this.getHibernateTemplate().executeFind(new HibernateCallback() {
			public Object doInHibernate(Session session) throws HibernateException,
					SQLException {
				String hql = "select c.companyJobs from Company as c where c.companyId=:cid";
				return session.createQuery(hql).setInteger("cid", companyId).list();
			}
		});
	}

	public Company findCompany(final int companyId) {
		return (Company) this.getHibernateTemplate().execute(new HibernateCallback() {
			public Object doInHibernate(Session session) throws HibernateException,
					SQLException {
				return session.get(Company.class, companyId);
			}
		});
	}

	public void saveCompany(Company company) throws Exception {
		getHibernateTemplate().save(company);
	}

	public void updateCompany(Company company) throws Exception {
		getHibernateTemplate().update(company);
	}
	
}
