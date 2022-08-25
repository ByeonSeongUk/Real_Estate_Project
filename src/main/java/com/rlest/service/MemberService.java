package com.rlest.service;

import java.util.List;

import com.rlest.domain.Member;

public interface MemberService {
	public List<Member> getMemberList() throws Exception;
	
	public List<Member> getMember(String email) throws Exception;
	
	public void join(Member member) throws Exception;
}
