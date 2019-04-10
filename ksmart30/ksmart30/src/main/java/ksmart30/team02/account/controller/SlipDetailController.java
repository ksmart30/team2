package ksmart30.team02.account.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.fasterxml.jackson.core.JsonProcessingException;

import ksmart30.team00.baseinfo.domain.AccountCode;
import ksmart30.team02.account.service.SlipDetailService;

@Controller
public class SlipDetailController {
	@Autowired SlipDetailService slipdetailservice;
	
	@GetMapping("/acc/slipSearchView")
	public String slipSearchView() {
		return "account/slipSearchView";
	}
	
	@GetMapping("/accountSearch")
	public @ResponseBody List<AccountCode> accountSearch(@RequestParam(value="account") String account) throws JsonProcessingException{
		System.out.println("accountSearch호출");
		return slipdetailservice.getAccountCode(account);
	}
}
