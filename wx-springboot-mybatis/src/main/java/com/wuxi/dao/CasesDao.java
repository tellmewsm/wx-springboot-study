package com.wuxi.dao;

import com.wuxi.domain.Cases;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
* @author wuxi
* @date 2018年6月27日
* 标志为 Mybatis 的 Mapper
 */
@Mapper
@Repository
public interface CasesDao {

    /**
     * 保存用例
     * @param cases
     */
    Long SaveCases(Cases cases);
    
    List<Cases> findAllCases();
    
    int deleteCases(int id);

    int updateByPrimaryKey(Cases cases);

/*    @Select("SELECT * FROM cases where id = #{id}")
    // 返回 Map 结果集
    @Results({
            @Result(property = "id", column = "id"),
            @Result(property = "project", column = "project"),
            @Result(property = "status", column = "status"),
            @Result(property = "domain", column = "domain"),
            @Result(property = "requesttype", column = "requesttype"),
            @Result(property = "parametertype", column = "parametertype"),
            @Result(property = "content", column = "content"),
            @Result(property = "result", column = "result")
    })*/
    Cases findCasesById(@Param("id") int id);
    
}