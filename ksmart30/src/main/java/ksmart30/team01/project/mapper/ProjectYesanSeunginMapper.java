package ksmart30.team01.project.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ProjectYesanSeunginMapper {
	public List<Map<String, String>> projectManageSelect();
}
