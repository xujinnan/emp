package org.xjn.employ.web.action;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

public class BaseAction extends ActionSupport implements SessionAware,
		ServletRequestAware {

	private static final long serialVersionUID = -274637632198049857L;

	protected Map<String, Object> session;

	protected HttpServletRequest request;
	
	public String index() throws Exception{
		return "index";
	}

	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

	public void setServletRequest(HttpServletRequest request) {
		this.request = request;
	}

	

}
