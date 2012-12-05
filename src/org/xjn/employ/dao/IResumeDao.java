package org.xjn.employ.dao;

import org.xjn.employ.entity.Resume;

public interface IResumeDao {
	/**
	 * 新增简历
	 * @param resume
	 */
	void saveResume(Resume resume) throws Exception;
	
	/**
	 * 删除简历
	 * @param resumeId
	 */
	void deleteResume(int resumeId) throws Exception;
	
	/**
	 * 更改简历
	 * @param resume
	 */
	void updateResume(Resume resume) throws Exception;
	
}
