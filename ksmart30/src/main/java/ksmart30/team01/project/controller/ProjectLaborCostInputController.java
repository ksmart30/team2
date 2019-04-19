package ksmart30.team01.project.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ProjectLaborCostInputController {
	
	@GetMapping("/project/projectLaborCostInputView")
	public String projectLaborCostInputView() {
		
		return "/project/projectLaborCostInputView";
	}
}
