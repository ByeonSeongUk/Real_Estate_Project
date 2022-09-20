package com.rlest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rlest.dao.MemberDAO;
import com.rlest.domain.Member;

@Service
public class MemberServiceImpl implements MemberService {

	@Autowired
	MemberDAO memberDAO;

	@Override
	public void join(Member member) throws Exception {
		memberDAO.join(member);
	}

	@Override
	public int doubleCheck(String email) throws Exception {
		return memberDAO.doubleCheck(email);
	}

	@Override
	public Member login(Member member) throws Exception {

		return memberDAO.login(member);
	}

}
