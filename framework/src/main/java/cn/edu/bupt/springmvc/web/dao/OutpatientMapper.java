package cn.edu.bupt.springmvc.web.dao;

import cn.edu.bupt.springmvc.web.model.Outpatient;
import cn.edu.bupt.springmvc.web.model.OutpatientExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OutpatientMapper {
    int countByExample(OutpatientExample example);

    int deleteByExample(OutpatientExample example);

    int deleteByPrimaryKey(String outpatientid);

    int insert(Outpatient record);

    int insertSelective(Outpatient record);

    List<Outpatient> selectByExample(OutpatientExample example);

    Outpatient selectByPrimaryKey(String outpatientid);

    int updateByExampleSelective(@Param("record") Outpatient record, @Param("example") OutpatientExample example);

    int updateByExample(@Param("record") Outpatient record, @Param("example") OutpatientExample example);

    int updateByPrimaryKeySelective(Outpatient record);

    int updateByPrimaryKey(Outpatient record);
}