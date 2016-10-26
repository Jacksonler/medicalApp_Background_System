package cn.edu.bupt.springmvc.web.dao;

import cn.edu.bupt.springmvc.web.model.Interest;
import cn.edu.bupt.springmvc.web.model.InterestExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface InterestMapper {
    int countByExample(InterestExample example);

    int deleteByExample(InterestExample example);

    int deleteByPrimaryKey(String id);

    int insert(Interest record);

    int insertSelective(Interest record);

    List<Interest> selectByExample(InterestExample example);

    Interest selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") Interest record, @Param("example") InterestExample example);

    int updateByExample(@Param("record") Interest record, @Param("example") InterestExample example);

    int updateByPrimaryKeySelective(Interest record);

    int updateByPrimaryKey(Interest record);
}