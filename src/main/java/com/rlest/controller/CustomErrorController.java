// Vue URL로 바로 이동시 에러나는 부분 처리(새로고침도 포함)
package com.rlest.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class CustomErrorController implements ErrorController {

	public final String ERROR_PATH = "/error";
	
	private static final Logger logger = LoggerFactory.getLogger(ErrorController.class);

	@GetMapping(ERROR_PATH)
	public String redirectRoot() {
		return "index.html";
	}

	public String getErrorPath() {
		return null;
	}

}
