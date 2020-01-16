package com.bigstore.datatransferobject;

import java.util.Date;

/**
 * @author anil
 */
public class OrderDTO {
    private Long orderID;
    private CustomerDTO customersDO;
    private String orderNumber;
    private PaymentDTO paymentDO;
    private Date orderDate;
    private Date shipDate;
    private ShipperDTO shipperDO;


}
