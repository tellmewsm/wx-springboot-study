package com.wuxi.controllar;

import com.wuxi.domain.Cases;
import com.wuxi.service.CasesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author wuxi
 * @date 2018年6月28日
 */
@CrossOrigin
@RestController
public class CasesRestController {

    @Autowired
    private CasesService casesService;

    @RequestMapping(value = "/cases/add", method = RequestMethod.POST)
    public void createCity(@RequestBody Cases cases) {
        casesService.SaveCases(cases);
    }

    @RequestMapping(value = "/cases", method = RequestMethod.GET)
    public List<Cases> findAllCases() {
        return casesService.findAllCases();
    }

    // http://localhost:8080/cases/id?id=2
    @RequestMapping(value = "/cases/id", method = RequestMethod.GET)
    public Cases findOneCase(@RequestParam(value = "id", required = true) int id) {
        return casesService.findCasesById(id);
    }

    @RequestMapping(value = "/cases/update", method = RequestMethod.PUT)
    public void updateByPrimaryKey(@RequestBody Cases cases) {
        casesService.updateByPrimaryKey(cases);
    }

    @RequestMapping(value = "/cases/id/{id}", method = RequestMethod.DELETE)
    public void deleteCases(@PathVariable("id") int id) {
        casesService.deleteCases(id);
    }

}
