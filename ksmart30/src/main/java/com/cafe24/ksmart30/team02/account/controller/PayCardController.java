package com.cafe24.ksmart30.team02.account.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PayCardController {
	@GetMapping("/baseinfo/paycard/in")
	public String paycard() {
		return "account/slip/paycard/paycard_in";
	}
}
