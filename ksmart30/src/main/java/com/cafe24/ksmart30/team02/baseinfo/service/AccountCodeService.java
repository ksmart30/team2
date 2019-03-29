package com.cafe24.ksmart30.team02.baseinfo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cafe24.ksmart30.team02.baseinfo.mapper.AccountCodeMapper;
import com.cafe24.ksmart30.team02.baseinfo.vo.AccountCode;

@Service
public class AccountCodeService {
	@Autowired
	AccountCodeMapper accountcodemapper;
	//list테스트
	public List<AccountCode> getAccountCodeList(){
		System.out.println("list테스트 getAccountCodeList AccountCodeService.java");
		List<AccountCode> list = accountcodemapper.selectAccountCodeList();
		for(int i=0; i<list.size(); i++) {
			if(list.get(i).getAccClas() == "1") {
				list.get(i).setAccClas("자산");
			}
			
		}
		return list;
	}
	
}
