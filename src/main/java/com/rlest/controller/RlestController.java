package com.rlest.controller;
// 매물 컨트롤러
import com.rlest.domain.AboutOptions;
import com.rlest.domain.Paging;
import com.rlest.domain.RealEstate;
import com.rlest.domain.WishList;
import com.rlest.service.RlestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.List;

@RestController
@RequestMapping(value = "/rlest", produces = MediaType.APPLICATION_JSON_VALUE)
public class RlestController {

	@Autowired
	RlestService rlestService;

	// 한 페이지에 보여줄 게시물 수
	final int LIMIT = 10;

	/**
	 * 게시물 전체 조회
	 * params : Null
	 * resultType : List<RealEstate>
	 */
	@GetMapping("/getRlestList")
	public HashMap<String, Object> getRlestList(int page) throws Exception {

		System.out.println(page);

		return rlestService.getRlestList(page);
	}

	/**
	 * 선택한 게시물 상세 페이지(매물 상세)
	 * params : Integer rlestNum
	 * resultType : List<RealEstate>
	 */
	@GetMapping("/getRlestDetail")
	public List<RealEstate> getRlestDetail(Integer rlestNum) throws Exception {

		return rlestService.getRlestDetail(rlestNum);

	}

	/**
	 * 검색한 게시물 조회(검색 박스)
	 * params : RealEstate
	 * resultType : List<RealEstate>
	 */
	@GetMapping("/searchRlestList")
	public HashMap<String, Object> searchRlestList(RealEstate realEstate, int page) throws Exception {
		System.out.println(rlestService.searchRlestList(realEstate, page));

		return rlestService.searchRlestList(realEstate, page);
	}

	/**
	 * 위시리스트 체크
	 * params : wishList
	 * resultType : 0(위시리스트에 없음), 1(위시리스트에 있음)
	 */
	@PostMapping("/wishListCheck")
	public String wishListCheck(WishList wishList, HttpServletRequest request) throws Exception {

		HttpSession session = request.getSession();

		String email = (String) session.getAttribute("LOGIN_MEMBER");

		wishList.setEmail(email);

		// 위시리스트에 있는지 확인
		Integer check = rlestService.getWishListCheck(wishList);
		System.out.println(wishList.getEmail());

		if(check == 1) {
			System.out.println("controller : 1");
			return "1";
		}
		else {
			System.out.println("controller : 0");
			return "0";
		}

	}

	/**
	 * 위시리스트 추가/삭제
	 * params : wishList
	 * resultType : 0(로그인 후 진행), 1(추가 완료), 2(삭제 완료)
	 */
	@PostMapping("/wishListCtrDel")
	public String wishListCrtDel(WishList wishList, HttpServletRequest request) throws Exception {

		HttpSession session = request.getSession();

		String email = (String) session.getAttribute("LOGIN_MEMBER");

		wishList.setEmail(email);

		// 로그인 되어 있지 않을때 진행
		if(email == null) {
			System.out.println("로그인 후 진행!");
			return "0";
		}
		// 로그인 되어 있을때 진행
		else {
			System.out.println("위시리스트 추가 진행!");

			// 위시리스트에 있는지 확인
			Integer check = rlestService.getWishListCheck(wishList);

			if(check == 1) {
				System.out.println("위시리스트에 추가되어 있음");
				// 위시리스트 테이블에 데이터 있을때 실행되는 부분
				rlestService.wishListDel(wishList);
				return "2";
			}
			else if(check == 0) {
				System.out.println("위시리스트에 없음");
				// 위시리스트 테이블에 데이터 없을떄 실행되는 부분
				rlestService.wishListCtr(wishList);
				return "1";
			}
		}

		return null;
	}


	/**
	 * 로그인한 사용자 위시리스트 조회
	 * params : String email
	 * resultType : List<RealEstate>
	 */
	@GetMapping("/getWishList")
	public List<RealEstate> getWishList(HttpServletRequest request) throws Exception {

		HttpSession session = request.getSession();

		String email = (String) session.getAttribute("LOGIN_MEMBER");

		return rlestService.getWishList(email);
	}

	/**
	 * 매물에 해당하는 옵션 불러오기
	 * params : Int rlestNum
	 * resultType : List<AboutOptions>
	 */
	@GetMapping("/getAboutOptions")
	public List<AboutOptions> getAboutOptions(Integer rlestNum) throws Exception {
		System.out.println(rlestService.getAboutOptions(rlestNum));
		return rlestService.getAboutOptions(rlestNum);
	}
}
