package com.cafe24.ksmart30.main.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.*;

import com.cafe24.ksmart30.main.mapper.TotalCodeMapper;
import com.cafe24.ksmart30.main.vo.TotalCode;
@Service
public class TotalCodeService {
	@Autowired private TotalCodeMapper totalCodeMapper;
	
	public List<TotalCode> searchTotal(){
		
		List<TotalCode> list = totalCodeMapper.selectTotalCodeList();
		
		for(int i=0; i<list.size(); i++) {
			/* System.out.println(list.get(i).getBusi_gb().substring(0, 1)); */
			switch(list.get(i).getBusi_gb().substring(0,1)) { 
				case "A" : 
				/* list.get(i).setBusi_gb("회계관리"); */
					list.get(i).setId(list.get(i).getBusi_gb().substring(1));
					list.get(i).setPid("3");
					list.get(i).setName(list.get(i).getLevel1_nm());
					break; 
				case "E" :
					list.get(i).setBusi_gb("경영정보");
					list.get(i).setId(list.get(i).getBusi_gb().substring(1));
					list.get(i).setPid("5");
					list.get(i).setName(list.get(i).getLevel1_nm());
					break;
				case "H" :
					list.get(i).setBusi_gb("인력관리");
					list.get(i).setId(list.get(i).getBusi_gb().substring(1));
					list.get(i).setPid("4");
					list.get(i).setName(list.get(i).getLevel1_nm());
					break;
				case "J" :
					list.get(i).setBusi_gb("사업성검토/MH/계약프로젝트");
					list.get(i).setId(list.get(i).getBusi_gb().substring(1));
					list.get(i).setPid("1");
					list.get(i).setName(list.get(i).getLevel1_nm());
					break;
				case "P" :
					list.get(i).setBusi_gb("설계정보"); 
					list.get(i).setId(list.get(i).getBusi_gb().substring(1));
					list.get(i).setPid("2");
					list.get(i).setName(list.get(i).getLevel1_nm());
					break;
				case "S" :
					list.get(i).setBusi_gb("시스템관리");
					list.get(i).setId(list.get(i).getBusi_gb().substring(1));
					list.get(i).setPid("6");
					list.get(i).setName(list.get(i).getLevel1_nm());
					break;		
			}
		}
		return list;
	}
}
