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
	 * 테스트 코드
	 * params : null
	 * resultType : List<Member>
	 */
	@GetMapping("/memberList")
	public List<Member> getMemberList() throws Exception{

		List<Member> getMemberList = memberService.getMemberList();

		return getMemberList;
	}

	/**
	 * 회원가입
	 * params : member.email, member.mmbrPw
	 * resultType : String(Router)
	 */
	@PostMapping("/join")
	public String joinMember(Member member) throws Exception {
		
		System.out.println(member);
		memberService.join(member);

		return "router.push({name: 'home'})";
	}

	/**
	 * 로그인
	 * params : member.email, member.mmbrPw
	 * resultType : String(Router)
	 */
	@PostMapping("/login")
	public String loginAction(Member member, HttpServletRequest request) throws Exception {

		HttpSession session = request.getSession();

		memberService.login(member);

		session.setAttribute("LOGIN_MEMBER", member.getEmail());

		System.out.println("session : " + session.getAttribute("LOGIN_MEMBER"));

		return "router.push({name: 'home'})";
	}


	/**
	 * 로그아웃
	 * params : null
	 * resultType : String(Router)
	 */
	@PostMapping("/logout")
	public String logoutAction(HttpServletRequest request) throws Exception {

		HttpSession session = request.getSession();

		session.invalidate();

		return "router.push({name: 'home'})";
	}
}
