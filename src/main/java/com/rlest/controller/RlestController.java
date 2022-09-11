package com.rlest.controller;
// 매물 컨트롤러
import com.rlest.domain.Member;
import com.rlest.domain.RealEstate;
import com.rlest.service.MemberService;
import com.rlest.service.RlestService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

@RestController
@RequestMapping(value = "/rlest", produces = MediaType.APPLICATION_JSON_VALUE)
public class RlestController {
	
	@Autowired
	RlestService rlestService;

	private static final Logger logger = LoggerFactory.getLogger(RlestController.class);


	/**
	 * 게시물 전체 조회
	 * params : Null
	 * resultType : List<RealEstate>
	 */
	@GetMapping("/getRlestList")
	public List<RealEstate> getRlestList() throws Exception {

		return rlestService.getRlestList();
	}

	/**
	 * 선택한 게시물 상세 페이지(매물 상세)
	 * params : Integer rlestNum
	 * resultType : List<RealEstate>
	 */
	@GetMapping("/getRlestDetail")
	public List<RealEstate> getRlestDetail(Integer rlestNum) throws Exception {
		System.out.println("controller : " + rlestNum);
		return rlestService.getRlestDetail(rlestNum);
	}

	/**
	 * 검색한 게시물 조회(검색 박스)
	 * params : RealEstate
	 * resultType : List<RealEstate>
	 */
	@GetMapping("/searchRlestList")
	public List<RealEstate> searchRlestList(RealEstate realEstate) throws Exception {
		System.out.println("controller : " + realEstate);
		return rlestService.searchRlestList(realEstate);
	}

}
