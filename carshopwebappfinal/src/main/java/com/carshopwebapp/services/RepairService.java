package com.carshopwebapp.services;

import com.carshopwebapp.entitities.Repair;

import java.util.List;

public interface RepairService {
    //save,update,delete, get  by id

    Repair saveRepair(Repair repair);//new repair

    Repair updateRepair(Repair repair); //update repair

    void deleteRepair(Repair repair);//delete repair

    Repair getRepairbyId(int id);

    List<Repair> getAllRepairs();

    List<Repair> getfindByIdEquals(int id);

    List<Repair> getFirst10Repairs(String date);

}