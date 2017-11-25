package hu.unideb.back.controller;


import hu.unideb.back.model.Genelogy;
import hu.unideb.back.service.GenelogyService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;


@RestController
public class GenelogyController {
    private static final Logger logger = LoggerFactory.getLogger(GenelogyController.class);
    @Autowired
    private GenelogyService genelogyService;

    @RequestMapping(value = "/genelogylist", method = RequestMethod.GET)
    public @ResponseBody
    List<Genelogy> getFoods() {
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        Date date = new Date();
        logger.debug("GenenlogyAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAa " + dateFormat.format(date));
        return genelogyService.findAll();
    }
}
