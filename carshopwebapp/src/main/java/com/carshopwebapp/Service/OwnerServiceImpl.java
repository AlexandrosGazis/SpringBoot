package com.carshopwebapp.Service;


import com.carshopwebapp.repository.OwnerRepository;
import com.carshopwebapp.entities.Owner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service //service layer class-bean
public class OwnerServiceImpl implements OwnerService {
    //this class will have the following methods: SAVE, UPDATE, DELETE

    @Autowired
    private OwnerRepository repository;//add the dependency
    //create getter+setter for repository to be able to use i

    public OwnerRepository getRepository() {
        return repository;
    }

    public void setRepository(OwnerRepository repository) {
        this.repository = repository;
    }

    @Override
    public Owner saveOwner(Owner owner) { //new owner
        return repository.save(owner);
    }

    @Override
    public Owner updateOwner(Owner owner) { //update owner
        return repository.save(owner);
    }

    @Override
    public void deleteOwner(Owner owner) { //delete owner
        repository.delete(owner);
    }

    @Override
    public Owner getOwnerbyId(int id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public List<Owner> getAllOwners() {
        return repository.findAll();
        //changed OnwnerRepository to .org.spring.Jpa from crud in order to return a list and not an iterable
    }



    //|I shall here search afm,email
}
