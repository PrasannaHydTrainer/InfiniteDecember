package com.infinite.hib;


import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

@ManagedBean(name="eDao")
@SessionScoped
public class EmployDaoImpl implements EmployDAO {

	
	@Override
	public List<Employ> showEmployDao() {
		SessionFactory sf = SessionHelper.getConnection();
		Session session = sf.openSession();
		Query query = session.createQuery("from Employ");
		List<Employ> employList = query.list();
		return employList;
	}

}
