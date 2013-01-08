package es.deusto.ingenieria.sd.tralala.server.data.dto;

import java.io.Serializable;

import es.deusto.ingenieria.sd.tralala.server.data.Member;

public class MemberDTO implements Serializable{

	private static final long serialVersionUID = 1L;
	private String user;
	
	public MemberDTO(Member user)	{
		this.user=user.getNick();
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}


}
