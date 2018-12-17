package com.carshopwebapp.services;

import com.carshopwebapp.entitities.Repair;
import com.carshopwebapp.repository.RepairRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service //service layer class-bean
public class RepairServiceImpl implements RepairService {
    //this class will have the following methods: SAVE, UPDATE, DELETE

    @Autowired
    private RepairRepository repository2;//add the dependency
    //create getter+setter for repository to be able to use i


    public RepairRepository getRepository2() {
        return repository2;
    }

    public void setRepository2(RepairRepository repository2) {
        this.repository2 = repository2;
    }

    @Override
    public Repair saveRepair(Repair repair) { //new owner
        return repository2.save(repair);
    }

    @Override
    public Repair updateRepair(Repair repair) { //update owner
        return repository2.save(repair);
    }

    @Override
    public void deleteRepair(Repair repair) { //delete owner
        repository2.delete(repair);
    }

    @Override
    public Repair getRepairbyId(int id) {
        return repository2.findById(id).orElse(null);
    }

    @Override
    public List<Repair> getAllRepairs() {
        return repository2.findAll();
    }

    @Override
    public List<Repair>  getfindByIdEquals(int id){return repository2.findByIdEquals(id);}

    @Override
    public List<Repair> getFirst10Repairs(String date) {
        return repository2.findTop10ByDateLike(date);
    }

}
