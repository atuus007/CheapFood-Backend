package hu.unideb.back.controller;

import hu.unideb.back.model.Querys;
import hu.unideb.back.service.query.QueryService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class QueryController {
    private static final Logger logger = LoggerFactory.getLogger(QueryController.class);
    @Autowired
    private QueryService queryService;
    @RequestMapping(value = "/query/{id}", method = RequestMethod.GET)
    public @ResponseBody

    List<Querys> findIngredientsById (@PathVariable("id") long id) {
           return queryService.findIngredientsById(id);
    }
}
