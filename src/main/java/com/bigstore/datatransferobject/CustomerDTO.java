package com.bigstore.datatransferobject;

import lombok.Data;

/**
 * @author anil
 */
@Data
public class CustomerDTO {
    private Long id;
    private String firstName;
    private String lastName;
    private String email;
    private String phoneNumber;
}
