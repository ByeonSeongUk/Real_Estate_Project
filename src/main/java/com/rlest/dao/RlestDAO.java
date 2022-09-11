package com.rlest.dao;

import com.rlest.domain.RealEstate;

import java.util.List;

public interface RlestDAO {

    // 전체 매물목록 불러오기
	public List<RealEstate> getRlestList() throws Exception;

    public List<RealEstate> getRlestDetail(Integer rlestNum) throws Exception;
}
