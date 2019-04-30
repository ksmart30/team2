package ksmart30.team01.business.mapper;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface BusinessYesanInputMapper {

	List<Map<String,String>> getDeptList();
	
	List<Map<String,String>> getProjectList(Map<String,Object> map);
	
	List<Map<String,String>> getResultProjectList(Map<String,Object> map);
	
	List<Map<String,String>> getResultEmpList(Map<String,Object> searchMap);
	
	Map<String,Object> getResultProject (String PJT_CD);
	
	Map<String,Object> getProjectSchedule (String PJT_CD);
	
	List<Map<String,Object>> getProjectJejo2 (String PJT_CD);
	
	List<Map<String,Object>> getProjectMhPlan (String PJT_CD);
}
