package com.surfshop.ecommerce.service;

import com.surfshop.ecommerce.dto.Purchase;
import com.surfshop.ecommerce.dto.PurchaseResponse;

public interface CheckoutService {

    PurchaseResponse placeOrder(Purchase purchase);
}
