/* 8.1.전표입력
 * @file     SlipMapper.java
 * @brief    전표입력 MapperInterface
 * @author  ksmart30 박찬업
 */
package ksmart30.team02.account.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import ksmart30.team02.account.domain.SlipDetailDomain;
import ksmart30.team02.account.domain.SlipHeaderDomain;


@Mapper
public interface SlipMapper {
	//8.1.전표입력.getSlipInfo메서드
	/* @param  String slip_DATE, String slip_NO 
	 * @brief   전표리스트를 조회하는 추상메서드 선언	   		 	  
	 * @return  List<Slip>
	 */
	List<SlipDetailDomain> getSlipInfo(SlipDetailDomain slipDetailDomain);
	//8.1.전표입력.getSlipHeaderInfo메서드
	/* @param  String slip_DATE, String slip_NO 
	 * @brief   전표기본내용을 조회하는 추상메서드 선언	   		 	  
	 * @return  List<Slip>
	 */
	SlipHeaderDomain getSlipHeaderInfo(SlipDetailDomain slipDetailDomain);
}
