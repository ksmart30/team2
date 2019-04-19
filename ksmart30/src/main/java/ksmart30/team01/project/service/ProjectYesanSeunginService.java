package ksmart30.team01.project.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ksmart30.team01.project.mapper.ProjectYesanSeunginMapper;

@Service
public class ProjectYesanSeunginService {
	@Autowired 
	ProjectYesanSeunginMapper projectYesanSeunginMapper;
	
	public List<Map<String, String>> projectManageSelect() {
		
		return null;
	}
}
