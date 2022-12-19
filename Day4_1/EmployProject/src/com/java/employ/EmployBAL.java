package com.java.employ;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

public class EmployBAL {

	static EmployDAO dao;
	static StringBuilder sb;
	
	static {
		dao = new EmployDaoImpl();
		sb = new StringBuilder();
	}
	
	public String readEmployFileBal() throws IOException, ClassNotFoundException {
		return dao.readEmployFileDao();
	}
	
	public String writeEmployFileBal() 
			throws FileNotFoundException, IOException {
		return dao.writeEmployFileDao();
	}
	
	public String addEmployBal(Employ employ) throws EmployException {
		if (doValid(employ)==false) {
			throw new EmployException(sb.toString());
		}
		return dao.addEmployDao(employ);
	}
	
	public String updateEmployBal(Employ employ) throws EmployException {
		if (doValid(employ)==false) {
			throw new EmployException(sb.toString());
		}
		return dao.updateEmployDao(employ);
	}
	
	public Employ searchEmployBal(int empno) {
		return dao.searchEmployDao(empno);
	}
	
	public String deleteEmployBal(int empno) {
		return dao.deleteEmployDao(empno);
	}
	
	public List<Employ> showEmployBal() {
		return dao.showEmployDao();
	}
	

	public boolean doValid(Employ employ) {
		boolean isValid = true;
		if (employ.getEmpno() <= 0) {
			sb.append("Employ No cannot be Zero or Negative...\n");
			isValid = false;
		}
		if (employ.getName().length() < 5) {
			sb.append("Employ Name Contains Min. 5 chars...\n");
			isValid = false;
		}
		if (employ.getDept().length() < 3) {
			sb.append("Department Contains Min. 3 chars...\n");
			isValid =false;
		}
		if (employ.getDesig().length() < 4) {
			sb.append("Designation Contains Min. 4 chars...\n");
			isValid = false;
		}
		if (employ.getBasic() < 10000 || employ.getBasic() > 90000) {
			sb.append("Basic Must be between 10000 and 90000...");
			isValid = false;
		}
		return isValid;
	}
}
