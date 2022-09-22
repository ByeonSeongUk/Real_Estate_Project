package com.rlest.controller;
// 메인, 사용자 컨트롤러
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rlest.domain.Member;
import com.rlest.service.MemberService;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@RestController
@RequestMapping(value = "/", produces = MediaType.APPLICATION_JSON_VALUE)
public class MainController {
	
	@Autowired
	MemberService memberService;
	
	private static final Logger logger = LoggerFactory.getLogger(MainController.class);

	/**
	 * 회원가입
	 * params : member.email, member.mmbrPw
	 * resultType : String(Router)
	 */
	@PostMapping("/join")
	public void joinMember(Member member) throws Exception {

		memberService.join(member);
	}

	/**
	 * 중복 확인
	 * params : email
	 * resultType : String(Router)
	 */
	@PostMapping("/doubleCheck")
	public int doubleCheck(String email) throws Exception {

		return memberService.doubleCheck(email);
	}



	/**
	 * 로그인
	 * params : member.email, member.mmbrPw
	 * resultType : String
	 */
	@PostMapping("/login")
	public String loginAction(Member member, HttpServletRequest request) throws Exception {

		HttpSession session = request.getSession();

		Member memberData = memberService.login(member);

		session.setAttribute("LOGIN_MEMBER", member.getEmail());

		String email = (String) session.getAttribute("LOGIN_MEMBER");
		System.out.println(memberData);
		if(memberData != null) {
			// 로그인 성공시
			return email;
		}
		else {
			// 로그인 실패시
			return "0";
		}

	}


	/**
	 * 로그아웃
	 * params : null
	 * resultType : String(Router)
	 */
	@PostMapping("/logout")
	public void logoutAction(HttpServletRequest request) throws Exception {

		HttpSession session = request.getSession();

		session.invalidate();

	}

	/**
	 * 로그인체크
	 * params : null
	 * resultType : 0(로그인 되어 있음), 1(로그인 되어 있지 않음)
	 */
	@PostMapping("/loginCheck")
	public String loginCheck(HttpServletRequest request) throws Exception {

		HttpSession session = request.getSession();

		String email = (String) session.getAttribute("LOGIN_MEMBER");

		if(email != null) {
			return email;
		}
		else {
			return "1";
		}
	}
}
