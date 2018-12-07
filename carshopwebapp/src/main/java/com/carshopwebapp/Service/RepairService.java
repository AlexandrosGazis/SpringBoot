package com.carshopwebapp.Service;

import com.carshopwebapp.entities.Owner;
import com.carshopwebapp.entities.Repair;

import java.util.List;

public interface RepairService {
    //save,update,delete, get  by id

    Repair saveRepair(Repair repair);//new repair
    Repair updateRepair(Repair repair); //update repair
    void deleteRepair(Repair repair);//delete repair
    Repair getRepairbyId(int id);
    List<Repair> getAllRepairs();

    }