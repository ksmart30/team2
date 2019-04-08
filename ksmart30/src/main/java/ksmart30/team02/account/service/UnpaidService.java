package ksmart30.team02.account.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ksmart30.team02.account.domain.UnpaidDomain;
import ksmart30.team02.account.mapper.UnpaidMapper;

@Service
@Transactional
public class UnpaidService {
@Autowired
UnpaidMapper unpaidMapper;
public List<UnpaidDomain> unpaidView(){
	List<UnpaidDomain> unpaid = unpaidMapper.getUnpaidContentsList();
	System.out.println(unpaid.toString() +"<--hihihihihihi");
	return unpaid;
}
}
