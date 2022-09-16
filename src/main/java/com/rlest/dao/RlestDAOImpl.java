package com.rlest.dao;

import com.rlest.domain.*;
import com.rlest.domain.Paging;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;

@Repository
public class RlestDAOImpl implements RlestDAO {

	@Autowired
	private SqlSession sql;
	private static final String NAMESPACE = "com.rlest.mappers.RlestMapper";


	@Override
	public List<RealEstate> getRlestList(Paging paging) throws Exception {
		return sql.selectList(NAMESPACE + ".getRlestList", paging);
	}

	@Override
	public int rlestCount() throws Exception {
		return sql.selectOne(NAMESPACE + ".rlestCount");
	}

	@Override
	public List<RealEstate> getRlestDetail(Integer rlestNum) throws Exception {
		return sql.selectList(NAMESPACE + ".getRlestDetail", rlestNum);
	}

	@Override
	public List<RealEstate> searchRlestList(HashMap<String, Object> map) throws Exception {
		return sql.selectList(NAMESPACE + ".searchRlestList", map);
	}

	@Override
	public int searchRlestListCount(RealEstate realEstate) throws Exception {
		return sql.selectOne(NAMESPACE + ".searchRlestListCount", realEstate);
	}

	@Override
	public Integer getWishListCheck(WishList wishList) throws Exception {
		return sql.selectOne(NAMESPACE + ".getWishListCheck", wishList);
	}

	@Override
	public void wishListCtr(WishList wishList) throws Exception {
		sql.insert(NAMESPACE + ".wishListCtr", wishList);
	}

	@Override
	public void wishListDel(WishList wishList) throws Exception {
		sql.delete(NAMESPACE + ".wishListDel", wishList);
	}

	@Override
	public List<RealEstate> getWishList(String email) throws Exception {
		return sql.selectList(NAMESPACE + ".getWishList", email);
	}

	@Override
	public List<AboutOptions> getAboutOptions(Integer rlestNum) throws Exception {
		return sql.selectList(NAMESPACE + ".getAboutOptions", rlestNum);
	}
}
