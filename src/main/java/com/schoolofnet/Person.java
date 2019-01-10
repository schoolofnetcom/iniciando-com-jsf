package com.schoolofnet;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name = "personBean", eager = true)
@SessionScoped
public class Person {
	
	private String name = "Leonan";

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
