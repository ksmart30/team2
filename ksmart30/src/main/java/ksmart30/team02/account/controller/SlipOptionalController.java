package ksmart30.team02.account.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.fasterxml.jackson.core.JsonProcessingException;

import ksmart30.team02.account.domain.SlipOptionalDomain;
import ksmart30.team02.account.service.SlipOptionalService;

@Controller
public class SlipOptionalController {
	@Autowired
	private SlipOptionalService slipOptionalService;
	
	/* @param  Model model
	 * @brief  8.4 조건별 전표검색
	 * @return String conditionalSlipSearchView
	 */
	@GetMapping("/acc/conditionalSlipSearchView")
	public String conditionalSlipSearchView(){
		return "account/slipOptionalSearchView";
	}
	
	@GetMapping("/accountOptionalSearchListView")
	public @ResponseBody List<Map<String,String>> accountSearchListView(@RequestParam(value="account") String account) throws JsonProcessingException{
		System.out.println("accountSearch 호출");
		return slipOptionalService.getAccountCode(account);
	}
	
	// 8.2 전표상세검색 -modal 부서
	/* @param   @RequestParam(value="dept") String dept
	 * @brief   ajax 부서 리스트 조회
	 * 			@ResponseBody 메소드에서 리턴되는 값은 View 를 통해서 출력되지 않고 HTTP Response Body 에 직접 쓰여지게 됨.
	 * @return  List<Map<String,String>>
	 */
	@GetMapping("/deptOptionalSearchListView")
	public @ResponseBody List<Map<String,String>> deptSearchListView(@RequestParam(value="dept") String dept) throws JsonProcessingException{
		System.out.println("deptSearch 호출");
		return slipOptionalService.getDeptCode(dept);
	}
	
	// 8.2 전표상세검색 -modal 부서
	/* @param   @RequestParam(value="dept") String dept
	 * @brief   ajax 거래처 리스트 조회
	 * 			@ResponseBody 메소드에서 리턴되는 값은 View 를 통해서 출력되지 않고 HTTP Response Body 에 직접 쓰여지게 됨.
	 * @return  List<Map<String,String>>
	 */
	@GetMapping("/custOptinalSearchListView")
	public @ResponseBody List<Map<String,String>> custSearchListView(@RequestParam(value="cust") String cust) throws JsonProcessingException{
		System.out.println("custSearch 호출");
		return slipOptionalService.getCustCode(cust);
	}
	
	// 8.2 전표상세검색 -조건 검색 조회
	/* @param   @RequestBody Map<String,Object> searchMap
	 * @brief   ajax 조건 검색  조회 리스트 
	 * 			@ResponseBody 메소드에서 리턴되는 값은 View 를 통해서 출력되지 않고 HTTP Response Body 에 직접 쓰여지게 됨.
	 * 			@RequestBody  POST방식으로 전달된 HTTP Request Body를 읽음.
	 * @return  List<Map<String, Object>>
	 */
	@PostMapping("/slipOptionalSearchList")
	public @ResponseBody List<Map<String, Object>> slipSearchList(@RequestBody Map<String,Object> searchMap) throws JsonProcessingException{
		System.out.println("slipSearchList 호출");
		System.out.println(searchMap);
		
		return slipOptionalService.getSlipList(searchMap);
	}
}