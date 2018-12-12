package com.carshopwebapp.services;


import com.carshopwebapp.entitities.Owner;
import com.carshopwebapp.repository.OwnerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
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
        return repository.findAll(); //changed OnwnerRepository to .org.spring.Jpa from crud in order to return a list and not an iterable
    }

    @Override
    public List<Owner> getOwnersBySurname(String surname) {
        return repository.findByEpitheto(surname);
    }
    @Override
    public List<Owner> getOwnersByAfm(String afm) {
        return repository.findOwnersByAfm(afm);
    }
    @Override
    public List<Owner> getOwnersByEmail(String email) {
        return repository.findOwnersByEmail(email);
    }

}