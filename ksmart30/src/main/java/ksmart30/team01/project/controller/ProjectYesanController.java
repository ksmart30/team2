package ksmart30.team01.project.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ProjectYesanController {
	
	//2.2.1 승인된 용역계약서 입력
	@GetMapping("/project/projectYesanSeunginView")
	public String projectYesanIn() {
		return "project/yesan/in";
	}
}
