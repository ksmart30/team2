package com.cafe24.ksmart30.team02.baseinfo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class BankAccountController {
	@GetMapping("/baseInfo/bankaccount/in")
	public String bankAccount() {
		return "baseInfo/bankaccount";
	}
}
