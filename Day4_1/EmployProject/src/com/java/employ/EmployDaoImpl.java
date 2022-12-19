package com.java.employ;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class EmployDaoImpl implements EmployDAO {

	static List<Employ> employList;
	
	static {
		employList = new ArrayList<Employ>();
	}
	
	@Override
	public List<Employ> showEmployDao() {
		// TODO Auto-generated method stub
		return employList;
	}

	@Override
	public String addEmployDao(Employ employ) {
		employList.add(employ);
		return "Employ Record Added Successfully...";
	}

	@Override
	public Employ searchEmployDao(int empno) {
		Employ employFound = null;
		for (Employ employ : employList) {
			if (employ.getEmpno()==empno) {
				employFound = employ;
				break;
			}
		}
		return employFound;
	}

	@Override
	public String deleteEmployDao(int empno) {
		Employ employFound = searchEmployDao(empno);
		if (employFound!=null) {
			employList.remove(employFound);
			return "Employ Record Deleted...";
		}
		return "Employ Record Not Found...";
	}

	@Override
	public String updateEmployDao(Employ employNew) {
		Employ employFound = searchEmployDao(employNew.getEmpno());
		if (employFound !=null) {
			for (Employ employ : employList) {
				if (employ.getEmpno()==employNew.getEmpno()) {
					employ.setName(employNew.getName());
					employ.setDept(employNew.getDept());
					employ.setDesig(employNew.getDesig());
					employ.setGender(employNew.getGender());
					employ.setBasic(employNew.getBasic());
				}
				break;
			}
			return "Employ Record Updated...";
		}
		return "Employ Record Not Found...";
	}

	@Override
	public String writeEmployFileDao() throws IOException {
			FileOutputStream fout = new FileOutputStream("d:/files/project.txt");
			ObjectOutputStream objout = new ObjectOutputStream(fout);
			objout.writeObject(employList);
			objout.close();
			fout.close();
		return "File Created Successfully...";
	}

	@Override
	public String readEmployFileDao() throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		FileInputStream fin = new FileInputStream("d:/files/project.txt");
		ObjectInputStream objin = new ObjectInputStream(fin);
		employList = (List<Employ>)objin.readObject();
		objin.close();
		fin.close();
		return "File Data Read Successfully...";
	}

}
