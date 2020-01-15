package com.wuxi.service;

import com.wuxi.domain.Cases;
import java.util.List;

/**
* @author wuxi
* @date 2018年6月28日
 */
public interface CasesService {

    int updateByPrimaryKey(Cases cases);
	
    Long SaveCases(Cases cases);
    
    List<Cases> findAllCases();
    
    Cases findCasesById(int id);

    int deleteCases(int id);

}
