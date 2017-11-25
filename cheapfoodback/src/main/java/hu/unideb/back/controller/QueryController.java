package hu.unideb.back.controller;

import hu.unideb.back.service.QueryService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class QueryController {
    private static final Logger logger = LoggerFactory.getLogger(QueryController.class);
    @Autowired
    private QueryService queryService;
    @RequestMapping(value = "/query1", method = RequestMethod.GET)
    public @ResponseBody
    String findIngredientsByIdAndmennyisegnev() {
        Long Id = Long.valueOf(1);
        return queryService.findIngredientsByIdAndmennyisegnev(Id);
    }

}
