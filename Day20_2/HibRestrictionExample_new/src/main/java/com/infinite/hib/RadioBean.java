package com.infinite.hib;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean 
@SessionScoped
public class RadioBean {

	private String radioValue;

	private String radioText;
	
	
	public String getRadioText() {
		return radioText;
	}

	public void setRadioText(String radioText) {
		this.radioText = radioText;
	}

	public String getRadioValue() {
		return radioValue;
	}

	public void setRadioValue(String radioValue) {
		this.radioValue = radioValue;
	}
	
	
}
