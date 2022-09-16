package com.rlest.service;

import com.rlest.domain.AboutOptions;
import com.rlest.domain.Paging;
import com.rlest.domain.RealEstate;
import com.rlest.domain.WishList;

import java.util.HashMap;
import java.util.List;

public interface RlestService {
    public HashMap<String, Object> getRlestList(int page) throws Exception;
    public int rlestCount() throws Exception;
    public List<RealEstate> getRlestDetail(Integer rlestNum) throws Exception;
    public HashMap<String, Object> searchRlestList(RealEstate realEstate, int page) throws Exception;
    public Integer getWishListCheck(WishList wishList) throws Exception;
    public void wishListCtr(WishList wishList) throws Exception;
    public void wishListDel(WishList wishList) throws Exception;
    public List<RealEstate> getWishList(String email) throws Exception;
    public List<AboutOptions> getAboutOptions(Integer rlestNum) throws Exception;
}
