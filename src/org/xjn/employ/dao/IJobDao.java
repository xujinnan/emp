package org.xjn.employ.dao;

import java.util.List;

import org.xjn.employ.entity.Job;

public interface IJobDao {
	
	/**
	 * 保存职位
	 * @param job
	 */
	void saveJob(Job job) throws Exception;
	
	/**
	 * 删除一个职位
	 * @param jobId
	 */
	void deleteJobById(int jobId) throws Exception;
	
	/**
	 * 更新职位信息
	 * @param job
	 */
	void updateJob(Job job) throws Exception;
	
	/**
	 * 根据ID查找职位
	 * @param jobId
	 * @return
	 */
	Job findJobById(int jobId) throws Exception;
	
	/**
	 * 查找某公司发布的所有职位
	 * @param companyId
	 * @return
	 */
	List<Job> findJobsByCompanyId(int companyId) throws Exception;
	
	/**
	 * 根据职位名称查找
	 * @param jobName 职位名称
	 * @return
	 */
	List<Job> findJobsByName(String jobName) throws Exception;
	
	/**
	 * 根据关键名查找职位
	 * @param keyWord 关键字
	 * @return
	 */
	List<Job> findJobsByKeyWord(String keyWord) throws Exception;
	
	/**
	 * 根据公司名称查找职位
	 * @param companyName
	 * @return
	 */
	List<Job> findJobsByCompanyName(String companyName) throws Exception;
	
	/**
	 * 申请一个职位
	 * @param userId 申请者(用户)的ID
	 * @param jobId 职位的ID
	 */
	void applyJob(int userId, int jobId) throws Exception;
	
	/**
	 * 查找此职位的所有申请者
	 * @param jobId
	 * @return
	 */
	List<Job> findAllApplicantsOfOneJob(int jobId) throws Exception;
}
