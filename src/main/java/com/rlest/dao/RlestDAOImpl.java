package com.rlest.dao;

import com.rlest.domain.RealEstate;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class RlestDAOImpl implements RlestDAO {

	@Autowired
	private SqlSession sql;
	private static final String NAMESPACE = "com.rlest.mappers.RlestMapper";


	@Override
	public List<RealEstate> getRlestList() throws Exception {
		return sql.selectList(NAMESPACE + ".getRlestList");
	}

	@Override
	public List<RealEstate> getRlestDetail(Integer rlestNum) throws Exception {
		System.out.println("DAO : " + rlestNum);
		return sql.selectList(NAMESPACE + ".getRlestDetail", rlestNum);
	}
}
