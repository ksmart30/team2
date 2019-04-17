package ksmart30.team01.business.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ksmart30.team01.business.domain.BusinessOutput;
import ksmart30.team01.business.mapper.BusinessYesanSearchMapper;
@Service
public class BusinessYesanSearchService {
		@Autowired
		BusinessYesanSearchMapper businessYesanSearchMapper;
		
		//사업성코드 검색2
		public List<BusinessOutput> businessOutputSearch2(){
		System.out.println("사업성코드 검색2 서비수! businessOutputSearch2 BusinessYesanOutputService");
		List<BusinessOutput> searchList =  businessYesanSearchMapper.businessOutputSearch2();
		return searchList;
		}
}
