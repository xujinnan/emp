package org.xjn.employ.entity;

/**
 * AbstractCompanyUser entity provides the base persistence definition of the
 * CompanyUser entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractCompanyUser implements java.io.Serializable {

	private static final long serialVersionUID = -217041657040557823L;
	// Fields
	private Integer comUserId;
	private Company company;
	private String username;
	private String pwd;

	// Constructors

	/** default constructor */
	public AbstractCompanyUser() {
	}

	/** minimal constructor */
	public AbstractCompanyUser(String username, String pwd) {
		this.username = username;
		this.pwd = pwd;
	}

	/** full constructor */
	public AbstractCompanyUser(Company company, String username, String pwd) {
		this.company = company;
		this.username = username;
		this.pwd = pwd;
	}

	// Property accessors

	public Integer getComUserId() {
		return this.comUserId;
	}

	public void setComUserId(Integer comUserId) {
		this.comUserId = comUserId;
	}

	public Company getCompany() {
		return this.company;
	}

	public void setCompany(Company company) {
		this.company = company;
	}

	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPwd() {
		return this.pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

}