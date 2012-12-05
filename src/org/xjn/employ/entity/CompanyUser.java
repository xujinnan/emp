package org.xjn.employ.entity;

/**
 * CompanyUser entity. @author MyEclipse Persistence Tools
 */
public class CompanyUser extends AbstractCompanyUser implements
		java.io.Serializable {

	private static final long serialVersionUID = 5969446168494963468L;
	// Constructors
	/** default constructor */
	public CompanyUser() {
	}

	/** minimal constructor */
	public CompanyUser(String username, String pwd) {
		super(username, pwd);
	}

	/** full constructor */
	public CompanyUser(Company company, String username, String pwd) {
		super(company, username, pwd);
	}

}
