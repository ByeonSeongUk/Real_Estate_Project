package com.rlest.service;

import com.rlest.dao.RlestDAO;
import com.rlest.domain.RealEstate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RlestServiceImpl implements RlestService {

	@Autowired
	RlestDAO RlestDAO;

	@Override
	public List<RealEstate> getRlestList() throws Exception {
		return RlestDAO.getRlestList();
	}

	@Override
	public List<RealEstate> getRlestDetail(Integer rlestNum) throws Exception {
		return RlestDAO.getRlestDetail(rlestNum);
	}
}
