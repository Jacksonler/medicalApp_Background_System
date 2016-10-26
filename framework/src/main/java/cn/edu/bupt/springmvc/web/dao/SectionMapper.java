package cn.edu.bupt.springmvc.web.dao;

import cn.edu.bupt.springmvc.web.model.Doctor;
import cn.edu.bupt.springmvc.web.model.Section;
import cn.edu.bupt.springmvc.web.model.SectionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SectionMapper {
	
	List<Doctor> selectSectionDoctorsBySectionId(String sectionId);
    int countByExample(SectionExample example);

    int deleteByExample(SectionExample example);

    int deleteByPrimaryKey(String sectionid);

    int insert(Section record);

    int insertSelective(Section record);

    List<Section> selectByExample(SectionExample example);

    Section selectByPrimaryKey(String sectionid);

    int updateByExampleSelective(@Param("record") Section record, @Param("example") SectionExample example);

    int updateByExample(@Param("record") Section record, @Param("example") SectionExample example);

    int updateByPrimaryKeySelective(Section record);

    int updateByPrimaryKey(Section record);
}