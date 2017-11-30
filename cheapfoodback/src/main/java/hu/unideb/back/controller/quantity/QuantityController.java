package hu.unideb.back.controller.quantity;


import hu.unideb.back.controller.food.converter.CreateFoodRequest;
import hu.unideb.back.controller.food.converter.UpdateFoodRequest;
import hu.unideb.back.controller.quantity.converter.CreateQuantityRequest;
import hu.unideb.back.controller.quantity.converter.UpdateQuantityRequest;
import hu.unideb.back.model.Quantity;
import hu.unideb.back.service.quantity.QuantityService;
import hu.unideb.back.service.quantity.converter.CreateQuantityRequestConverter;
import hu.unideb.back.service.quantity.converter.UpdateQuantityRequestConverter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;


@RestController
@RequestMapping("/api")
public class QuantityController {
    private static final Logger logger = LoggerFactory.getLogger(QuantityController.class);

    @Autowired
    private QuantityService quantityService;


    @RequestMapping(value = "/quantitylist", method = RequestMethod.GET)
    public @ResponseBody ResponseEntity<?> getAllQuantity() {
        logger.debug("Quantity AAAAAAAAAAAAAAAAAAAAAAAAAAAAA ");
        return new ResponseEntity<>(quantityService.getAllQuantity(), HttpStatus.OK);
    }

    @RequestMapping("/savequantity")
    public ResponseEntity<?> saveQuantity(@RequestBody CreateQuantityRequest createQuantityRequest){
        logger.debug("Quantity Save ");
        quantityService.saveQuantity(createQuantityRequest);
        return new ResponseEntity<>(quantityService.getAllQuantity(), HttpStatus.OK);
    }
    @RequestMapping("/updatequantity")
    public ResponseEntity<?> updateQuantity(@RequestBody UpdateQuantityRequest updateQuantityRequest){
        logger.debug("Quantity Update ");
        if (quantityService.updateQuantity(updateQuantityRequest)) {
            return new ResponseEntity<>(quantityService.getAllQuantity(), HttpStatus.OK);
        }else{
            return new ResponseEntity<>(quantityService.getAllQuantity(), HttpStatus.BAD_REQUEST);
        }
    }
    @RequestMapping("/{quantityId}/delete")
    public ResponseEntity<?> deleteFood(@PathVariable(value = "quantityId") long id){
        logger.info("DELELEELELEELTE: "+id);
        if(quantityService.deleteQuantity(id)){
            return new ResponseEntity<>(quantityService.getAllQuantity(), HttpStatus.OK);
        }else{
            return new ResponseEntity<>(quantityService.getAllQuantity(), HttpStatus.BAD_REQUEST);
        }
    }
}
