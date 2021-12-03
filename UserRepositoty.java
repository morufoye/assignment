package com.assignment.assignment;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;

interface UserRepository extends MongoRepository<User, String> {

    @Query(value="{category:'?0'}", fields="{'id' : 1, 'username' : 1, 'phone' : 1, 'email' : 1, 'address : {'id : 1', 'city': 1, 'street' : 1, 'zipcode' : 1}'}}")
    List<User> findAll();

}