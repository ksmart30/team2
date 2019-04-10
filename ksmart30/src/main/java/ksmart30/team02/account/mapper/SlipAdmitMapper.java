package ksmart30.team02.account.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import ksmart30.team02.account.domain.SlipAdmit;
@Mapper
public interface SlipAdmitMapper {

	List<SlipAdmit> slipAdmitList(SlipAdmit slipAdmit);
	
	List<SlipAdmit> slipAdmitList2(SlipAdmit slipAdmit);
	
}
