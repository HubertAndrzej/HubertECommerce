package com.webapp.ecommerce.services;

import com.stripe.exception.StripeException;
import com.stripe.model.PaymentIntent;
import com.webapp.ecommerce.dtos.PaymentInfo;
import com.webapp.ecommerce.dtos.Purchase;
import com.webapp.ecommerce.dtos.PurchaseResponse;

public interface CheckoutService {

    PurchaseResponse placeOrder(Purchase purchase);

    PaymentIntent createPaymentIntent(PaymentInfo paymentInfo) throws StripeException;

}
