package ksmart30.team02.account.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ExcostTransferController {
	
	//외주비 지급전표 이관
	@GetMapping("/acc/excostTransferView")
	public String excostTransferView() {
		System.out.println("외주비 지급전표 이관 excostTransfer ExcostTransferController.java");
		return "/account/excosttransfer/excosttransfer_in";
	}
}
