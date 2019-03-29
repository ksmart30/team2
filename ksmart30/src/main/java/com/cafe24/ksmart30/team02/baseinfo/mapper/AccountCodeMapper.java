package com.cafe24.ksmart30.team02.baseinfo.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.cafe24.ksmart30.team02.baseinfo.vo.AccountCode;

@Mapper
public interface AccountCodeMapper {
	
	public List<AccountCode> selectAccountCodeList();
}
