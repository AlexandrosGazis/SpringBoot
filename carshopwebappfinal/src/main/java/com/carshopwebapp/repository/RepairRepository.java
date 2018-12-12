package com.carshopwebapp.repository;

import com.carshopwebapp.entitities.Repair;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RepairRepository extends JpaRepository<Repair, Integer> {
    //be carefull for the owner to import the correct package
    //<..., Integer> due to the Location.class @id which is int ;)
}
