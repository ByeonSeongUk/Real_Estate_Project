package com.rlest.service;

import com.rlest.domain.RealEstate;

import java.util.List;

public interface RlestService {
    public List<RealEstate> getRlestList() throws Exception;

    public List<RealEstate> getRlestDetail(Integer rlestNum) throws Exception;
    public List<RealEstate> searchRlestList(RealEstate realEstate) throws Exception;
}
