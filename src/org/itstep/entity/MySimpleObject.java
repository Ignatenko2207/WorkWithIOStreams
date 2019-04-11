package org.itstep.entity;

import java.io.Serializable;

public class MySimpleObject implements Serializable{

	private String textField;
	private Integer intField;
	private Boolean booleanField;
	
	public String getTextField() {
		return textField;
	}
	public void setTextField(String textField) {
		this.textField = textField;
	}
	public Integer getIntField() {
		return intField;
	}
	public void setIntField(Integer intField) {
		this.intField = intField;
	}
	public Boolean getBooleanField() {
		return booleanField;
	}
	public void setBooleanField(Boolean booleanField) {
		this.booleanField = booleanField;
	}
	public MySimpleObject(String textField, Integer intField, Boolean booleanField) {
		this.textField = textField;
		this.intField = intField;
		this.booleanField = booleanField;
	}
	
	public MySimpleObject() {
	}
	
	@Override
	public String toString() {
		return textField + " " + intField + " " + booleanField;
	}
}
