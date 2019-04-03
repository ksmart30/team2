package com.cafe24.ksmart30.team02.baseinfo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cafe24.ksmart30.team02.baseinfo.mapper.ControlItemCodeMapper;
import com.cafe24.ksmart30.team02.baseinfo.vo.ControlItemCode;

@Service
public class ControlItemCodeService {
@Autowired
ControlItemCodeMapper controlItemCodeMapper;
	public List<ControlItemCode> ControlItemCodeList() {
		System.out.println("02 단위테스트");
		List<ControlItemCode> controlItemCode = controlItemCodeMapper.ControlItemCodeList();
		System.out.println("controlItemCode : " + controlItemCode);
		return controlItemCode;
	}
}
