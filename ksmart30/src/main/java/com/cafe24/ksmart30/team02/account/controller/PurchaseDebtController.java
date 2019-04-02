package com.cafe24.ksmart30.team02.account.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.cafe24.ksmart30.team02.account.service.PurchaseDebtService;
import com.cafe24.ksmart30.team02.baseinfo.vo.PurchaseDebt;
@Controller
public class PurchaseDebtController {
	@Autowired
		private PurchaseDebtService purchaseDebtService;
	@GetMapping("/acc/purchasedebt/in")
	public String purchaseDebt(Model model) {
		List<PurchaseDebt> list = purchaseDebtService.purchaseDebtList();
		model.addAttribute("List", list);
		System.out.println(list.toString());
		return "account/slip/purchasedebt/purchase_debt";
	}
}
