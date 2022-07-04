package com.webapp.ecommerce.dtos;

import com.webapp.ecommerce.entities.Address;
import com.webapp.ecommerce.entities.Customer;
import com.webapp.ecommerce.entities.Order;
import com.webapp.ecommerce.entities.OrderItem;
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
