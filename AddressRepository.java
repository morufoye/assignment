package com.assignment.assignment;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;

public interface AddressRepository extends MongoRepository<Address, String> {

    @Query("{add:'?0'}")
    Address findAddressesByAddressId(String id);

}
