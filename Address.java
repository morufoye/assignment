package com.assignment.assignment;

import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.Entity;
import javax.persistence.Id;

@Document("Address")
public class Address{

        @Id
        private String addressId;
        private String street;
        private String city;
        private String zipcode;


        public Address(String addressId, String street, String city, String zipcode) {
                super();
                this.addressId = addressId;
                this.street = street;
                this.city = city;
                this.zipcode = zipcode;
        }
}