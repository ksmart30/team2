package com.cafe24.ksmart30.team02.baseinfo.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.cafe24.ksmart30.team02.baseinfo.vo.AssetClassifyCode;

@Mapper
public interface AssetClassifyCodeMapper {
	//assetClassifyCodeList추상메서드 선언
	List<AssetClassifyCode> assetClassifyCodeList();
}
