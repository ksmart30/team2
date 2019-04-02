package com.cafe24.ksmart30.team02.account.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cafe24.ksmart30.team02.account.mapper.PurchaseDebtMapper;
import com.cafe24.ksmart30.team02.baseinfo.vo.PurchaseDebt;
@Service
@Transactional
public class PurchaseDebtService {
	@Autowired
	private PurchaseDebtMapper purchaseDebtMapper;
	
	public List<PurchaseDebt> purchaseDebtList(){
		List<PurchaseDebt> purchaseDebt = purchaseDebtMapper.purchaseDebtList();
		
		return purchaseDebt;
		
	}
	
}
