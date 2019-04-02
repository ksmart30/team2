package com.cafe24.ksmart30.team02.account.mapper;

import java.util.List;
import com.cafe24.ksmart30.team02.baseinfo.vo.PurchaseDebt;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface PurchaseDebtMapper {
	List<PurchaseDebt> purchaseDebtList();
}
