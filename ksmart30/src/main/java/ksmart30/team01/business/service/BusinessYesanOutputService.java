package ksmart30.team01.business.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ksmart30.team01.business.domain.BusinessOutput;
import ksmart30.team01.business.mapper.BusinessYesanOutputMapper;

@Service
public class BusinessYesanOutputService {
	@Autowired
	BusinessYesanOutputMapper businessYesanOutputMapper;
	
	//부서리스트
	public List<Map<String,String>> businessOutputList(){
		System.out.println("businessOutputList BusinessYesanOutputService.java");
		List<Map<String,String>> outputList = businessYesanOutputMapper.businessOutputList();
		return outputList;
	}
	//프로젝트코드 조회
	public List<BusinessOutput> businessSearchList(BusinessOutput businessOutput){
		System.out.println("businessSearchList BusinessYesanOutputService.java");
		List<BusinessOutput> businessList = null;
		if(businessOutput.getPJT_CD() == null) {
			if(businessOutput.getPJT_NM() != "") {
				businessList = businessYesanOutputMapper.businessSearchList3(businessOutput);
				System.out.println(businessList+"<--businessList 서비스 리턴가즈아!!");
			} else if(businessOutput.getPJT_NM() == "") {
				businessList = businessYesanOutputMapper.businessSearchList2();
				System.out.println(businessList+"<--businessList 서비스 리턴가즈아!!");
			}
		} else if(businessOutput.getPJT_NM() == null) {
			if(businessOutput.getPJT_CD() != "") {
				businessList = businessYesanOutputMapper.businessSearchList(businessOutput);
				System.out.println(businessList+"<--businessList 서비스 리턴가즈아!!");
			} else if(businessOutput.getPJT_CD() == "") {
				businessList = businessYesanOutputMapper.businessSearchList2();
				System.out.println(businessList+"<--businessList 서비스 리턴가즈아!!");
			}
		}
		return businessList;
	}
	//사업성코드 리스트 출력
	public List<BusinessOutput> businessList(BusinessOutput businessOutput){
		System.out.println("사업성코드 리스트 출력 서비스 businessList BusinessYesanOutputService.java");
		List<BusinessOutput> list = null;
		if(businessOutput.getPJT_CD() == "") {
			list = businessYesanOutputMapper.businessList(businessOutput);
		}else {
			String pjtCode = businessOutput.getPJT_CD().substring(0,5);
			businessOutput.setPJT_CD(pjtCode);
			System.out.println(businessOutput.getPJT_CD());
			list = businessYesanOutputMapper.businessList(businessOutput);
		}

		System.out.println(list+"<--사업성코드리스트 서비스리퇀!!");
		for(int i=0; i<list.size(); i++) {
			businessOutput = list.get(i);
			String pjtCd =  businessOutput.getPJT_CD();
			String pjtType =  businessOutput.getPJT_TYPE();
			String pjtCdType = pjtCd+pjtType;
			businessOutput.setPJT_CD(pjtCdType);
		}
		return list;
	}
	//사업성코드 리스트(라디오)
	public List<BusinessOutput> businessList2(BusinessOutput businessOutput){
		System.out.println("사업성코드 리스트 출력(라디오) 서비스 businessList BusinessYesanOutputService.java");
		List<BusinessOutput> list = null;
		list = businessYesanOutputMapper.businessList2(businessOutput);
		for(int i=0; i<list.size(); i++) {
			businessOutput = list.get(i);
			String pjtCd =  businessOutput.getPJT_CD();
			String pjtType =  businessOutput.getPJT_TYPE();
			String pjtCdType = pjtCd+pjtType;
			businessOutput.setPJT_CD(pjtCdType);
		}
		if(businessOutput.getACT_STAT() == "") {
			list = businessYesanOutputMapper.businessList(businessOutput);
			for(int i=0; i<list.size(); i++) {
				businessOutput = list.get(i);
				String pjtCd =  businessOutput.getPJT_CD();
				String pjtType =  businessOutput.getPJT_TYPE();
				String pjtCdType = pjtCd+pjtType;
				businessOutput.setPJT_CD(pjtCdType);
			}
			
		}
		return list;
	}
}
