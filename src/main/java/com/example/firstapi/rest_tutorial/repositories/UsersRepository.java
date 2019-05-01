package com.example.firstapi.rest_tutorial.repositories;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.firstapi.rest_tutorial.models.Users;

public interface UsersRepository extends MongoRepository<Users, String> {
	Users findBy_id(ObjectId _id);
}
