package ksmart30.team02.account.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ksmart30.team00.baseinfo.domain.AccountCode;
import ksmart30.team02.account.mapper.SlipDetailMapper;

@Service
@Transactional
public class SlipDetailService {
	@Autowired private SlipDetailMapper slipdetailmapper;
	
	public List<AccountCode> getAccountCode(String account){
		List<AccountCode> list = slipdetailmapper.getAccountCodeList(account);
		System.out.println(list.toString());
		return list;
	}
}
