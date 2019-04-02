package com.cafe24.ksmart30.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cafe24.ksmart30.main.service.TotalCodeService;
import com.cafe24.ksmart30.main.vo.TotalCode;
import com.fasterxml.jackson.core.JsonProcessingException;


@Controller
public class MainController {
	@Autowired private TotalCodeService totalcodeservice;
	
	@GetMapping("/")
	public String index() {
		return "index";
	}

	@GetMapping("/errorView")
	public String errorView() {
		return "errorView";
	}
	
	@GetMapping("/baseform")
	public String baseform() {
		return "baseForm";
	}
	
	@GetMapping("/tabform")
	public String tabfrom(Model model) {
		model.addAttribute("totalList", totalcodeservice.searchTotal());
		return "tabForm";
	}
	
	@GetMapping("/tableform")
	public String tableform(Model model) {
		model.addAttribute("totalList", totalcodeservice.searchTotal());
		return "tableForm";
	}
	
	@GetMapping("/treedb")
	public @ResponseBody List<TotalCode> treedb() throws JsonProcessingException {
		List<TotalCode> treeList = totalcodeservice.searchTotal();
		
		return treeList;
	}
	
}
