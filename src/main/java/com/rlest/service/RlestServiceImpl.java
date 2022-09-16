package com.rlest.service;

import com.rlest.dao.RlestDAO;
import com.rlest.domain.AboutOptions;
import com.rlest.domain.Paging;
import com.rlest.domain.RealEstate;
import com.rlest.domain.WishList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;

@Service
public class RlestServiceImpl implements RlestService {

	@Autowired
	RlestDAO RlestDAO;

	@Override
	public HashMap<String, Object> getRlestList(int page) throws Exception {

   	    Paging paging = new Paging(page, RlestDAO.rlestCount());
		HashMap<String, Object> map = new HashMap<>();

		map.put("list", RlestDAO.getRlestList(paging));
		map.put("paging", paging);
		System.out.println(paging.toString());

		return map;
	}

	@Override
	public int rlestCount() throws Exception {
		return RlestDAO.rlestCount();
	}

	@Override
	public List<RealEstate> getRlestDetail(Integer rlestNum) throws Exception {
		return RlestDAO.getRlestDetail(rlestNum);
	}

	@Override
	public HashMap<String, Object> searchRlestList(RealEstate realEstate, int page) throws Exception {

		Paging paging = new Paging(page, RlestDAO.rlestCount());

		HashMap<String, Object> map = new HashMap<>();
		HashMap<String, Object> mapperMap = new HashMap<>();

		mapperMap.put("realEstate", realEstate);
		mapperMap.put("paging", paging);

		map.put("paging", paging);
		map.put("list", RlestDAO.searchRlestList(mapperMap));

		return map;
	}

	@Override
	public Integer getWishListCheck(WishList wishList) throws Exception {
		return RlestDAO.getWishListCheck(wishList);
	}

	@Override
	public void wishListCtr(WishList wishList) throws Exception {
		RlestDAO.wishListCtr(wishList);
	}

	@Override
	public void wishListDel(WishList wishList) throws Exception {
		RlestDAO.wishListDel(wishList);
	}

	@Override
	public List<RealEstate> getWishList(String email) throws Exception {
		return RlestDAO.getWishList(email);
	}

	@Override
	public List<AboutOptions> getAboutOptions(Integer rlestNum) throws Exception {
		return RlestDAO.getAboutOptions(rlestNum);
	}
}
