package ksmart30.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.fasterxml.jackson.core.JsonProcessingException;


@Controller
public class MainController {
	
	@GetMapping("/")
	public String index() {
		return "index";
	}

	@GetMapping("/errorView")
	public String errorView() {
		return "errorView";
	}
		
}
