package org.xjn.employ.dao;

import java.util.List;

import org.xjn.employ.entity.Company;
import org.xjn.employ.entity.Job;


public interface ICompanyDao {
	/**
	 * 查询此公司发布的所有职业
	 * @param companyId 公司的ID
	 * @return
	 */
	List<Job> findAllJobs(int companyId) throws Exception;
	
	/**
	 * 查找一个公司
	 * @param companyId 公司的ID
	 * @return
	 */
	Company findCompany(int companyId) throws Exception;
	
	/**
	 * 保存公司信息
	 * @param company
	 * @throws Exception
	 */
	void saveCompany(Company company) throws Exception;
	
	/**
	 * 更新公司信息
	 * @param company
	 * @throws Exception
	 */
	void updateCompany(Company company) throws Exception;
}
