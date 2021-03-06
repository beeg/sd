package es.deusto.ingenieria.sd.tralala.server.data.dto;

import java.util.ArrayList;
import java.util.List;

import es.deusto.ingenieria.sd.tralala.server.data.Member;

public class MemberAssembler {
	
	public static List<MemberDTO> assemble(List<Member> members) {
		List<MemberDTO> membersDTO = new ArrayList<MemberDTO>();

		for (Member m : members) {
			membersDTO.add(new MemberDTO(m));
		}

		System.out.println("* Assembling List of members ...");
		
		return membersDTO;
	}
	
	public static MemberDTO assemble(Member m) {
		System.out.println("Member: "+m);
		System.out.println("* Assembling member ...");
		
		return (m != null)?new MemberDTO(m):null;
	}
}
