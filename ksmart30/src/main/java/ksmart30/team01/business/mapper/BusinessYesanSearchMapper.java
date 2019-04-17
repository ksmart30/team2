package ksmart30.team01.business.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import ksmart30.team01.business.domain.Business;
@Mapper
public interface BusinessYesanSearchMapper {
	
	//사업성검토 검색2
		List<Business> businessOutputSearch2();
}
