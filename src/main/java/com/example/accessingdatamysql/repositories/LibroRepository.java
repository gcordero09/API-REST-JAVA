package com.example.accessingdatamysql.repositories;

import org.springframework.data.repository.CrudRepository;

import com.example.accessingdatamysql.models.LibroModel;

// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete

public interface LibroRepository extends CrudRepository<LibroModel, Integer> {

}