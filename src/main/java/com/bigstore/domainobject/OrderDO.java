package com.bigstore.domainobject;

import java.util.Date;

/**
 * @author anil
 */
public class OrderDO {
    private Long orderID;
    private CustomerDO customersDO;
    private String orderNumber;
    private PaymentDO paymentDO;
    private Date orderDate;
    private Date shipDate;
    private ShipperDO shipperDO;


}
