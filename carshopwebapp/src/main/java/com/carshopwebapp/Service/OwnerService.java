package com.carshopwebapp.Service;

import com.carshopwebapp.entities.Owner;

import java.util.List;

public interface OwnerService {
    //save,update,delete, get location by id

    Owner saveOwner(Owner owner); //new owner
    Owner updateOwner(Owner owner); //update owner
    void deleteOwner(Owner owner); //delete owner
    Owner getOwnerbyId(int id);
    List<Owner> getAllOwners();



    //
    }