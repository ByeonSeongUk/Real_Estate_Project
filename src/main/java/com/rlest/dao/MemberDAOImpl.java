package com.rlest.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.rlest.domain.Member;

@Repository
public class MemberDAOImpl implements MemberDAO {

	@Autowired
	private SqlSession sql;
	private static final String NAMESPACE = "com.rlest.mappers.MemberMapper";
	
	@Override
	public List<Member> getMemberList() throws Exception {
		
		return sql.selectList(NAMESPACE + ".getMemberList");
	}

	@Override
	public List<Member> getMemeber(String email) throws Exception {
		
		return sql.selectOne(NAMESPACE + ".getMember", email);
	}

	@Override
	public void join(Member member) throws Exception {
		System.out.println("DAO");
		sql.insert(NAMESPACE + ".join", member);
		
	}

}
