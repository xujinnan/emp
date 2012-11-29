package org.xjn.employ.web.action;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TestAction extends BaseAction{

	private static final long serialVersionUID = 8389255392957429205L;

	private String myStr;
	
	public String execute(){
//		System.out.println(System.currentTimeMillis());
		myStr = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
		return "ok";
	}

	public String getMyStr() {
		return myStr;
	}

	public void setMyStr(String myStr) {
		this.myStr = myStr;
	}
	
}
