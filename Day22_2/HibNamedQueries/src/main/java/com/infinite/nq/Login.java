package com.infinite.nq;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@NamedQueries(
		{
			@NamedQuery(
					name = "validate",
					query = "from Login where userName=:userName AND passCode=:passCode"
						)
		}
		)
@Entity
@Table(name="Login")
@ManagedBean 
@SessionScoped
public class Login {

	@Id
	@Column(name="userName")
	private String userName;
	
	@Column(name="passCode")
	private String passCode;

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassCode() {
		return passCode;
	}

	public void setPassCode(String passCode) {
		this.passCode = passCode;
	}
	
	
	
	
}
