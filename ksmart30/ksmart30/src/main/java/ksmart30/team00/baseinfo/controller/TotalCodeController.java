package ksmart30.team00.baseinfo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.fasterxml.jackson.core.JsonProcessingException;

import ksmart30.team00.baseinfo.domain.TotalCode;
import ksmart30.team00.baseinfo.service.TotalCodeService;

/*
 * @file    TotalCodeController.java
 * @brief   10.1.종합코드
 * @author  ksmart30 HSY
 */

@Controller
public class TotalCodeController {
	
	@Autowired private TotalCodeService totalCodeService;
	
	/* @brief   10.1 종합코드
	 * 	   		"http://localhost//baseinfo/totalCodeView" 주소분기(get방식)
	 *          template폴더에 있는 baseInfo/totalcode.html forward
	 * @return  String(view이름)
	 */
	@GetMapping("/baseinfo/totalCodeView")
	public String totalCodeView() {

		return "baseInfo/totalcode";
	}
	
	@GetMapping("/treemenu")
	public @ResponseBody List<TotalCode> treemenu() throws JsonProcessingException {
		List<TotalCode> treeList = totalCodeService.totalCodeTreeSearch();
		return treeList;
	}
	
	//ajax 통해서 소분류 리스트 출력
	@GetMapping("/treeselected")
	public @ResponseBody List<TotalCode> treeSelected(@RequestParam(value="LEVEL1_NM") String LEVEL1_NM ){
		System.out.println(LEVEL1_NM);
				
		return totalCodeService.totalCodeClassifySearch(LEVEL1_NM);
	}
}
