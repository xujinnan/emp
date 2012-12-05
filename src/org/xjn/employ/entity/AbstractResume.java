package org.xjn.employ.entity;

import java.util.Date;

/**
 * AbstractResume entity provides the base persistence definition of the Resume
 * entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractResume implements java.io.Serializable {

	private static final long serialVersionUID = 3998892689976279132L;
	// Fields
	private Integer resumeId;
	private String realName;
	private Date birthdate;
	private String hukou;
	private String address;
	private Integer workExp;
	private String idCard;
	private String mobile;
	private String email;
	private String workType;
	private String expectJob;
	private Double expectSal;
	private String statue;
	private String myEvaluate;
	/** 这份简历对应的用户 */
	private User user;

	// Constructors

	/** default constructor */
	public AbstractResume() {
	}

	/** full constructor */
	public AbstractResume(String realName, Date birthdate, String hukou,
			String address, Integer workExp, String idCard, String mobile,
			String email, String workType, String expectJob, Double expectSal,
			String statue, String myEvaluate, User user) {
		this.realName = realName;
		this.birthdate = birthdate;
		this.hukou = hukou;
		this.address = address;
		this.workExp = workExp;
		this.idCard = idCard;
		this.mobile = mobile;
		this.email = email;
		this.workType = workType;
		this.expectJob = expectJob;
		this.expectSal = expectSal;
		this.statue = statue;
		this.myEvaluate = myEvaluate;
		this.user = user;
	}
	
	public AbstractResume(String realName, Date birthdate, String hukou,
			String address, Integer workExp, String idCard, String mobile,
			String email, String workType, String expectJob, Double expectSal,
			String statue, String myEvaluate, int user) {
		this.realName = realName;
		this.birthdate = birthdate;
		this.hukou = hukou;
		this.address = address;
		this.workExp = workExp;
		this.idCard = idCard;
		this.mobile = mobile;
		this.email = email;
		this.workType = workType;
		this.expectJob = expectJob;
		this.expectSal = expectSal;
		this.statue = statue;
		this.myEvaluate = myEvaluate;
		User u = new User();
		u.setUserId(user);
		this.user = u;
	}

	// Property accessors

	public Integer getResumeId() {
		return this.resumeId;
	}

	public void setResumeId(Integer resumeId) {
		this.resumeId = resumeId;
	}

	public String getRealName() {
		return this.realName;
	}

	public void setRealName(String realName) {
		this.realName = realName;
	}

	public Date getBirthdate() {
		return this.birthdate;
	}

	public void setBirthdate(Date birthdate) {
		this.birthdate = birthdate;
	}

	public String getHukou() {
		return this.hukou;
	}

	public void setHukou(String hukou) {
		this.hukou = hukou;
	}

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Integer getWorkExp() {
		return this.workExp;
	}

	public void setWorkExp(Integer workExp) {
		this.workExp = workExp;
	}

	public String getIdCard() {
		return this.idCard;
	}

	public void setIdCard(String idCard) {
		this.idCard = idCard;
	}

	public String getMobile() {
		return this.mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getWorkType() {
		return this.workType;
	}

	public void setWorkType(String workType) {
		this.workType = workType;
	}

	public String getExpectJob() {
		return this.expectJob;
	}

	public void setExpectJob(String expectJob) {
		this.expectJob = expectJob;
	}

	public Double getExpectSal() {
		return this.expectSal;
	}

	public void setExpectSal(Double expectSal) {
		this.expectSal = expectSal;
	}

	public String getStatue() {
		return this.statue;
	}

	public void setStatue(String statue) {
		this.statue = statue;
	}

	public String getMyEvaluate() {
		return this.myEvaluate;
	}

	public void setMyEvaluate(String myEvaluate) {
		this.myEvaluate = myEvaluate;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

}