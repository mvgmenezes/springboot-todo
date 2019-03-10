package com.mmenezes.rest.webservices.restfulwebservices.basic.auth;

public class AuthenticationBean {

	private String mensagem;
	
	public AuthenticationBean(String mensagem) {
		this.mensagem = mensagem;
	}
	
	public String getMensagem() {
		return this.mensagem;
	}
	
	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}
	
}
