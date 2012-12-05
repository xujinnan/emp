package org.xjn.employ.entity;

import java.util.HashSet;
import java.util.Set;

/**
 * AbstractJob entity provides the base persistence definition of the Job
 * entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractJob implements java.io.Serializable {

	private static final long serialVersionUID = -7372339256321982676L;
	// Fields
	private Integer jobId;
	private String name;
	private String exp;
	private String education;
	private String workType;
	private Integer hireNum;
	private String positionType;
	private String location;
	private String describ;
	/** 申请了此职位的人 */
	private Set<User> applicants = new HashSet<User>(0);
	/** 发布此职位的公司 */
	private Company company;

	// Constructors

	/** default constructor */
	public AbstractJob() {
	}

	/** full constructor */
	public AbstractJob(String name, String exp, String education,
			String workType, Integer hireNum, String positionType,
			String location, String describ, Set<User> jobApplicants, Company company) {
		this.name = name;
		this.exp = exp;
		this.education = education;
		this.workType = workType;
		this.hireNum = hireNum;
		this.positionType = positionType;
		this.location = location;
		this.describ = describ;
		this.applicants = jobApplicants;
		this.company = company;
	}

	// Property accessors

	public Integer getJobId() {
		return this.jobId;
	}

	public void setJobId(Integer jobId) {
		this.jobId = jobId;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getExp() {
		return this.exp;
	}

	public void setExp(String exp) {
		this.exp = exp;
	}

	public String getEducation() {
		return this.education;
	}

	public void setEducation(String education) {
		this.education = education;
	}

	public String getWorkType() {
		return this.workType;
	}

	public void setWorkType(String workType) {
		this.workType = workType;
	}

	public Integer getHireNum() {
		return this.hireNum;
	}

	public void setHireNum(Integer hireNum) {
		this.hireNum = hireNum;
	}

	public String getPositionType() {
		return this.positionType;
	}

	public void setPositionType(String positionType) {
		this.positionType = positionType;
	}

	public String getLocation() {
		return this.location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getDescrib() {
		return this.describ;
	}

	public void setDescrib(String describ) {
		this.describ = describ;
	}

	public Set<User> getApplicants() {
		return this.applicants;
	}

	public void setApplicants(Set<User> jobApplicants) {
		this.applicants = jobApplicants;
	}

	public Company getCompany() {
		return company;
	}

	public void setCompany(Company company) {
		this.company = company;
	}

}