package org.xjn.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.xjn.employ.dao.UserDemo;

public class HibernateTest {

	@Test
	public void testHibernate(){
		ApplicationContext ctx = new ClassPathXmlApplicationContext("spring/applicationContext.xml");
		UserDemo dao = (UserDemo) ctx.getBean("userDaoImpl", UserDemo.class);
		System.out.println(dao.findUser().getNickName());
	}
}
