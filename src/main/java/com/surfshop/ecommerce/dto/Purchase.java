package com.surfshop.ecommerce.dto;

import com.surfshop.ecommerce.entity.Address;
import com.surfshop.ecommerce.entity.Customer;
import com.surfshop.ecommerce.entity.Order;
import com.surfshop.ecommerce.entity.OrderItem;
import lombok.Data;

import java.util.Set;

@Data
public class Purchase {

    private Customer customer;
    private Address shippingAddress;
    private Address billingAddress;
    private Order order;
    private Set<OrderItem> orderItems;

}
