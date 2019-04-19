package ksmart30.team01.project.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ProjectCostInputController {
	
	@GetMapping("/project/projectCostInputView")
	public String projectCostInputView() {
		
		return "/project/projectCostInputView";
	}
}
