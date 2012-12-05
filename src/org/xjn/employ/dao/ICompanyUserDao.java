package org.xjn.employ.dao;

import org.xjn.employ.entity.CompanyUser;

public interface ICompanyUserDao {
	
	/**
	 * 保存企业用户
	 * @param companyUser
	 */
	void saveCompanyUser(CompanyUser companyUser) throws Exception;
	
	/**
	 * 删除企业用户
	 * @param companyUserId
	 */
	void deleteCompanyUser(int companyUserId) throws Exception;
	
	/**
	 * 更新企业用户
	 * @param companyUser
	 */
	void updateCompanyUser(CompanyUser companyUser) throws Exception;
	
	/**
	 * 查找企业用户
	 * @param companyUser
	 */
	CompanyUser findCompanyUser(int companyUserId);
	
}
