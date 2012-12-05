package org.xjn.employ.entity;

import java.util.HashSet;
import java.util.Set;

/**
 * AbstractUser entity provides the base persistence definition of the User
 * entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractUser implements java.io.Serializable {

	private static final long serialVersionUID = 6040908330027592192L;
	// Fields
	private Integer userId;
	private String username;
	private String realName;
	private String email;
	private String pwd;
	/** 所有已经申请了的职位（已经投了简历的） */
	private Set<Job> appliedJobs = new HashSet<Job>(0);
	/** 此用户的所有简历 */
	private Set<Resume> resumes = new HashSet<Resume>(0);

	// Constructors

	/** default constructor */
	public AbstractUser() {
	}

	/** minimal constructor */
	public AbstractUser(String username, String email, String pwd) {
		this.username = username;
		this.email = email;
		this.pwd = pwd;
	}

	/** full constructor */
	public AbstractUser(String username, String realName, String email,
			String pwd) {
		this.username = username;
		this.realName = realName;
		this.email = email;
		this.pwd = pwd;
	}

	// Property accessors

	public Integer getUserId() {
		return this.userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getRealName() {
		return this.realName;
	}

	public void setRealName(String realName) {
		this.realName = realName;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPwd() {
		return this.pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public Set<Job> getAppliedJobs() {
		return this.appliedJobs;
	}

	public void setAppliedJobs(Set<Job> appliedJobs) {
		this.appliedJobs = appliedJobs;
	}

	public Set<Resume> getResumes() {
		return resumes;
	}

	public void setResumes(Set<Resume> resumes) {
		this.resumes = resumes;
	}

}