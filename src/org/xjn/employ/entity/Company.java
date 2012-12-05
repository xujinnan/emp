package org.xjn.employ.entity;

import java.util.Set;

/**
 * Company entity. @author MyEclipse Persistence Tools
 */
public class Company extends AbstractCompany implements java.io.Serializable {

	private static final long serialVersionUID = 5647070383813193910L;
	// Constructors
	/** default constructor */
	public Company() {
	}

	/** full constructor */
	public Company(String name, String kind, String scale, String bizType,
			String tel, String address, String describ, Set<Job> companyJobs) {
		super(name, kind, scale, bizType, tel, address, describ, companyJobs);
	}

}
