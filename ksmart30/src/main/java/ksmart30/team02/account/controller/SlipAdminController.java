package ksmart30.team02.account.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import ksmart30.team02.account.domain.SlipAdmit;
import ksmart30.team02.account.service.SlipAdmitService;

@Controller
public class SlipAdminController {
	@Autowired
	SlipAdmitService slipAdmitService;
	//전표승인
	@GetMapping("/acc/slipAdmitView")
	public String slipAdmitView() {
		System.out.println("slipAdmitView SlipAdminController.java");
		return "/account/slip/admit/slipadmit_in";
	}
	@GetMapping("/slipAdmitList")
	public @ResponseBody List<SlipAdmit> slipAdmitList(SlipAdmit slipAdmit){
		System.out.println("slipAdmitList SlipAdminController.java");
		System.out.println(slipAdmit+"<--전표헤더!! Controller");
		List<SlipAdmit> slipList = slipAdmitService.slipAdmitList(slipAdmit);
		System.out.println(slipList+"<--헤더리턴!! Controller");
		return slipList;
	}
	@GetMapping("/slipAdmitList2")
	public @ResponseBody List<SlipAdmit> slipAdmitList2(SlipAdmit slipAdmit){
		System.out.println("slipAdmitList SlipAdminController.java");
		System.out.println(slipAdmit+"<--전표상세!!! Controller");
		List<SlipAdmit> slipList = slipAdmitService.slipAdmitList2(slipAdmit);
		System.out.println(slipList+"<--전표상세리턴!!! Controller");
		return slipList;
	}
}
