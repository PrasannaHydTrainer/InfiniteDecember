package com.infinite.cms;

import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

@ManagedBean(name="rDao")
@SessionScoped
public class RestaurantDAOImpl implements RestaurantDAO {

	@Override
	public List<Restaurant> showRestaurantDao() {
		SessionFactory sf = SessionHelper.getConnection();
		Session session = sf.openSession();
		Criteria cr = session.createCriteria(Restaurant.class);
		List<Restaurant> rlist = cr.list();
		return rlist;
	}
}
