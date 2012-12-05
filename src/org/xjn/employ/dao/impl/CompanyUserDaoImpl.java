package org.xjn.employ.dao.impl;

import java.sql.SQLException;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.springframework.orm.hibernate3.HibernateCallback;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.xjn.employ.dao.ICompanyUserDao;
import org.xjn.employ.entity.Company;
import org.xjn.employ.entity.CompanyUser;

public class CompanyUserDaoImpl extends HibernateDaoSupport implements ICompanyUserDao {

	public void deleteCompanyUser(final int companyUserId) throws Exception {
		getHibernateTemplate().execute(new HibernateCallback() {
			public Object doInHibernate(Session session) throws HibernateException,
					SQLException {
				session.createSQLQuery("delete from company_user where com_user_id=:cuid").setInteger("cuid", companyUserId).executeUpdate();
				return null;
			}
		});
	}

	public CompanyUser findCompanyUser(int companyUserId) {
		return (CompanyUser)getHibernateTemplate().get(Company.class, companyUserId);
	}

	public void saveCompanyUser(CompanyUser companyUser) throws Exception {
		getHibernateTemplate().save(companyUser);
	}

	public void updateCompanyUser(CompanyUser companyUser) throws Exception {
		getHibernateTemplate().update(companyUser);
	}

}
