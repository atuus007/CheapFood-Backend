package hu.unideb.back.service.quantity;

import hu.unideb.back.controller.food.converter.CreateFoodRequest;
import hu.unideb.back.controller.food.converter.UpdateFoodRequest;
import hu.unideb.back.controller.quantity.converter.CreateQuantityRequest;
import hu.unideb.back.controller.quantity.converter.QuantityResponse;
import hu.unideb.back.controller.quantity.converter.UpdateQuantityRequest;
import hu.unideb.back.model.Quantity;
import java.util.List;
import java.util.Optional;

public interface QuantityService {

    List<QuantityResponse> getAllQuantity();
    void saveQuantity(CreateQuantityRequest createQuantityRequest);
    boolean deleteQuantity(long id);
    boolean updateQuantity(UpdateQuantityRequest updateQuantityRequest);

}
