package ksmart30.team02.account.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import ksmart30.team00.baseinfo.domain.AccountCode;

@Mapper
public interface SlipDetailMapper {
	List<AccountCode> getAccountCodeList(String account);
}
