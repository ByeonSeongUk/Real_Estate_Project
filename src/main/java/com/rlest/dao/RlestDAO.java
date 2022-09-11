package com.rlest.dao;

import com.rlest.domain.RealEstate;

import java.util.List;

public interface RlestDAO {

    // 전체 매물목록 불러오기
	public List<RealEstate> getRlestList() throws Exception;
    // 매물 상세 불러오기
    public List<RealEstate> getRlestDetail(Integer rlestNum) throws Exception;
    // 검색한 매물 불러오기
    public List<RealEstate> searchRlestList(RealEstate realEstate) throws Exception;
}
