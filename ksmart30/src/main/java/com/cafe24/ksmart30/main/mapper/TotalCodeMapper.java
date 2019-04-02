package com.cafe24.ksmart30.main.mapper;

import org.apache.ibatis.annotations.Mapper;
import java.util.*;
import com.cafe24.ksmart30.main.vo.TotalCode;

@Mapper
public interface TotalCodeMapper {
	List<TotalCode> selectTotalCodeList();
}
