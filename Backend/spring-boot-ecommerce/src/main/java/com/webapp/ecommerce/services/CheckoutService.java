package com.webapp.ecommerce.services;

import com.webapp.ecommerce.dtos.Purchase;
import com.webapp.ecommerce.dtos.PurchaseResponse;

public interface CheckoutService {

    PurchaseResponse placeOrder(Purchase purchase);

}
