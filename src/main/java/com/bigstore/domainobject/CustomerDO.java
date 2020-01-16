package com.bigstore.domainobject;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * @author anil
 */
@Data
@Entity
public class CustomerDO {
    @Id
    @GeneratedValue
    private Long id;
    /**
     * Customer firstName
     */
    @Column(nullable = false)
    private String firstName;
    /**
     * Customer lastName
     */
    @Column(nullable = false)
    private String lastName;
    /**
     * Customer email
     */
    @Column(nullable = false)
    private String email;
    /**
     * Customer phoneNumber
     */
    @Column(nullable = false)
    private String phoneNumber;

    private CustomerDO() {
    }

    public CustomerDO(Long id, String firstName, String lastName, String email, String phoneNumber) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

}
