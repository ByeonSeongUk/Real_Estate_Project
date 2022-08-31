package com.rlest.controller;

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

@RestController
@RequestMapping(value = "/api", produces = MediaType.APPLICATION_JSON_VALUE)
public class MainController {
	
	@Autowired
	MemberService memberService;
	
	private static final Logger logger = LoggerFactory.getLogger(MainController.class);
	
	@GetMapping("/memberList")
	public List<Member> getMemberList() throws Exception{
		
		List<Member> getMemberList = memberService.getMemberList();
		
		return getMemberList;
	}
	

	@PostMapping("/login")
	public String loginAction(Member member) throws Exception {

		System.out.println(member);
//		Member memberInfo = memberService.login(member);
		return "redirect:/";
	}
	
	@PostMapping("/join")
	public String joinMember(Member member) throws Exception {
		
		System.out.println(member);
		memberService.join(member);
		
		return "redirect:/login";
	}
}
