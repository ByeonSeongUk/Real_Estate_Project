package com.rlest.dao;

import java.util.List;

import com.rlest.domain.Member;

public interface MemberDAO {

	public List<Member> getMemberList() throws Exception;
	
	public Member login(Member member) throws Exception;
	
	public void join(Member member) throws Exception;
	
}
