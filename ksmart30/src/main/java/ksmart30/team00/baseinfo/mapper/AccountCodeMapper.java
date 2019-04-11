/* 10.2.5.계정과목코드
 * @file     AccountCodeMapper.java
 * @brief    계정과목코드 MapperInterface
 * @author  ksmart30 박찬업
 */
package ksmart30.team00.baseinfo.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import ksmart30.team00.baseinfo.domain.AccountCodeDomain;
import ksmart30.team00.baseinfo.domain.ControlItemCodeDomain;

@Mapper
public interface AccountCodeMapper {
	// 10.2.5.계정과목코드
	/* @brief  계정과목리스트를 조회하는 추상메서드 선언
	 * @return  List<AccountCode>
	 */
	List<AccountCodeDomain> selectAccountCodeList();
	// 10.2.5.계정과목코드
	/* @brief  관리항목을 조회하는 추상메서드 선언
	 * @return  List<AccountCode>
	 */
	List<ControlItemCodeDomain> selectControlItemCodeList();
	
	
}
