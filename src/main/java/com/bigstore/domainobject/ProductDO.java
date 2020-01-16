package com.bigstore.domainobject;

import java.math.BigDecimal;

/**
 * @author anil
 */
public class ProductDO {
    private Long id;
    private String sku;
    private String name;
    private String description;
    private CategoryDO category;
    private BigDecimal price;
}
