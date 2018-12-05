package com.carshopwebapp.Service;

import com.carshopwebapp.entities.Owner;

import java.util.List;

public class OwnerService {
    //this class will have the following methods: SAVE, UPDATE, DELETE


    Owner saveOwner(Owner owner);
    Owner updateOwner(Owner owner);
    void deleteOwner(Owner owner);
    Owner getOwnerbyId(int);
    List<Owner> getAllOwners();



    //|I shall here search afm,email
}
