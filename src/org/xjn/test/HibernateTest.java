package org.xjn.test;

import java.sql.Date;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.xjn.employ.dao.IResumeDao;
import org.xjn.employ.dao.UserDemo;
import org.xjn.employ.dao.impl.CompanyDaoImpl;
import org.xjn.employ.dao.impl.ResumeDaoImpl;
import org.xjn.employ.dao.impl.UserDaoImpl;
import org.xjn.employ.entity.Resume;

public class HibernateTest {
	private ApplicationContext ctx;
	
	@Before
	public void setUp(){
		ctx = new ClassPathXmlApplicationContext("spring/applicationContext.xml");
	}

	@Test
//	@Ignore
	public void testUser() throws Exception{
		ApplicationContext ctx = new ClassPathXmlApplicationContext("spring/applicationContext.xml");
		UserDaoImpl dao = (UserDaoImpl) ctx.getBean("userDaoImpl", UserDaoImpl.class);
//		System.out.println(dao.findUser().getNickName());
//		CompanyDaoImpl dao = (CompanyDaoImpl) ctx.getBean("companyDaoImpl", CompanyDaoImpl.class);
//		System.out.println(dao.findAllJobs(1).get(0).getDescrib());
//		System.out.println(dao.findCompany(2).getDescrib());
		
//		System.out.println(dao.findAllResume(1).get(0).getAddress());
		System.out.println(dao.findAllResume(1).get(0).getMyEvaluate());
	}
	
	@Test
	@Ignore
	public void testResume() throws Exception{
		IResumeDao resumeDao = (IResumeDao) ctx.getBean("resumeDaoImpl", ResumeDaoImpl.class);
		resumeDao.saveResume(new Resume("Tom", new Date(1977, 12, 24), "California", "Hollawood", 4, "2212493208318", "13442448763", "tom@jerry.com", "movie",
				"actor", 7899.9, "umemploy", "I am a good cat, I can catch mouse", 1));
		Resume re = new Resume("Jerry", new Date(System.currentTimeMillis()), "ddd", "NorthAmerica", 10,
				"2294832839412a", "8893832783", "jerry@tom.com", "movie", "actor", 5888.8, "umemploy", "I am a bad mouse", 2);
		resumeDao.saveResume(re);
	}
}
