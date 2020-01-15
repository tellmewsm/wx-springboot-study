package com.wuxi.service.impl;

import com.wuxi.dao.CasesDao;
import com.wuxi.domain.Cases;
import com.wuxi.service.CasesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import java.util.List;

/**
 * @author wuxi
 * @date 2018年6月28日
 */
@Service
public class CasesServiceImpl implements CasesService {

    @Autowired
    private CasesDao caseDao;

    @Override
    public Long SaveCases(Cases cases) {

        return caseDao.SaveCases(cases);
    }

    @Override
    public List<Cases> findAllCases() {

        return caseDao.findAllCases();
    }

    @Override
    //@Cacheable(cacheNames = "case", key = "'case_'+#id") //id不是string 需要加个前缀
    public Cases findCasesById(int id) {

        System.out.println("查询" + id + "测试用例");

        //再次查询，不查找库，直接从redis查询
        return caseDao.findCasesById(id);
    }

    @Override
    //@CacheEvict(cacheNames = "case", allEntries = true) //会清空该case所有缓存，allEntries=true:删除缓存中的所有数据
    public int deleteCases(int id) {

        return caseDao.deleteCases(id);
    }

    @Override
    //@CachePut(cacheNames = "case", key = "'case_'+#cases.id")
    //@CacheEvict(cacheNames = "case", allEntries = true) //更新修改都清空redis，否则需要更改返回类型map
    public int updateByPrimaryKey(Cases cases) {

        return caseDao.updateByPrimaryKey(cases);

    }

}
