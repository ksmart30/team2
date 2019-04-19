package ksmart30.team01.project.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ProjectLaborResultController {
	
	@GetMapping("/project/projectLaborCostResultView")
	public String projectLaborCostInputView() {
		
		return "/project/projectLaborCostResultView";
	}
}
