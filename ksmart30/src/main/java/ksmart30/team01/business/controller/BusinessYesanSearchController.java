package ksmart30.team01.business.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import ksmart30.team01.business.domain.Business;
import ksmart30.team01.business.service.BusinessYesanSearchService;

@Controller
public class BusinessYesanSearchController {
	@Autowired
	BusinessYesanSearchService businessYesanSearchService;
	@GetMapping("/business/businessYesanSearch1View")
	public String businessYesanSearch1View() {
		return "/business/businessYesanSearch1View";
	}
	
	@GetMapping("/business/businessYesanSearch2View")
	public String businessYesanSearch2View() {
		return "/business/businessYesanSearch2View";
	}
	//사업성검토 검색2
	@GetMapping("/businessYesanSearch2View")
	public @ResponseBody List<Business> businessOutputSearch2(){
		System.out.println("사업성코드 검색2 깐뜨롤라 businessOutputSearch2 BusinessYesanOutputControlle.java");
		List<Business> searchList = businessYesanSearchService.businessOutputSearch2();
		return searchList;
	}
}
