package org.xjn.employ.entity;

import java.util.Set;

/**
 * Job entity. @author MyEclipse Persistence Tools
 */
public class Job extends AbstractJob implements java.io.Serializable {

	private static final long serialVersionUID = 1831471697553050301L;
	// Constructors
	/** default constructor */
	public Job() {
	}

	/** full constructor */
	public Job(String name, String exp, String education, String workType,
			Integer hireNum, String positionType, String location,
			String describ, Set<User> jobApplicants, Company company) {
		super(name, exp, education, workType, hireNum, positionType, location,
				describ, jobApplicants, company);
	}

}
