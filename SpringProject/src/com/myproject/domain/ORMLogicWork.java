package com.myproject.domain;

import java.io.PrintWriter;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.orm.hibernate5.HibernateTemplate;

public class ORMLogicWork {
	SessionFactory sessionFactory;
	Session session;
	HibernateTemplate template;
	ResultSet rs;
	PrintWriter out;

	public void setTemplate(HibernateTemplate template) {
		this.template = template;
	}

	public boolean insertNewUser(UserDetailsDomain udd) {
		boolean b = false;
		try {
			int result = (int) template.save(udd);
			if (result > 0)
				b = true;
			String name=udd.getName();
			

		} catch (Exception e) {
			e.printStackTrace();
		}
		return b;
	}

	public boolean insertNewUser2(UserDetailsDomain2 udd) {
		boolean b = false;
		try {
			int result = (int) template.save(udd);
			if (result > 0)
				b = true;

		} catch (Exception e) {
			e.printStackTrace();
		}
		return b;
	}
	
	
	public ArrayList viewRecords() {
		ArrayList<Object> al = new ArrayList<Object>();
		
		//String query="from test";
		al=(ArrayList) template.find("from UserDetailsDomain");
        
		return al;
		}
	
}
