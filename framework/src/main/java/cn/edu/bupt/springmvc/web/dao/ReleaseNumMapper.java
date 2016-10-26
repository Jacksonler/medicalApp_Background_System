package cn.edu.bupt.springmvc.web.dao;

import cn.edu.bupt.springmvc.web.model.ReleaseNum;
import cn.edu.bupt.springmvc.web.model.ReleaseNumExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ReleaseNumMapper {
    int countByExample(ReleaseNumExample example);

    int deleteByExample(ReleaseNumExample example);

    int deleteByPrimaryKey(String realseid);

    int insert(ReleaseNum record);

    int insertSelective(ReleaseNum record);

    List<ReleaseNum> selectByExample(ReleaseNumExample example);

    ReleaseNum selectByPrimaryKey(String realseid);

    int updateByExampleSelective(@Param("record") ReleaseNum record, @Param("example") ReleaseNumExample example);

    int updateByExample(@Param("record") ReleaseNum record, @Param("example") ReleaseNumExample example);

    int updateByPrimaryKeySelective(ReleaseNum record);

    int updateByPrimaryKey(ReleaseNum record);
}