package hu.unideb.back.service.quantity;

import hu.unideb.back.controller.quantity.converter.CreateQuantityRequest;
import hu.unideb.back.controller.quantity.converter.QuantityResponse;
import hu.unideb.back.controller.quantity.converter.UpdateQuantityRequest;
import hu.unideb.back.model.Quantity;
import hu.unideb.back.repository.QuantityRepository;
import hu.unideb.back.service.quantity.converter.CreateQuantityRequestConverter;
import hu.unideb.back.service.quantity.converter.QuantityResoponseCoverter;
import hu.unideb.back.service.quantity.converter.UpdateQuantityRequestConverter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;


@Service("quantityService")
public class QuantityServiceImpl implements QuantityService {
    private static final Logger logger = LoggerFactory.getLogger(QuantityServiceImpl.class);
    @Autowired
    private QuantityRepository quantityRepository;

    @Autowired
    private CreateQuantityRequestConverter createQuantityRequestConverter;
    @Autowired
    private UpdateQuantityRequestConverter updateQuantityRequestConverter;
    @Autowired
    private QuantityResoponseCoverter quantityResoponseCoverter;

    @Override
    public List<QuantityResponse> getAllQuantity(){

        logger.debug("findAll Service ");
        return quantityRepository.findAll().stream()
                .map(quantityResoponseCoverter::from).collect(Collectors.toList());
    }

    @Override
    public void saveQuantity(CreateQuantityRequest createQuantityRequest) {
        logger.debug("saveQuantity() Service ");
        Quantity quantity=createQuantityRequestConverter.from(createQuantityRequest);
        quantityRepository.save(quantity);

    }

    @Override
    public boolean deleteQuantity(long id) {
        Optional<Quantity> quantityOptional=quantityRepository.findById(id);
        if(quantityOptional.isPresent()){
            quantityRepository.delete(id);
            return true;
        }else{
            return false;
        }

    }

    @Override
    public boolean updateQuantity(UpdateQuantityRequest updateQuantityRequest) {
        Optional<Quantity> foodOptional = quantityRepository.findById(updateQuantityRequest.getId());
        if(foodOptional.isPresent()){
            quantityRepository.save(updateQuantityRequestConverter.from(updateQuantityRequest));
            return true;

        }else {
            return false;
        }
    }


}
