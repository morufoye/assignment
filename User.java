package com.assignment.assignment;


import org.springframework.data.mongodb.core.mapping.Document;


import javax.persistence.Id;

@Document("User")
public class User{
    @Id
    private String id;
    private String username;
    private String phone;
    private String email;
    @Id
    private String addressId;
    private Address address;
    private final AddressRepository addressRepository;


    public User(AddressRepository addressRepository, String id, String username, String phone, String email, String addressId) {
        super();
        this.id = id;
        this.username = username;
        this.phone = phone;
        this.email = email;
        this.addressRepository = addressRepository;
        this.address = addressRepository.findAddressesByAddressId(addressId);
    }
}