package ksmart30.team01.business.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import ksmart30.team01.business.domain.BusinessOutput;

@Mapper
public interface BusinessYesanOutputMapper {
	
	//부서리스트
	List<Map<String,String>> businessOutputList();
	
	//프로젝트코드 코드로만조회
	List<BusinessOutput> businessSearchList(BusinessOutput businessOutput);
	//프로젝트코드 전체조회
	List<BusinessOutput> businessSearchList2();
	//프로젝트코드명 조회
	List<BusinessOutput> businessSearchList3(BusinessOutput businessOutput);
	//사업성검토 리스트출력
	List<BusinessOutput> businessList(BusinessOutput businessOutput);
	//사업성검토 리스트출력(radio버튼)
	List<BusinessOutput> businessList2(BusinessOutput businessOutput);
	
}
