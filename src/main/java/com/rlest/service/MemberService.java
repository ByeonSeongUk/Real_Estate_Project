package com.rlest.service;

import java.util.List;

import com.rlest.domain.Member;

public interface MemberService {
	public List<Member> getMemberList() throws Exception;
}
