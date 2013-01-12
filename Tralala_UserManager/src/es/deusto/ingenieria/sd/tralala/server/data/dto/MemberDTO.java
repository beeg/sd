package es.deusto.ingenieria.sd.tralala.server.data.dto;

import java.io.Serializable;

import es.deusto.ingenieria.sd.tralala.server.data.Member;

public class MemberDTO implements Serializable{

	private static final long serialVersionUID = 1L;
	private String name;
	
	public MemberDTO(Member user)	{
		this.name=user.getLogin();
	}

	public String getUser() {
		return name;
	}

	public void setUser(String user) {
		this.name = user;
	}
	
	public String toString(){
		return name;
	}


}
