package com.bigstore.datatransferobject;

import java.math.BigDecimal;

/**
 * @author anil
 */
public class ProductDTO {
    private Long id;
    private String sku;
    private String name;
    private String description;
    private CategoryDTO category;
    private BigDecimal price;
}
