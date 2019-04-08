package ksmart30.team02.account.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import ksmart30.team02.account.domain.UnpaidDomain;
import ksmart30.team02.account.service.UnpaidService;

@Controller
public class UnpaidController {
	@Autowired
	private UnpaidService unpaidService;
	@GetMapping("/acc/unpaidView")
	public String unpaidView(Model model) {
		List<UnpaidDomain> list = unpaidService.unpaidView();
		model.addAttribute("List", list);
		System.out.println(list.toString());
		return "account/unpaidView";
	}
}
