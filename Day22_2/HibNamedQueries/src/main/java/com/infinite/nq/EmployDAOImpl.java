package com.infinite.nq;

import java.util.List;
import java.util.Map;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

@ManagedBean(name="eDao")
@SessionScoped

public class EmployDAOImpl implements EmployDAO {

	@Override
	public List<Employ> showEmployDao() {
		SessionFactory sf = SessionHelper.getConnection();
  	    Session session=sf.openSession();  
		Query query = session.getNamedQuery("showEmploy");
		List<Employ> employList = query.list();
		return employList;
	}

	@Override
	public String searchEmployDao(int empno) {
		Map<String,Object> sessionMap = 
				FacesContext.getCurrentInstance().getExternalContext().getSessionMap();		

		SessionFactory sf = SessionHelper.getConnection();
  	    Session session=sf.openSession();  
  	    Query query = session.getNamedQuery("searchEmploy");
		query.setParameter("empno",empno);   
		Employ employ = (Employ)query.uniqueResult();
        sessionMap.put("editEmploy", employ);
		return "UpdateEmploy.xhtml?faces-redirect=true";
	}

	@Override
	public String validateMe(Login login) {
		Map<String,Object> sessionMap = 
				FacesContext.getCurrentInstance().getExternalContext().getSessionMap();		
		SessionFactory sf = SessionHelper.getConnection();
  	    Session session=sf.openSession();  
  	    Query query = session.getNamedQuery("validate");
		query.setParameter("passCode",EntryptPassword.getCode(login.getPassCode().trim()));  
		query.setParameter("userName", login.getUserName());
		List<Login> loginList = query.list();
		System.out.println("Records are " +loginList.size());
		if (loginList.size()==1) {
			return "EmployShow.xhtml?faces-redirect=true";			
		} else {
			sessionMap.put("error", "Invalid Credentials...");
			return "Login.xhtml?faces-redirect=true";
		}

	}

}
