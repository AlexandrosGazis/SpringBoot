package com.carshopwebapp.repository;


import com.carshopwebapp.entitities.Owner;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OwnerRepository extends JpaRepository<Owner, Integer> {
    //be carefull for the owner to import the correct package
    //<..., Integer> due to the Location.class @id which is int ;)
}