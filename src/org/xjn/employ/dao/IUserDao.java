package org.xjn.employ.dao;

import java.util.List;

import org.xjn.employ.entity.Job;
import org.xjn.employ.entity.Resume;
import org.xjn.employ.entity.User;

public interface IUserDao {
	/**
	 * 查找用户
	 * @param userId
	 * @return
	 */
	User findUser(int userId) throws Exception;
	
	/**
	 * 保存(新增)用户
	 * @param user
	 */
	void saveUser(User user) throws Exception;
	
	/**
	 * 更新用户信息
	 * @param user
	 */
	void updateUser(User user) throws Exception;
	
	/**
	 * 查找用户的所有简历
	 * @param userId
	 * @return
	 */
	List<Resume> findAllResume(int userId) throws Exception;
	
	/**
	 * 查找用户所申请的所有职位
	 * @param userId
	 * @return
	 */
	List<Job> findAllAppliedJobs(int userId) throws Exception;
	
	
}
