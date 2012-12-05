package org.xjn.employ.entity;


/**
 * User entity. @author MyEclipse Persistence Tools
 */
public class User extends AbstractUser implements java.io.Serializable {

	private static final long serialVersionUID = -505620370587393044L;

	/** default constructor */
	public User() {
	}

	/** minimal constructor */
	public User(String username, String email, String pwd) {
		super(username, email, pwd);
	}

	/** full constructor */
	public User(String username, String realName, String email, String pwd) {
		super(username, realName, email, pwd);
	}

}
