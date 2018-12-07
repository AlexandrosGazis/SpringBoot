package com.carshopwebapp.repository;

import com.carshopwebapp.entities.Owner;
import org.springframework.data.jpa.repository.JpaRepository; //subrepository of Crud repository

import java.util.List;

public interface OwnerRepository extends JpaRepository<Owner, Integer> {
    //be carefull for the owner to import the correct package
    //<..., Integer> due to the Location.class @id which is int ;)
}
