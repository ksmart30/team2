package ksmart30.team01.business.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BusinessManageController {
	

	//사업수행 결정서
	@GetMapping("/business/businessManageView")
	public String businessManageView() {
		return "business/businessManageView";
	}

	//사업수행 결정서 승인
	@GetMapping("/business/businessManageSeunginView")
	public String businessManageSeunginView() {
		return "business/businessManageSeunginView";
	}
	

	//사업성검토 List
	@GetMapping("/business/businessManageListView")
	public String businessManageListView() {
		return "business/businessManageListView";
	}
	
	
	
}

