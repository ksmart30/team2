package com.cafe24.ksmart30.team02.baseinfo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.cafe24.ksmart30.team02.baseinfo.service.AccountCodeService;
import com.cafe24.ksmart30.team02.baseinfo.vo.AccountCode;

@Controller
public class AccountCodeController {
	@Autowired
	AccountCodeService accountcodeservice;
	//계정과목코드 리스트
	@GetMapping("/baseInfo/accountcode/in")
	public String AccountCodeInsert(Model model){
		System.out.println("계정과목코드 리스트 AccountCodeInsert AccountCodeController.java");
		
		List<AccountCode> list = accountcodeservice.getAccountCodeList();
		model.addAttribute("list",list);
		System.out.println(list + "list AccountCodeInsert AccountCodeController.java");
		
		return "/baseInfo/accountcode/accountcode_in";
	}
	
}
