package com.infinite.hib;

import java.util.List;
import java.util.Scanner;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

public class EmployDelete {
	public static void main(String[] args) {
		int empno;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Employ No ");
		empno = sc.nextInt();
		SessionFactory sf = 
				new AnnotationConfiguration().configure().buildSessionFactory();
			Session session = sf.openSession();
		Query query = session.createQuery("from Employ where empno="+empno);
		List<Employ> employList = query.list();
		if (employList.size()==0) {
			System.out.println("Record Not Found...");
		} else {
			Employ employ = employList.get(0);
			Transaction t = session.beginTransaction();
			session.delete(employ);
			t.commit();
			System.out.println("*** Record Deleted ***");
		}
	}
}
