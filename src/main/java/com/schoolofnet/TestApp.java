package com.schoolofnet;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.event.ActionEvent;
import javax.faces.event.AjaxBehaviorEvent;
import javax.faces.event.ValueChangeEvent;

@ManagedBean(name = "testAppBean", eager = true)
public class TestApp {

	@ManagedProperty(value = "#{personBean}")
	private Person personBean;
	
	public TestApp() {
		System.out.println("Called ManagedBean -> TestApp");
	}

	public void setPersonBean(Person person) {
		this.personBean = person;
	}
	
	public String sayHello() {
		return "Hello from JSF by School of Net";
	}	
	
	public String getPersonName() {
		if (personBean != null && personBean.getName() != null) {
			return personBean.getName();
		}
		
		personBean.setName("Leonan");
		return personBean.getName();
	}
	
	public void clickMeBinding(ActionEvent e) {
		System.out.println("Event click binded");
	}

	public void inputChange(AjaxBehaviorEvent e) {
		System.out.println("Event input Change");
	}
}
