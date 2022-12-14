package com.rlest.dao;

import java.util.HashMap;
import java.util.List;

import com.rlest.domain.AboutOptions;
import com.rlest.domain.Paging;
import com.rlest.domain.RealEstate;
import com.rlest.domain.RoomImgs;
import com.rlest.domain.WishList;

public interface RlestDAO {

    // 전체 매물목록 불러오기
	public List<RealEstate> getRlestList(Paging paging) throws Exception;

    // 총 매물 개수 카운터
    public int rlestCount() throws Exception;

    // 매물 상세 불러오기
    public List<RealEstate> getRlestDetail(Integer rlestNum) throws Exception;

    // 검색한 매물 불러오기
    public List<RealEstate> searchRlestList(HashMap<String, Object> map) throws Exception;

    // 검색한 매물 카운터
    public int searchRlestListCount(RealEstate realEstate) throws Exception;

    // 위시리스트 확인
    public Integer getWishListCheck(WishList wishList) throws Exception;

    // 위시리스트 추가
    public void wishListCtr(WishList wishList) throws Exception;

    // 위시리스트 삭제
    public void wishListDel(WishList wishList) throws Exception;

    // 로그인한 사용자의 위시리스트 조회
    public List<RealEstate> getWishList(String email) throws Exception;

    // 옵션 불러오기
    public List<AboutOptions> getAboutOptions(Integer rlestNum) throws Exception;
    
    // 사진 불러오기(매물 상세)
    public List<RoomImgs> getDetailImgs(Integer rlestNum) throws Exception;
}
