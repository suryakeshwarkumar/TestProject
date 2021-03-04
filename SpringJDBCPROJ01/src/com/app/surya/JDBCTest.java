package com.app.surya;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class JDBCTest {

	public static void main(String[] args) {
  ApplicationContext ac=new ClassPathXmlApplicationContext("com/app/surya/beans.xml");
  
         JdbcTemplate jd=(JdbcTemplate) ac.getBean("jt");
         String sql="insert into student values(?,?,?,?)";
         int count=jd.update(sql,321,"raja","spring",2.3);
         System.out.println(count);
	}

}
