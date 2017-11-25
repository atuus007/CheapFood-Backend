package hu.unideb.back.controller.quantity;


import hu.unideb.back.model.Quantity;
import hu.unideb.back.service.quantity.QuantityService;
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
public class QuantityController {
    private static final Logger logger = LoggerFactory.getLogger(QuantityController.class);
    @Autowired
    private QuantityService quantityService;

    @RequestMapping(value = "/quantitylist", method = RequestMethod.GET)
    public @ResponseBody
    List<Quantity> getFoods() {
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        Date date = new Date();
        logger.debug("QuantityAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAa " + dateFormat.format(date));
        return quantityService.findAll();

    }
}
