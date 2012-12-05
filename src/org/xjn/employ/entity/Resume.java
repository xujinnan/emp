package org.xjn.employ.entity;

import java.util.Date;

/**
 * Resume entity. @author MyEclipse Persistence Tools
 */
public class Resume extends AbstractResume implements java.io.Serializable {

	private static final long serialVersionUID = 6767078147562749197L;
	// Constructors
	/** default constructor */
	public Resume() {
	}

	/** full constructor */
	public Resume(String realName, Date birthdate, String hukou,
			String address, Integer workExp, String idCard, String mobile,
			String email, String workType, String expectJob, Double expectSal,
			String statue, String myEvaluate, User user) {
		super(realName, birthdate, hukou, address, workExp, idCard, mobile,
				email, workType, expectJob, expectSal, statue, myEvaluate, user);
	}
	
	public Resume(String realName, Date birthdate, String hukou,
			String address, Integer workExp, String idCard, String mobile,
			String email, String workType, String expectJob, Double expectSal,
			String statue, String myEvaluate, int user) {
		super(realName, birthdate, hukou, address, workExp, idCard, mobile,
				email, workType, expectJob, expectSal, statue, myEvaluate, user);
	}

}
