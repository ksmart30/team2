package com.cafe24.ksmart30.team02.baseinfo.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.cafe24.ksmart30.team02.baseinfo.vo.ControlItemCode;

@Mapper
public interface ControlItemCodeMapper {
	//ControlItemCodeList추상메서드 선언
	List<ControlItemCode> ControlItemCodeList();
	
}
