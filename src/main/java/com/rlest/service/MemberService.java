package com.rlest.service;

import java.util.List;

import com.rlest.domain.Member;

public interface MemberService {
	
	public Member login(Member member) throws Exception;
	
	public void join(Member member) throws Exception;

	public int doubleCheck(String email) throws Exception;
}
