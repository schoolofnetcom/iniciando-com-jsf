package com.schoolofnet;

import javax.faces.bean.ManagedBean;

@ManagedBean(name = "imcBean", eager = true)
public class IMC {
	
	private Double weight;
	private Double height;
	private String message;
	private Double imc;
	
	public String onCalculateImc() {
		if (!(weight > 0) && !(height > 0)) {
			message = "Entre com valores validos";
			return "result";
		}		
		
		imc = weight / ((height / 100) * (height / 100));
		message = "O seu IMC foi calculado com sucesso";
		
		return "result";
	}
	
	public Double getWeight() {
		return weight;
	}
	public void setWeight(Double weight) {
		this.weight = weight;
	}
	public Double getHeight() {
		return height;
	}
	public void setHeight(Double height) {
		this.height = height;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}

	public Double getImc() {
		return imc;
	}

	public void setImc(Double imc) {
		this.imc = imc;
	}
}
